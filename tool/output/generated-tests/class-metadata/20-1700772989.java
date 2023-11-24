
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.apache.hadoop.registry.client.binding.RegistryTypeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RetrieveAddressesUriTypeTest {

    @Test
    public void testRetrieveAddressesUriType() throws InvalidRecordException {
        // Mock Endpoint
        Endpoint mockEndpoint = mock(Endpoint.class);
        
        // Mock addresses
        List<Map<String, String>> mockAddresses = new ArrayList<>();
        Map<String, String> address1 = new HashMap<>();
        address1.put("type", "ADDRESS_URI");
        address1.put("value", "http://example.com");
        Map<String, String> address2 = new HashMap<>();
        address2.put("type", "ADDRESS_URI");
        address2.put("value", "https://example.org");
        mockAddresses.add(address1);
        mockAddresses.add(address2);
        
        // Assign addresses to the mock endpoint
        when(mockEndpoint.getAddress()).thenReturn(mockAddresses);
        
        // Call the retrieveAddressesUriType method
        List<String> results = RegistryTypeUtils.retrieveAddressesUriType(mockEndpoint);
        
        // Verify the results
        assertEquals(2, results.size());
        assertEquals("http://example.com", results.get(0));
        assertEquals("https://example.org", results.get(1));
    }
}
