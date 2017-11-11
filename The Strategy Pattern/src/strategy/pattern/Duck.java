package strategy.pattern;
/**
 * 
 * @author Devang Sawant
 *
 */
public abstract class Duck {
	
	 FlyBehavior flyBehavior;
	 QuackBehavior quackBehavior;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	//display yourself
	abstract void display();
	
	//will make specific ducks fly
	public void performFly() {
		flyBehavior.fly();
	}
	
	//will make specifici ducks quack
	public void performQuack() {
		quackBehavior.quack();
	}
	
	//will make specific ducks swim
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
