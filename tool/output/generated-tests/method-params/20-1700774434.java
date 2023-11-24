
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRetrieveAddressesUriType {

  @Test
  public void testRetrieveAddressesUriType() throws InvalidRecordException {
    // Mocking input Endpoint
    Endpoint epr = mock(Endpoint.class);
    when(epr.addresses).thenReturn(getMockAddresses());

    // Calling the method to be tested
    List<String> results = RegistryTypeUtils.retrieveAddressesUriType(epr);
  
    // Assert statements
    assertEquals(2, results.size());
    assertEquals("address1", results.get(0));
    assertEquals("address2", results.get(1));
  }

  // Helper method to create mock addresses
  private List<Map<String, String>> getMockAddresses() {
    List<Map<String, String>> addresses = new ArrayList<>();
  
    Map<String, String> address1 = new HashMap<>();
    address1.put("type", "ADDRESS_URI");
    address1.put("value", "address1");
    addresses.add(address1);
  
    Map<String, String> address2 = new HashMap<>();
    address2.put("type", "ADDRESS_URI");
    address2.put("value", "address2");
    addresses.add(address2);
  
    return addresses;
  }
}

