
import static org.mockito.Mockito.*;

import org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.apache.hadoop.metrics2.lib.MetricsSystem;
import org.apache.hadoop.metrics2.util.MBeans;
import org.junit.Test;

public class Nfs3MetricsTest {

    @Test
    public void testCreate() throws Exception {
        // Mock the required classes and methods
        Configuration conf = mock(Configuration.class);
        String gatewayName = "testGateway";
        
        when(conf.get(anyString())).thenReturn("sessionId");
        when(conf.getInts(anyString())).thenReturn(new int[]{50, 75, 90, 95, 99});
        
        DefaultMetricsSystem ms = mock(DefaultMetricsSystem.class);
        when(DefaultMetricsSystem.instance()).thenReturn(ms);
        
        JvmMetrics jm = mock(JvmMetrics.class);
        when(JvmMetrics.create(anyString(), anyString(), any(MetricsSystem.class))).thenReturn(jm);
        
        Nfs3Metrics nfs3Metrics = mock(Nfs3Metrics.class);
        when(ms.register(any(Nfs3Metrics.class))).thenReturn(nfs3Metrics);
        
        // Call the function under test
        Nfs3Metrics result = Nfs3Metrics.create(conf, gatewayName);
        
        // Verify that the required methods are called
        verify(conf, times(1)).get(anyString());
        verify(conf, times(1)).getInts(anyString());
        verify(DefaultMetricsSystem.class, times(1)).instance();
        verify(JvmMetrics.class, times(1)).create(anyString(), anyString(), any(MetricsSystem.class));
        verify(MetricsSystem.class, times(1)).register(any(Nfs3Metrics.class));
        
        // Check the result
        assertEquals(nfs3Metrics, result);
    }
}
