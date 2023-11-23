
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// Import the required classes using qualified name from PARENT_CLASS
import org.apache.hadoop.security.authentication.util.KerberosUtil;

public class GetPrincipalNamesTest {

    @Test
    public void testGetPrincipalNames() throws IOException {
        // Mock the required variables and method from KerberosUtil class
        String keytab = "testKeytab";
        Pattern pattern = Pattern.compile("testPattern");
        String[] principals = {"principal1", "principal2"};

        KerberosUtil kerberosUtil = Mockito.mock(KerberosUtil.class);
        Mockito.when(kerberosUtil.getPrincipalNames(keytab)).thenReturn(principals);

        // Create an instance of the class under test
        MyClass myClass = new MyClass();

        // Call the method under test
        String[] result = myClass.getPrincipalNames(keytab, pattern);

        // Assert the result
        String[] expected = {"principal1", "principal2"};
        Assert.assertArrayEquals(expected, result);
    }
}
