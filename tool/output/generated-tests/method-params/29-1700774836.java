
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TestReplaceSubstitution {

    @Mock
    Pattern pattern;
    @Mock
    Matcher matcher;

    @Test
    public void testReplaceSubstitution() {
        MockitoAnnotations.initMocks(this);

        when(pattern.matcher(Mockito.anyString())).thenReturn(matcher);
        when(matcher.replaceAll(Mockito.anyString())).thenReturn("replacedString");
        when(matcher.replaceFirst(Mockito.anyString())).thenReturn("replacedString");

        String base = "example string";
        String from = "example";
        String to = "replacement";
        boolean repeat = true;

        String expected = "replacedString";

        String result = replaceSubstitution(base, pattern, to, repeat);

        assertEquals(expected, result);
    }

    static String replaceSubstitution(String base, Pattern from, String to, boolean repeat) {
        Matcher match = from.matcher(base);
        if (repeat) {
            return match.replaceAll(to);
        } else {
            return match.replaceFirst(to);
        }
    }
}
