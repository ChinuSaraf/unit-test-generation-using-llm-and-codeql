
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.apache.hadoop.security.authentication.client.AuthenticatedURL;
import org.apache.hadoop.security.authentication.client.Authenticator;
import org.apache.hadoop.security.authentication.client.ConnectionConfigurator;
import org.apache.hadoop.security.authentication.client.HttpURLConnection;
import org.apache.hadoop.security.authentication.client.AuthenticatedURL.Token;
import java.net.HttpCookie;

public class TestInjectToken {

    @Test
    public void testInjectToken() {
        HttpURLConnection conn = mock(HttpURLConnection.class);
        Token token = mock(Token.class);
        AuthenticatedURL authenticatedURL = mock(AuthenticatedURL.class);

        // Mock token.cookieHandler.getAuthCookie() to return a predefined HttpCookie
        HttpCookie authCookie = mock(HttpCookie.class);
        when(token.cookieHandler.getAuthCookie()).thenReturn(authCookie);

        authenticatedURL.injectToken(conn, token);

        // Verify that conn.addRequestProperty was called with the expected arguments
        verify(conn).addRequestProperty("Cookie", authCookie.toString());
    }
    
    @Test
    public void testInjectTokenWithNullCookie() {
        HttpURLConnection conn = mock(HttpURLConnection.class);
        Token token = mock(Token.class);
        AuthenticatedURL authenticatedURL = mock(AuthenticatedURL.class);

        // Mock token.cookieHandler.getAuthCookie() to return null
        when(token.cookieHandler.getAuthCookie()).thenReturn(null);

        authenticatedURL.injectToken(conn, token);

        // Verify that conn.addRequestProperty was not called since the authCookie was null
        verify(conn, never()).addRequestProperty(eq("Cookie"), anyString());
    }
    
}
