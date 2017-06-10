
public class AnimalMain {

	public static void main(String[] args) {
		
		Strategy strategy1 = new SimpleStrategy();
		strategy1.addBehaviour("walk", new Walk());
		
		Dog doggyrex = new Dog("Rex");
		doggyrex.setStrategy(strategy1); //also adds Animal to Strategy
		
		
		Strategy strategy2 = new SimpleStrategy();
		strategy2.addBehaviour("fly", new Fly());
		
		Bird tweety = new Bird("tweety");
		tweety.setStrategy(strategy2);
		
	
		
		
		
		try{
			doggyrex.listen("walk");
		}
		catch(UnavailableBehaviourException e){
			e.getMessage();
		}
		
		
		try{
			tweety.listen("fly");
		}
		catch(UnavailableBehaviourException e){
			e.getMessage();
		}
		
		try{
			tweety.listen("run");
		}
		catch(UnavailableBehaviourException e){
			e.getMessage();
		}
		
		strategy1.addBehaviour("fly", new Fly());
		try{
			doggyrex.listen("fly");
		}
		catch(UnavailableBehaviourException e){
			e.getMessage();
		}
		
	}

}
