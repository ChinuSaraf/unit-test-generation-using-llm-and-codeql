
java
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestReplaceSubstitution {

  @Test
  public void testReplaceSubstitution(){
    // Mock necessary objects
    Pattern pattern = mock(Pattern.class);
    Matcher matcher = mock(Matcher.class);

    // Set up mock behavior
    when(pattern.matcher(anyString())).thenReturn(matcher);
    when(matcher.replaceFirst(anyString())).thenReturn("replacedString");

    // Call the method under test
    String result = replaceSubstitution("baseString", pattern, "replaceString", false);

    // Verify the expected behavior
    verify(pattern).matcher("baseString");
    verify(matcher).replaceFirst("replaceString");
    assertEquals("replacedString", result);
  }

  // Generate the required method
  static String replaceSubstitution(String base, Pattern from, String to, boolean repeat) {
    Matcher match = from.matcher(base);
    if (repeat) {
      return match.replaceAll(to);
    } else {
      return match.replaceFirst(to);
    }
  }
}

