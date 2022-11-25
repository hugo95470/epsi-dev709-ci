package academy.certif.taskcheck.service;

import academy.certif.taskcheck.domain.EntityCheckable;
import academy.certif.taskcheck.provider.EntityCheckableProvider;

public class CheckServiceImpl implements CheckService {

	private EntityCheckableProvider entityCheckableProvider;
	
	public CheckServiceImpl(EntityCheckableProvider entityCheckableProvider) {
		this.entityCheckableProvider = entityCheckableProvider;
	}
	
	@Override
	public Iterable<EntityCheckable> listNotDone() {
		return this.entityCheckableProvider.searchDone(false);
	}
	
	@Override
	public void check(int id) {
		this.entityCheckableProvider.setDone(id, true);
	}
}
