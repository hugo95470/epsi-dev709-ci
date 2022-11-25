package academy.certif.taskcheck.service;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;
import academy.certif.taskcheck.domain.Task;

import java.util.*;

public class EntityCheckableProviderMock extends EntityCheckableProvider {
    
    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {

        ArrayList<EntityCheckable> iterable = new ArrayList<EntityCheckable>();
        iterable.add(new Task(1, "test"));

		return iterable;
	}
}
