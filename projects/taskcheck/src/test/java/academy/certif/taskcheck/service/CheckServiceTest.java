import academy.certif.taskcheck.service.CheckService;
import academy.certif.taskcheck.service.EntityCheckableProviderMock;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CheckServiceTest {
    
    private static CheckService checkService;

    private static EntityCheckableProviderMock entityCheckableProviderMock;

    // @BeforeClass
    // public static void init() {
    //     CheckServiceTest.entityCheckableProviderMock = new EntityCheckableProviderMock();
    //     CheckServiceTest.checkService = new CheckService(entityCheckableProviderMock);
    // }

    // @Test
    // public void check() {

    //     var listNotDone = CheckServiceTest.checkService.listNotDone();

    //     assertNotNull(listNotDone);
    //     assertEquals(listNotDone.get(0).getDescription(), "test");
    // }
}
