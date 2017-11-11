package strategy.pattern;

/**
 * 
 * @author Devang Sawant
 *
 */

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
