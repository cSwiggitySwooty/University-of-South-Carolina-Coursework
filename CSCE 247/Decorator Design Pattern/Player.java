package decoratordesignpattern;

/**
 * The Player class is an abstract one that the Healer, Mage, and Warrior all derive from.
 * @author colin
 *
 */

public abstract class Player {
	
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	/**
	 * toString() is going to print out information about the player, excluding information that is included in the subclass.
	 * @return
	 */
	public String toString() {
		return name + "\nCarries a " + weapon + " and wears a " + armor;
	}
	
	/**
	 * getPower() will return the power of a Player in the form of a double.
	 * @return
	 */
	public double getPower() {
		return attack * 3 + defense + intellect / 2;
	}
}
