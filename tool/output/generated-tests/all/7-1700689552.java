
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.apache.hadoop.maven.plugin.util.FileSetUtils;
import org.apache.hadoop.maven.plugin.util.FileSetUtils.*;
import org.apache.hadoop.maven.plugin.util.FileSetUtils.getCommaSeparatedList;

public class FileSetUtilsTest {
    
    @Test
    public void testGetCommaSeparatedList() {
        List<String> list = Arrays.asList("one", "two", "three");
        
        // Mocking the Object class for the loop in the getCommaSeparatedList method
        Object mockedObject = mock(Object.class);
        
        // Creating the StringBuilder object and mocking the methods
        StringBuilder mockedBuffer = mock(StringBuilder.class);
        
        // Mocking the toString method of StringBuilder to return expected result
        when(mockedBuffer.toString()).thenReturn("one,two,three");
        
        // Mocking the append method of StringBuilder to return the mocked StringBuilder object itself
        when(mockedBuffer.append(",")).thenReturn(mockedBuffer);
        when(mockedBuffer.append("one")).thenReturn(mockedBuffer);
        when(mockedBuffer.append("two")).thenReturn(mockedBuffer);
        when(mockedBuffer.append("three")).thenReturn(mockedBuffer);
        
        // Creating the FileSetUtils object and mocking the methods
        FileSetUtils mockedFileSetUtils = mock(FileSetUtils.class);
        
        // Mocking the StringBuilder instance creation inside getCommaSeparatedList to return the mocked StringBuilder object
        when(mockedFileSetUtils.new StringBuilder()).thenReturn(mockedBuffer);
        
        // Calling the actual method using mocked objects
        String result = FileSetUtils.getCommaSeparatedList(list);
        
        // Verifying the getCommaSeparatedList method is called with the provided list
        verify(mockedFileSetUtils).getCommaSeparatedList(list);
        
        // Verifying the append method is called with the appropriate arguments in the loop
        verify(mockedBuffer).append(",");
        verify(mockedBuffer).append("one");
        verify(mockedBuffer).append(",");
        verify(mockedBuffer).append("two");
        verify(mockedBuffer).append(",");
        verify(mockedBuffer).append("three");
        
        // Verifying the toString method is called
        verify(mockedBuffer).toString();
        
        // Asserting the expected result with the actual result
        assertEquals("one,two,three", result);
    }
}
