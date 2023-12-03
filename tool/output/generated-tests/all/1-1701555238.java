
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class GetHomeDirectoryTest {
    
    @Mock
    private Configuration config;
    
    @Mock
    private UserGroupInformation ugi;
    
    @Mock
    private InodeTree<AbstractFileSystem> fsState;
    
    private ViewFs viewFs;
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        viewFs = new ViewFs(config, ugi, fsState);
    }
    
    @Test
    public void testGetHomeDirectory() {
        // Arrange
        String base = "/user";
        String expectedPath = base + "/" + ugi.getShortUserName();
        
        // Mock behavior of fsState.getHomeDirPrefixValue()
        when(fsState.getHomeDirPrefixValue()).thenReturn(base);
        
        // Mock behavior of ugi.getShortUserName()
        when(ugi.getShortUserName()).thenReturn("testUser");
        
        // Act
        Path result = viewFs.getHomeDirectory();
        
        // Assert
        Assert.assertEquals(expectedPath, result.toString());
        
        // Verify the method calls
        verify(fsState).getHomeDirPrefixValue();
        verify(ugi).getShortUserName();
        verifyNoMoreInteractions(fsState, ugi);
    }
}
