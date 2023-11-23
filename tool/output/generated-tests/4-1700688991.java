
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class ChangeTrackerTest {

    @Mock
    private ChangeDetectionPolicy policy;

    @Mock
    private ChangeTrackerStatistics versionMismatches;

    private ChangeTracker changeTracker;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        when(policy.toString()).thenReturn("MockPolicy");
        when(versionMismatches.toString()).thenReturn("MockVersionMismatches");
        changeTracker = new ChangeTracker(policy, "mockRevisionId");
    }

    @Test
    public void testToString() {
        String expected = "ChangeTracker{MockPolicy, revisionId='mockRevisionId'}";
        assertEquals(expected, changeTracker.toString());
    }
}
