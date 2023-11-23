
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics;
import org.apache.hadoop.metrics2.util.MetricQuantile;
import org.apache.hadoop.metrics2.util.Quantile;
import org.apache.hadoop.metrics2.util.QuantileEstimator;
import org.apache.hadoop.metrics2.util.SampleQuantiles;
import org.apache.hadoop.metrics2.util.SampleQuantiles.*;
import org.apache.hadoop.metrics2.impl.MetricsSystemImpl;
import org.apache.hadoop.metrics2.lib.MutableRate;
import org.apache.hadoop.metrics2.lib.MutableCounterLong;
import org.apache.hadoop.metrics2.MetricsRegistry;
import org.apache.hadoop.metrics2.impl.JvmMetrics;
import java.util.Arrays;
import java.util.ArrayList;

public class Nfs3MetricsTest {

  @Test
  public void testAddWrite() {
    // Mock Nfs3Metrics class
    Nfs3Metrics nfs3Metrics = mock(Nfs3Metrics.class);

    // Create Mock MutableQuantiles for writeNanosQuantiles
    MutableQuantiles[] writeNanosQuantiles = new MutableQuantiles[3];
    for (int i = 0; i < writeNanosQuantiles.length; i++) {
      writeNanosQuantiles[i] = mock(MutableQuantiles.class);
    }

    // Set the writeNanosQuantiles in Nfs3Metrics
    when(nfs3Metrics.getWriteNanosQuantiles()).thenReturn(writeNanosQuantiles);

    // Set the initial latencyNanos
    long latencyNanos = 1000L;

    // Call the addWrite method
    nfs3Metrics.addWrite(latencyNanos);

    // Verify that the add method of writeNanosQuantiles are called once
    for (MutableQuantiles quantiles : writeNanosQuantiles) {
      verify(quantiles).add(latencyNanos);
    }
  }

  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("Nfs3MetricsTest");
  }
}
