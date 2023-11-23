
java
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.registry.client.binding.RegistryUtils;
import org.apache.hadoop.registry.client.types.RegistryPathStatus;
import org.apache.hadoop.registry.client.exceptions.PathNotFoundException;
import org.apache.hadoop.registry.client.exceptions.InvalidPathnameException;
import org.apache.hadoop.registry.client.api.RegistryOperations;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class RegistryUtilsTest {
    
    @Mock
    RegistryOperations registryOperations;
    
    @InjectMocks
    RegistryUtils registryUtils;
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testStatChildren() throws PathNotFoundException, InvalidPathnameException, IOException {
        String path = "test/path";
        List<String> childNames = Arrays.asList("child1", "child2", "child3");
        when(registryOperations.list(path)).thenReturn(childNames);
        
        // Mock registryOperations.stat() for child1 and child2
        RegistryPathStatus stat1 = new RegistryPathStatus();
        stat1.setSize(100);
        stat1.setTime(123456789);
        stat1.setPath(join(path, "child1"));
        when(registryOperations.stat(join(path, "child1"))).thenReturn(stat1);
        
        RegistryPathStatus stat2 = new RegistryPathStatus();
        stat2.setSize(200);
        stat2.setTime(987654321);
        stat2.setPath(join(path, "child2"));
        when(registryOperations.stat(join(path, "child2"))).thenReturn(stat2);
        
        // For child3, mock PathNotFoundException
        when(registryOperations.stat(join(path, "child3"))).thenThrow(PathNotFoundException.class);
        
        Map<String, RegistryPathStatus> expectedResults = new HashMap<>();
        expectedResults.put("child1", stat1);
        expectedResults.put("child2", stat2);
        
        Map<String, RegistryPathStatus> actualResults = registryUtils.statChildren(registryOperations, path);
        
        assertEquals(expectedResults, actualResults);
        
        // Verify that registryOperations.list() was called with the correct path
        verify(registryOperations, times(1)).list(path);
        
        // Verify that registryOperations.stat() was called for child1, child2, and child3
        verify(registryOperations, times(1)).stat(join(path, "child1"));
        verify(registryOperations, times(1)).stat(join(path, "child2"));
        verify(registryOperations, times(1)).stat(join(path, "child3"));
        
        // Verify that LOG.debug() was not called (since there were no exceptions)
        verify(LOG, times(0)).debug(anyString(), anyString(), any(Throwable.class));
    }
    
    // Helper method to join two paths
    private String join(String path, String childName) {
        return path + "/" + childName;
    }
}

