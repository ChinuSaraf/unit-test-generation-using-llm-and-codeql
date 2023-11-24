
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.hadoop.crypto.key.kms.server.KMSACLs;
import org.apache.hadoop.crypto.key.kms.server.KeyOpType;
import org.apache.hadoop.crypto.key.kms.server.AccessControlList;

import java.util.Map;
import java.util.HashMap;

public class KMSACLsTest {

  @Test
  public void testIsACLPresent() {
    // Create mock objects for required classes
    Map<String, HashMap<KeyOpType, AccessControlList>> keyAcls = mock(Map.class);
    Map<KeyOpType, AccessControlList> defaultKeyAcls = mock(Map.class);
    Map<KeyOpType, AccessControlList> whitelistKeyAcls = mock(Map.class);

    // Set up the data for the mock objects
    when(keyAcls.containsKey(anyString())).thenReturn(true);
    when(defaultKeyAcls.containsKey(any(KeyOpType.class))).thenReturn(true);
    when(whitelistKeyAcls.containsKey(any(KeyOpType.class))).thenReturn(true);

    // Create KMSACLs object with the mocked data
    KMSACLs acl = new KMSACLs(keyAcls, defaultKeyAcls, whitelistKeyAcls);
    
    // Call the method to test
    boolean result = acl.isACLPresent("keyName", KeyOpType.WRITE);

    // Assert the expected result
    assertTrue(result);
  }
}
