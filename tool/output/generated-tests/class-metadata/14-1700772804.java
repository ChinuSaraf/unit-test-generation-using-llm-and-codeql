
import org.junit.Test;
import static org.mockito.Mockito.*;

public class Nfs3MetricsTest {

    @Test
    public void testCreate() {
        // Mock Configuration
        Configuration conf = mock(Configuration.class);
        when(conf.get(DFSConfigKeys.DFS_METRICS_SESSION_ID_KEY)).thenReturn("session123");

        // Mock MetricsSystem
        MetricsSystem ms = mock(MetricsSystem.class);
        DefaultMetricsSystem.setInstance(ms);

        // Mock JvmMetrics
        JvmMetrics jm = mock(JvmMetrics.class);
        when(JvmMetrics.create(anyString(), anyString(), any(MetricsSystem.class))).thenReturn(jm);

        // Mock Nfs3Metrics
        Nfs3Metrics nfs3Metrics = mock(Nfs3Metrics.class);
        when(ms.register(any(Nfs3Metrics.class))).thenReturn(nfs3Metrics);

        // Call the method under test
        Nfs3Metrics result = Nfs3Metrics.create(conf, "gateway1");

        // Verify the calls
        verify(conf).get(DFSConfigKeys.DFS_METRICS_SESSION_ID_KEY);
        verify(JvmMetrics).create(eq("gateway1"), eq("session123"), eq(ms));
        verify(ms).register(eq(nfs3Metrics));

        // Add assert statements for result
        assertEquals(nfs3Metrics, result);
    }
}
