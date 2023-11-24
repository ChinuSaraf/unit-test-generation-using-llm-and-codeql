
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ExecTest {
  
  @Mock
  private Mojo mojo;

  @InjectMocks
  private Exec exec;

  @Test
  public void testEnvToString() {
    MockitoAnnotations.initMocks(this);

    Map<String, String> env = new HashMap<>();
    env.put("key1", "value1");
    env.put("key2", "value2");
    env.put("key3", null);

    String expected = "{\n  key1 = 'value1'\n\n  key2 = 'value2'\n\n  key3 = ''\n\n}";
    String actual = exec.envToString(env);

    assertEquals(expected, actual);
  }
  
  // Add more test cases for other methods if needed
  
}
