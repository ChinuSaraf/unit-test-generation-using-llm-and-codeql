
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class EnvTests {

    @Mock
    private Map<String, String> mockEnv;
    
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testEnvToString() {
        Env env = new Env();
        StringBuilder expected = new StringBuilder();
        expected.append("{");
        if (mockEnv != null) {
            for (Map.Entry<String, String> entry : mockEnv.entrySet()) {
                String val = entry.getValue();
                if (val == null) {
                    val = "";
                }
                expected.append("\n  ").append(entry.getKey())
                        .append(" = '").append(val).append("'\n");
            }
        }
        expected.append("}");
        assertEquals(expected.toString(), env.envToString(mockEnv));
    }
}
