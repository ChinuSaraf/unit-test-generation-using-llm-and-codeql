
```
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.HAUtil;
import org.apache.hadoop.hdfs.DFSUtil;
import org.apache.hadoop.hdfs.HadoopIllegalArgumentException;

import java.util.Properties;

public class GetNameNodeIdTest {

    @Mock
    private Configuration mockConf;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetNameNodeIdWhenNamenodeIdNotNull() {
        String expectedNamenodeId = "NN1";
        Mockito.when(mockConf.getTrimmed(Mockito.eq(DFS_HA_NAMENODE_ID_KEY)))
                .thenReturn(expectedNamenodeId);

        String actualNamenodeId = HAUtil.getNameNodeId(mockConf, "nsId");
        
        assertEquals(expectedNamenodeId, actualNamenodeId);
    }

    @Test
    public void testGetNameNodeIdWhenSuffixesNotNull() {
        String[] suffixes = new String[] {"suffix1", "suffix2"};
        Mockito.when(mockConf.getTrimmed(Mockito.eq(DFS_HA_NAMENODE_ID_KEY)))
                .thenReturn(null);
        Mockito.when(DFSUtil.getSuffixIDs(Mockito.eq(mockConf), Mockito.eq(DFS_NAMENODE_RPC_ADDRESS_KEY),
                Mockito.eq("nsId"), Mockito.eq(null), Mockito.eq(DFSUtil.LOCAL_ADDRESS_MATCHER)))
                .thenReturn(suffixes);

        String actualNamenodeId = HAUtil.getNameNodeId(mockConf, "nsId");
        
        assertEquals(suffixes[1], actualNamenodeId);
    }

    @Test(expected=HadoopIllegalArgumentException.class)
    public void testGetNameNodeIdWhenSuffixesNull() {
        Mockito.when(mockConf.getTrimmed(Mockito.eq(DFS_HA_NAMENODE_ID_KEY)))
                .thenReturn(null);
        Mockito.when(DFSUtil.getSuffixIDs(Mockito.eq(mockConf), Mockito.eq(DFS_NAMENODE_RPC_ADDRESS_KEY),
                Mockito.eq("nsId"), Mockito.eq(null), Mockito.eq(DFSUtil.LOCAL_ADDRESS_MATCHER)))
                .thenReturn(null);

        HAUtil.getNameNodeId(mockConf, "nsId");
    }
}
```

