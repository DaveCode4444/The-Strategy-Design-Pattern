package strategy.pattern;
/**
 * The classes that need the fly behavior need to implement this interface
 * 
 * @author Devang Sawant
 *
 */
public interface FlyBehavior {
	
	//each class will have its own specific fly implementation
	public void fly();
}
