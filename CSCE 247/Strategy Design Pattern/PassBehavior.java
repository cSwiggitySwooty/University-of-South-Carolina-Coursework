package strategydesignpattern;

/**
 * PassBehavior is an implementation of the OffenceBehavior interface.
 * @author colin
 *
 */

public class PassBehavior implements OffenceBehavior {
	
	/**
	 * play() outputs that the given player is passing the puck to a forward.
	 */
	public String play() {
		return "passes to a forward";
	}
}
