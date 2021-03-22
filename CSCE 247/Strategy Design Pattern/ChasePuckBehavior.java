package strategydesignpattern;

/**
 * This class implements the DefenceBehavior interface and is used for returning a string when a player is chasing the puck.
 * @author colin
 *
 */

public class ChasePuckBehavior implements DefenceBehavior {
	
	/**
	 * This play() method returns the string "Chases the puck".
	 */
	public String play() {
		return "Chases the puck";
	}
}
