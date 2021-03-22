package decoratordesignpattern;

/**
 * The Healer class extends the Player class and adds functionality to it that is specific to the healer and not the warrior or mage.
 * @author colin
 *
 */

public class Healer extends Player {
	
	/**
	 * Initializes all of the variables (attack, intellect, etc). Also sets the name of the player.
	 * @param name Takes in the name of the player.
	 */
	public Healer(String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	
	/**
	 * Returns the type of player (Healer) and then the output from the Player toString().
	 * @return
	 */
	public String toString() {
		return "Healer: " + super.toString();
	}
}
