package academy.certif.taskcheck.service;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

public interface CheckService {
		
	public Iterable<EntityCheckable> listNotDone();
	
	public void check(int id);
}
