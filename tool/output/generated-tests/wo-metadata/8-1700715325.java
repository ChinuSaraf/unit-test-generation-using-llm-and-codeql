
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.maven.plugin.util.Exec;

public class CODE_Test {

    @Test
    public void testEnvToString() {
        Exec exec = new Exec();

        // Mock env Map
        Map<String, String> env = new HashMap<>();
        env.put("key1", "value1");
        env.put("key2", null);
        env.put("key3", "value3");

        // Call the method and get the result
        String result = exec.envToString(env);

        // Check the expected output
        String expectedOutput = "{\n" +
                "  key1 = 'value1'\n" +
                "  key2 = ''\n" +
                "  key3 = 'value3'\n" +
                "}";
        assertEquals(expectedOutput, result);
    }
}
