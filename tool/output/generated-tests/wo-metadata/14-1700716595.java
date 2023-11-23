
java
import org.junit.Test;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.nfs.nfs3.Nfs3Metrics;
import org.apache.hadoop.hdfs.nfs.nfs3.NfsConfigKeys;
import org.apache.hadoop.metrics2.MetricsSystem;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import static org.mockito.Mockito.*;

public class Nfs3MetricsTest {
    
    // Mocked objects
    Configuration conf = mock(Configuration.class);
    MetricsSystem ms = mock(MetricsSystem.class);
    Nfs3Metrics nfs3Metrics = mock(Nfs3Metrics.class);
    
    @Test
    public void testCreate() {
        // Set up test data
        String gatewayName = "gateway";
        String sessionId = "session001";
        int[] intervals = {50, 75, 90, 95, 99};
        
        // Configure stubs and mocks
        when(conf.get(anyString())).thenReturn(sessionId);
        when(conf.getInts(anyString())).thenReturn(intervals);
        when(DefaultMetricsSystem.instance()).thenReturn(ms);
        when(Nfs3Metrics.create(anyString(), anyString(), any(MetricsSystem.class))).thenReturn(nfs3Metrics);
        
        // Call the method
        Nfs3Metrics result = Nfs3Metrics.create(conf, gatewayName);
        
        // Verify the method calls
        verify(conf).get(NfsConfigKeys.DFS_METRICS_SESSION_ID_KEY);
        verify(conf).getInts(NfsConfigKeys.NFS_METRICS_PERCENTILES_INTERVALS_KEY);
        verify(DefaultMetricsSystem).instance();
        verify(nfs3Metrics).register(nfs3Metrics);
        
        // Assert the results
        assertSame(nfs3Metrics, result);
    }
}

