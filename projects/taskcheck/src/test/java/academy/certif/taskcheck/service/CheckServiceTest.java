import academy.certif.taskcheck.service.CheckService;
import academy.certif.taskcheck.service.EntityCheckableProviderMock;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.domain.Task;

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

        assertNotNull(listNotDone);
        assertEquals(((Collection<?>)listNotDone).size(), 1);
        EntityCheckable next = listNotDone.iterator().next();
        assertEquals(next.getId(), 1);
    }
}
