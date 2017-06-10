import java.util.*;

public class SimpleStrategy implements Strategy{
	
	private Animal animal;
	private Map<String, Behaviour> behaviours = new HashMap<String, Behaviour>();
	
	@Override
	public void execute(String command) throws UnavailableBehaviourException{
		
		command.toLowerCase();
		if(behaviours.containsKey(command)){
			System.out.print(animal.getName() + " who is a " + animal.getClass().getSimpleName() + " can ");
			behaviours.get(command).doIt();
		}
		else{
			throw new UnavailableBehaviourException(command + " is not a valid command");
		}
		
	}
	
	public void addBehaviour(String command, Behaviour b){
		
		behaviours.put(command.toLowerCase(), b);
	}

	@Override
	public void setAnimal(Animal ani) {
		
		this.animal = ani;		
	}
	
	

}
