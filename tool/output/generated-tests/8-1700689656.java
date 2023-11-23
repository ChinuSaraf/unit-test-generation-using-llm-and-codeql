
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

  @Test
  public void testEnvToString() {
      // Create a mock instance of Mojo
      Mojo mockMojo = Mockito.mock(Mojo.class);
      
      // Create a mock instance of Map<String, String>
      Map<String, String> mockEnv = Mockito.mock(Map.class);
      
      // Set up the mock behavior for env.entrySet()
      Set<Map.Entry<String, String>> mockEntrySet = new HashSet<>();
      mockEntrySet.add(new AbstractMap.SimpleEntry<>("key1", "value1"));
      mockEntrySet.add(new AbstractMap.SimpleEntry<>("key2", "value2"));
      Mockito.when(mockEnv.entrySet()).thenReturn(mockEntrySet);
      
      // Create an instance of Exec
      Exec exec = new Exec(mockMojo);
      
      // Call the method envToString() with the mock environment
      String result = exec.envToString(mockEnv);
      
      // Assert the expected result
      String expected = "{\n  key1 = 'value1'\n  key2 = 'value2'\n}";
      assertEquals(expected, result);
      
      // Optionally, verify that the mock methods were called as expected
      Mockito.verify(mockEnv).entrySet();
  }
  
}
