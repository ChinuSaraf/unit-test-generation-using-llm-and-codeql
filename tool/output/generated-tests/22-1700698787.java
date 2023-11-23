
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class KMSWebServerTest {
  
  @Test
  public void testGetKMSUrl() throws Exception {
    // Mocking the required classes and methods
    HttpServer2 httpServer = mock(HttpServer2.class);
    InetSocketAddress addr = new InetSocketAddress("localhost", 8080);
    when(httpServer.getConnectorAddress(0)).thenReturn(addr);
    
    // Creating an instance of KMSWebServer
    KMSWebServer kmsWebServer = new KMSWebServer();
    kmsWebServer.httpServer = httpServer;
    
    // Calling the method under test
    URL url = kmsWebServer.getKMSUrl();
    
    // Asserting the result
    assertEquals(new URL("http", "localhost", 8080, KMSWebServer.SERVLET_PATH), url);
  }
}
