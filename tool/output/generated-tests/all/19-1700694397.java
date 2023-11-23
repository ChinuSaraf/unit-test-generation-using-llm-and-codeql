
```java
// Import required packages
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import java.util.Map;
import org.junit.Test;
import org.apache.hadoop.registry.client.binding.RegistryTypeUtils;

public class JUnitTestClass {

  @Test
  public void testGetAddressField() throws InvalidRecordException {
  
    // Mock the required objects and methods
    Map<String, String> address = mock(Map.class);
    String field = "testField";
  
    // Set up mock behavior
    when(address.get(field)).thenReturn("testValue");
  
    // Create an instance of the parent class
    RegistryTypeUtils parentInstance = mock(RegistryTypeUtils.class);
  
    try {
      // Invoke the target method
      String result = parentInstance.getAddressField(address, field);
  
      // Verify the result
      assertEquals("testValue", result);
  
    } catch (InvalidRecordException e) {
      // Handle exception if required
    }
  }
}
```
