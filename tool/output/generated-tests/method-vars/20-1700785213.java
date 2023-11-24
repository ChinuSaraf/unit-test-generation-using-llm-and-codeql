
&lt;?xml version="1.0" encoding="UTF-8"?&gt;
&lt;project name="JUnitTest"&gt;
&lt;target name="compile" description="Compile Java source files"&gt;
&lt;javac srcdir="src" destdir="build" includeantruntime="false"/&gt;
&lt;/target&gt;
&lt;target name="test" depends="compile" description="Run JUnit tests"&gt;
&lt;junit printsummary="on" haltonfailure="yes"&gt;
&lt;classpath&gt;
&lt;pathelement location="lib/junit-4.jar"/&gt;
&lt;pathelement location="lib/mockito-all-1.10.19.jar"/&gt;
&lt;pathelement location="lib/hamcrest-core-1.3.jar"/&gt;
&lt;pathelement location="build"/&gt;
&lt;/classpath&gt;
&lt;formatter type="xml"/&gt;
&lt;batchtest todir="test-reports"&gt;
&lt;fileset dir="test">
&lt;include name="**/*Test.java"/&gt;
&lt;/fileset&gt;
&lt;/batchtest&gt;
&lt;/junit&gt;
&lt;/target&gt;
&lt;/project&gt;


import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

public class JUnitTest {

    @Test
    public void testRetrieveAddressesUriType() throws InvalidRecordException {
        // Mock Endpoint
        Endpoint mockEndpoint = Mockito.mock(Endpoint.class);

        // Mock addresses list
        List<Map<String, String>> mockAddresses = new ArrayList<>();
        Map<String, String> mockAddress1 = new HashMap<>();
        Map<String, String> mockAddress2 = new HashMap<>();
        mockAddresses.add(mockAddress1);
        mockAddresses.add(mockAddress2);

        // Assign mock addresses list to mock endpoint
        Mockito.when(mockEndpoint.getAddresses()).thenReturn(mockAddresses);

        // Call the target function
        List<String> results = retrieveAddressesUriType(mockEndpoint);

        // Check the results
        assertEquals(2, results.size());
        assertEquals(getAddressField(mockAddress1, ADDRESS_URI), results.get(0));
        assertEquals(getAddressField(mockAddress2, ADDRESS_URI), results.get(1));
    }
}
