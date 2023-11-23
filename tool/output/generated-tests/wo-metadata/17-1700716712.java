
  
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.security.authentication.util.KerberosUtil;

public class TestGetPrincipalNames {
  
  @Mock
  private KerberosUtil kerberosUtil;
  
  @Test
  public void testGetPrincipalNames() throws IOException {
    MockitoAnnotations.initMocks(this);
    
    // Mock variables
    String keytab = "path/to/keytab";
    Pattern pattern = Pattern.compile("pattern");
    String[] principals = {"user1", "user2", "user3"};
    
    // Mock method calls
    Mockito.when(kerberosUtil.getPrincipalNames(keytab)).thenReturn(principals);
    
    // Call the target function
    String[] result = KerberosUtil.getPrincipalNames(keytab, pattern);
    
    // Verify the result
    assertNotNull(result);
    assertEquals(2, result.length);
    assertEquals("user1", result[0]);
    assertEquals("user3", result[1]);
  }
  
}
      
