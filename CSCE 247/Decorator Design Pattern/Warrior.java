package decoratordesignpattern;

/**
 * The Warrior class extends the Player class and adds functionality to it that is specific to the warrior and not the healer or mage.
 * @author colin
 *
 */

public class Warrior extends Player {
	
	/**
	 * Initializes all of the variables (attack, intellect, etc). Also sets the name of the player.
	 * @param name Takes in the name of the player.
	 */
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	/**
	 * Returns the type of player (Warrior) and then the output from the Player toString().
	 * @return
	 */
	public String toString() {
		return "Warrior: " + super.toString();
	}
}
