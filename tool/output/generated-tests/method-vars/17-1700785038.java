
java
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class KerberosUtilTest {

    @Test
    public void testGetPrincipalNames() throws IOException {
        // Mock the dependencies
        String keytab = "testKeytab";
        Pattern pattern = Pattern.compile("pattern");

        // Mock the static method getPrincipalNames in KerberosUtil class
        KerberosUtil kerberosUtilMock = Mockito.mock(KerberosUtil.class);
        when(KerberosUtil.getPrincipalNames(keytab)).thenReturn(new String[]{"principal1", "principal2"});

        // Call the method under test
        String[] result = kerberosUtilMock.getPrincipalNames(keytab, pattern);

        // Assert the result
        assertEquals(1, result.length);
        assertEquals("principal1", result[0]);
    }
}

