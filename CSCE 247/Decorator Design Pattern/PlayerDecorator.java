package decoratordesignpattern;

/**
 * The PlayerDecorator is a class that extends the Player class. It will contain both the toString and getPower functions just like a normal player.
 * However, this is an abstract class (just like Player) and will only be used for attributes that need to be added to the player.
 * @author colin
 *
 */

public abstract class PlayerDecorator extends Player {
	public abstract String toString();
	public abstract double getPower();
}
