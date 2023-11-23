
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import org.apache.hadoop.fs.AccessControlException;
import org.apache.hadoop.fs.AbstractFileSystem;
import org.apache.hadoop.fs.AclStatus;
import org.apache.hadoop.fs.BlockLocation;
import org.apache.hadoop.fs.BlockStoragePolicySpi;
import org.apache.hadoop.fs.Configuration;
import org.apache.hadoop.fs.FileChecksum;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsStatus;
import org.apache.hadoop.fs.InodeTree;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.MountPoint;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RenameStrategy;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.hadoop.fs.UnsupportedFileSystemException;

import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class FileStatusTest {

    @Mock
    Configuration config;
    
    @Mock
    InodeTree<AbstractFileSystem> fsState;

    @Test
    public void testGetFileLinkStatus() throws Exception {
        // Mocking the required objects
        Path f = mock(Path.class);
        InodeTree.ResolveResult<AbstractFileSystem> resolveResult = mock(InodeTree.ResolveResult.class);
        AbstractFileSystem targetFileSystem = mock(AbstractFileSystem.class);
        FileStatus expectedFileStatus = mock(FileStatus.class);
        
        // Mocking the function calls and their return values
        when(fsState.resolve(any(), eq(false))).thenReturn(resolveResult);
        when(resolveResult.targetFileSystem).thenReturn(targetFileSystem);
        when(targetFileSystem.getFileLinkStatus(any())).thenReturn(expectedFileStatus);

        // Calling the actual function
        FileStatus actualFileStatus = getFileLinkStatus(f);

        // Verifying the function calls and their parameters
        verify(fsState).resolve(any(), eq(false));
        verify(targetFileSystem).getFileLinkStatus(any());

        // Assert statements to validate the expected and actual results
        assertEquals(expectedFileStatus, actualFileStatus);
    }

    private FileStatus getFileLinkStatus(Path f) throws AccessControlException, 
            FileNotFoundException, UnsupportedFileSystemException, IOException {
        InodeTree.ResolveResult<AbstractFileSystem> res =
            fsState.resolve(getUriPath(f), false);
        return res.targetFileSystem.getFileLinkStatus(res.remainingPath);
    }
}
