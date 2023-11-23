
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RetrieveAddressesUriTypeTest {
  
  @Test
  public void testRetrieveAddressesUriType() throws InvalidRecordException {
    // Mock Endpoint
    Endpoint epr = mock(Endpoint.class);
    
    // Mock addresses
    List<Map<String, String>> addresses = new ArrayList<>();
    Map<String, String> address1 = mock(Map.class);
    when(address1.get("addressType")).thenReturn("ADDRESS_URI");
    addresses.add(address1);
    Map<String, String> address2 = mock(Map.class);
    when(address2.get("addressType")).thenReturn("ADDRESS_URI");
    addresses.add(address2);
    when(epr.getAddresses()).thenReturn(addresses);
    
    // Call the method under test
    List<String> result = RegistryTypeUtils.retrieveAddressesUriType(epr);
    
    // Assert the result
    assertEquals(2, result.size());
    assertEquals("ADDRESS_URI", result.get(0));
    assertEquals("ADDRESS_URI", result.get(1));
  }
}  
