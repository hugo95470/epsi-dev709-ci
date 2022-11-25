public class CheckServiceTest {
    
    private CheckService checkService;

    private EntityCheckableProviderMock entityCheckableProviderMock;

    @PostConstruct
    public load() {
        this.entityCheckableProviderMock = new EntityCheckableProviderMock();
        this.checkService = new CheckService(entityCheckableProviderMock);
    }

    @Test
    public void check() {

        var listNotDone = checkService.listNotDone();

        assertNotNull(listNotDone);
        assertEquals(listNotDone.get(0).getDescription(), "test")
    }
}
