
java
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.nfs.nfs3.Nfs3Metrics;
import org.apache.hadoop.metrics2.MetricsSystem;
import org.apache.hadoop.metrics2.source.JvmMetrics;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import javax.management.openmbean.CompositeData;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;
import org.apache.hadoop.fs.nfs.nfs3.NfsConfigKeys;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;

public class Nfs3MetricsTest {
    @Test
    public void testCreate() {
        String gatewayName = "testGateway";
        Configuration conf = mock(Configuration.class);
        MetricsSystem ms = mock(MetricsSystem.class);
        JvmMetrics jm = mock(JvmMetrics.class);
        Nfs3Metrics nfs3Metrics = mock(Nfs3Metrics.class);

        when(conf.get(DFSConfigKeys.DFS_METRICS_SESSION_ID_KEY)).thenReturn("testSessionId");
        when(DefaultMetricsSystem.instance()).thenReturn(ms);
        when(JvmMetrics.create(eq(gatewayName), anyString(), eq(ms))).thenReturn(jm);
        when(conf.getInts(NfsConfigKeys.NFS_METRICS_PERCENTILES_INTERVALS_KEY)).thenReturn(new int[]{50, 75, 90, 95, 99});
        when(ms.register(any(Nfs3Metrics.class))).thenReturn(nfs3Metrics);

        Nfs3Metrics result = Nfs3Metrics.create(conf, gatewayName);

        verify(conf).get(DFSConfigKeys.DFS_METRICS_SESSION_ID_KEY);
        verify(DefaultMetricsSystem.instance()).register(eq(nfs3Metrics));
        verify(conf).getInts(NfsConfigKeys.NFS_METRICS_PERCENTILES_INTERVALS_KEY);
        verify(JvmMetrics.create(eq(gatewayName), anyString(), eq(ms)));
        assertSame(nfs3Metrics, result);
    }
}

