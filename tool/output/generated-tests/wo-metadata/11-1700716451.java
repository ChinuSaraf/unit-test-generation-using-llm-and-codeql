
java
import org.junit.Test;
import org.mockito.Mockito;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.HAUtil;

public class GetNameNodeIdTest {
    
    @Test
    public void testGetNameNodeId() {
        // Mock the required objects
        Configuration conf = Mockito.mock(Configuration.class);
        
        // Set the required variables
        String DFS_HA_NAMENODE_ID_KEY = "dfs.ha.namenode.id";
        String DFS_NAMENODE_RPC_ADDRESS_KEY = "dfs.namenode.rpc.address";
        String nsId = "ns1";
        
        // Set up the mock behavior
        Mockito.when(conf.getTrimmed(DFS_HA_NAMENODE_ID_KEY)).thenReturn(null);
        Mockito.when(DFSUtil.getSuffixIDs(conf, DFS_NAMENODE_RPC_ADDRESS_KEY, nsId, null, DFSUtil.LOCAL_ADDRESS_MATCHER))
            .thenReturn(new String[]{"ns1", "nn1"});
        
        // Call the method
        String result = HAUtil.getNameNodeId(conf, nsId);
        
        // Assert the result
        String expected = "nn1";
        assertEquals(expected, result);
    }
}

