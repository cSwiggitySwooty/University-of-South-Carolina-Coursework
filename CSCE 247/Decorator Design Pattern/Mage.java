package decoratordesignpattern;

/**
 * The Mage class extends the Player class and adds functionality to it that is specific to the mage and not the warrior or healer.
 * @author colin
 *
 */

public class Mage extends Player {
	
	/**
	 * Initializes all of the variables (attack, intellect, etc). Also sets the name of the player.
	 * @param name Takes in the name of the player.
	 */
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	
	/**
	 * Returns the type of player (Mage) and then the output from the Player toString().
	 * @return
	 */
	public String toString() {
		return "Mage: " + super.toString();
	}
}
