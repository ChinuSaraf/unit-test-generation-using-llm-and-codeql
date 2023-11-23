
```java
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.viewfs.ViewFs;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.security.UserGroupInformation;

public class MyTestClass {
    private ViewFs viewFs;
    
    @Before
    public void setup() throws IOException {
        Configuration config = new Configuration();
        DistributedFileSystem fs = Mockito.mock(DistributedFileSystem.class);
        Mockito.when(fs.getHomeDirectory()).thenReturn(new Path("/user/testUser"));
        Mockito.when(fs.makeQualified(new Path("/user/testUser"))).thenReturn(new Path("hdfs://localhost/user/testUser"));
        
        viewFs = Mockito.spy(new ViewFs(config));
        Mockito.when(viewFs.getHomeDirectory()).thenReturn(new Path("/user/testUser"));
        Mockito.when(viewFs.getHomeDirPrefixValue()).thenReturn("/user");
        Mockito.when(viewFs.makeQualified(new Path("/user/testUser"))).thenReturn(new Path("viewfs://localhost/user/testUser"));
        Mockito.when(viewFs.makeQualified(new Path("/user/testUser"))).thenReturn(new Path("viewfs://localhost/user/testUser"));
        Mockito.when(viewFs.makeQualified(new Path("/user/testUser"))).thenReturn(new Path("viewfs://localhost/user/testUser"));
        
        UserGroupInformation ugi = Mockito.mock(UserGroupInformation.class);
        Mockito.when(viewFs.getUGI()).thenReturn(ugi);
        Mockito.when(ugi.getShortUserName()).thenReturn("testUser");
        
        viewFs.setFsState(fs);
    }
    
    @Test
    public void testGetHomeDirectory() throws IOException {
        Path expectedPath = new Path("viewfs://localhost/user/testUser");
        Path actualPath = viewFs.getHomeDirectory();
        
        assertEquals(expectedPath, actualPath);
    }
}
```
