package academy.certif.taskcheck.service;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;
import academy.certif.taskcheck.domain.Task;

import java.util.*;

public class EntityCheckableProviderMock extends EntityCheckableProvider {
    
    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
	
        List<Task> list = new ArrayList<Task>();
        list.add(new Task(1, "a string"));

		return list;
	}
}
