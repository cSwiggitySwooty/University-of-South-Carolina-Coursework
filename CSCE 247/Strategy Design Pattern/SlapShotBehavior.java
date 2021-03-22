package strategydesignpattern;

/**
 * SlapShotBehavior is an implementation of OffenceBehavior.
 * @author colin
 *
 */

public class SlapShotBehavior implements OffenceBehavior {
	
	/**
	 * This method returns a string stating what the player is doing.
	 */
	public String play() {
		return "shoots the puck from the blue line";
	}
}
