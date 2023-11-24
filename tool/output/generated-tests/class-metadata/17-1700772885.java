
java
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class YourTestClass {

  @Mock
  private KerberosUtil kerberosUtil;

  @Test
  public void testGetPrincipalNames() throws IOException {
    String keytab = "path/to/keytab";
    Pattern pattern = Pattern.compile("examplePattern");

    String[] principals = {"principal1", "principal2"};
    when(kerberosUtil.getPrincipalNames(keytab)).thenReturn(principals);

    String[] expectedMatchingPrincipals = {"principal2"};
    assertEquals(expectedMatchingPrincipals, kerberosUtil.getPrincipalNames(keytab, pattern));
    verify(kerberosUtil, times(1)).getPrincipalNames(keytab);
  }
}


