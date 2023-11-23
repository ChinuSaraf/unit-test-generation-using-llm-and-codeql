
```java
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;


public class YourTestClass {

    @Mock
    private Authenticator authenticator;

    @Mock
    private Token token;

    @Mock
    private ConnectionConfigurator connConfigurator;

    @Test
    public void testOpenConnection() throws IOException, AuthenticationException {
        URL mockUrl = new URL("http://example.com");
        HttpURLConnection mockConnection = Mockito.mock(HttpURLConnection.class);

        Mockito.when(token.openConnection(mockUrl, connConfigurator)).thenReturn(mockConnection);

        HttpURLConnection result = PARENT_CLASS.openConnection(mockUrl, token);

        assertNotNull(result);
        assertEquals(mockConnection, result);
    }

    @Test
    public void testOpenConnectionWithNullUrl() throws IOException, AuthenticationException {
        assertThrows(IllegalArgumentException.class, () -> PARENT_CLASS.openConnection(null, token));
    }

    @Test
    public void testOpenConnectionWithInvalidUrl() throws IOException, AuthenticationException {
        URL mockUrl = new URL("ftp://example.com");
        assertThrows(IllegalArgumentException.class, () -> PARENT_CLASS.openConnection(mockUrl, token));
    }

    @Test
    public void testOpenConnectionWithNullToken() throws IOException, AuthenticationException {
        URL mockUrl = new URL("http://example.com");
        assertThrows(IllegalArgumentException.class, () -> PARENT_CLASS.openConnection(mockUrl, null));
    }
}

```
