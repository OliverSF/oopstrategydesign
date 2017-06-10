
public interface Strategy {
	
	public void execute(String command) throws UnavailableBehaviourException;
	public void setAnimal(Animal ani);
	public void addBehaviour(String command, Behaviour b);

}
