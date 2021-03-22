package strategydesignpattern;

/**
 * ShootBehavior is an implementation of OffenceBehavior.
 * @author colin
 *
 */

public class ShootBehavior implements OffenceBehavior {
	
	/**
	 * play() returns a string saying that the player is shooting.
	 */
	public String play() {
		return "shoots at the goal";
	}
}
