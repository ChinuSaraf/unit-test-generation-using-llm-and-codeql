<![CDATA[
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.apache.hadoop.registry.client.binding.RegistryTypeUtils;

public class RetrieveAddressesUriTypeTest {

    @Test
    public void testRetrieveAddressesUriType() throws InvalidRecordException {
        // Mock the Endpoint object
        Endpoint epr = mock(Endpoint.class);

        // Create an instance of the RegistryTypeUtils class
        RegistryTypeUtils registryTypeUtils = new RegistryTypeUtils();

        // Create a sample addresses list
        List<Map<String, String>> addresses = new ArrayList<>();
        Map<String, String> address1 = new HashMap<>();
        address1.put("type", "ADDRESS_URI");
        address1.put("value", "address1");
        addresses.add(address1);
        Map<String, String> address2 = new HashMap<>();
        address2.put("type", "ADDRESS_URI");
        address2.put("value", "address2");
        addresses.add(address2);

        // Set the addresses list in the mocked Endpoint object
        when(epr.getAddresses()).thenReturn(addresses);

        // Call the method under test
        List<String> results = registryTypeUtils.retrieveAddressesUriType(epr);

        // Assert the results
        assertEquals(2, results.size());
        assertEquals("address1", results.get(0));
        assertEquals("address2", results.get(1));
    }
}
]]>