package strategy.pattern;

/**
 * This application provides a simulation of The Strategy Design Pattern
 * @author Devang Sawant
 *
 */
public class MiniDuckSimulator {
	 
	/**
	 * this is the entry point to this applciation
	 * @param args
	 */
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		//model duck assigned the functioanlity of flying
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}