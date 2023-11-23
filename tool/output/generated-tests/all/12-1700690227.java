
```java
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyTest {

    @Test
    public void testIsHAEnabled() {
        // Create mock objects
        Configuration conf = Mockito.mock(Configuration.class);

        // Create test data
        String nsId = "myNsId";
        Map<String, Map<String, InetSocketAddress>> addresses = new HashMap<>();
        Map<String, InetSocketAddress> nnMap = new HashMap<>();
        nnMap.put(nsId, new InetSocketAddress("localhost", 9000));
        addresses.put(nsId, nnMap);

        // Mock the method calls
        Mockito.when(DFSUtilClient.getHaNnRpcAddresses(conf)).thenReturn(addresses);

        // Call the method under test
        boolean result = HAUtil.isHAEnabled(conf, nsId);

        // Verify the assertions
        assertTrue(result);
    }
}
```
