
public abstract class Animal {
	
	protected String name;
	protected Strategy strategy;
	
	public void setStrategy(Strategy strategy){
		
		this.strategy = strategy;
		strategy.setAnimal(this);
	}
	
	public void listen(String command) throws UnavailableBehaviourException{
		
			this.strategy.execute(command);
		
	}
	
	public String getName(){
		
		return this.name;
	}
	

}
