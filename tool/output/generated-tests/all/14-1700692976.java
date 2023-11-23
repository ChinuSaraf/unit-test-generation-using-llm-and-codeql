
```java
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics;
import org.apache.hadoop.metrics2.MetricsSystem;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.junit.Test;

public class Nfs3MetricsTest {

  @Test
  public void testCreate() {
    Configuration conf = mock(Configuration.class);
    String gatewayName = "gateway";
    String sessionId = "session123";
    MetricsSystem ms = mock(MetricsSystem.class);
    JvmMetrics jm = mock(JvmMetrics.class);
    Nfs3