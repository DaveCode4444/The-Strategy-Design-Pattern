package strategy.pattern;

/**
 * 
 * @author Devang Sawant
 *
 */

public class RubberDuck extends Duck {
	 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
