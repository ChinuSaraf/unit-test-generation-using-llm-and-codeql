
```java
<IMPORTANT_IMPORTS>

@RunWith(MockitoJUnitRunner.class)
public class Nfs3MetricsTest {

    @Mock
    private Configuration conf;

    @Mock
    private MetricsSystem ms;

    @Mock
    private JvmMetrics jm;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(conf.get(DFSConfigKeys.DFS_METRICS_SESSION_ID_KEY)).thenReturn("session_id");
        when(DefaultMetricsSystem.instance()).thenReturn(ms);
        when(JvmMetrics.create(anyString(), anyString(), any(MetricsSystem.class))).thenReturn(jm);
    }

    @Test
   