
java
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CreateFileBuilderTest {
    @Test
    public void testWithFlags() {
        CreateFileBuilder createFileBuilder = Mockito.mock(CreateFileBuilder.class);

        EnumSet<CreateFlag> flags = EnumSet.of(CreateFlag.CREATE, CreateFlag.APPEND, CreateFlag.OVERWRITE);

        createFileBuilder.withFlags(flags);

        Mockito.verify(createFileBuilder, Mockito.times(1)).create();
        Mockito.verify(createFileBuilder, Mockito.times(1)).append();
        Mockito.verify(createFileBuilder, Mockito.times(1)).overwrite(true);
        Mockito.verify(createFileBuilder, Mockito.times(1)).return this;
    }
}

