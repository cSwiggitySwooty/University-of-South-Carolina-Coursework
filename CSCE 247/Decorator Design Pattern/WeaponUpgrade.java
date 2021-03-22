package decoratordesignpattern;

/**
 * WeaponUpgrade extends the PlayerDecorator class.
 * @author colin
 *
 */

public class WeaponUpgrade extends PlayerDecorator {
	
	private Player player;

	/**
	 * For the constuctor, the private variable player is set to the player parameter.
	 * @param player A player is passed into the constructor so that the private variable can be initialized with it.
	 */
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	
	/**
	 * toString() calls the private variable player's toString and then adds onto it.
	 * @return
	 */
	public String toString() {
		return this.player.toString() + "\nUpgraded Weapon";
	}
	
	/**
	 * getPower() calls the player's getPower function and then adds a number to the total and then returns the new total.
	 * @return
	 */
	public double getPower() {
		return this.player.getPower() + 5;
	}
}
