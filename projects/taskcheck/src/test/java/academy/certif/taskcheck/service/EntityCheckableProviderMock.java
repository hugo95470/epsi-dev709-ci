public class EntityCheckableProviderMock {
    
    @Override
    public Iterable<EntityCheckable> searchDone(boolean isDone) {
				
		return Arrays.asList(new Task(1, "test"));
	}
}
