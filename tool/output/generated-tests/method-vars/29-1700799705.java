
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

@RunWith(MockitoJUnitRunner.class)
public class SubstitutionTest {

    @Mock
    private Pattern pattern;

    @Mock
    private Matcher matcher;

    @Test
    public void testReplaceSubstitution_repeat() {
        // Arrange
        String base = "Hello World";
        String to = "Java";
        boolean repeat = true;
        String expected = "Java Java";

        when(pattern.matcher(base)).thenReturn(matcher);
        when(matcher.replaceAll(to)).thenReturn(expected);

        // Act
        String result = ParentClass.replaceSubstitution(base, pattern, to, repeat);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceSubstitution_first() {
        // Arrange
        String base = "Hello World";
        String to = "Java";
        boolean repeat = false;
        String expected = "Java World";

        when(pattern.matcher(base)).thenReturn(matcher);
        when(matcher.replaceFirst(to)).thenReturn(expected);

        // Act
        String result = ParentClass.replaceSubstitution(base, pattern, to, repeat);

        // Assert
        assertEquals(expected, result);
    }
}

