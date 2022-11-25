import academy.certif.taskcheck.service.CheckService;
import academy.certif.taskcheck.service.EntityCheckableProviderMock;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import academy.certif.taskcheck.domain.EntityCheckable;

import java.util.*;

public class CheckServiceTest {
    
    private static CheckService checkService;

    private static EntityCheckableProviderMock entityCheckableProviderMock;

    @BeforeClass
    public static void init() {
        CheckServiceTest.entityCheckableProviderMock = new EntityCheckableProviderMock();
        CheckServiceTest.checkService = new CheckService(entityCheckableProviderMock);
    }

    @Test
    public void check() {

        Iterable<EntityCheckable> listNotDone = CheckServiceTest.checkService.listNotDone();

        assertNull(listNotDone);
        //assertEquals(listNotDone.get(0).getDescription(), "test");
    }
}
