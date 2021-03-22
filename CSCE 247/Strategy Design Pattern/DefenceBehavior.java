package strategydesignpattern;

/**
 * DefenceBehaviors are for determining what a player is doing while he is on defence.
 * @author colin
 *
 */

public interface DefenceBehavior {
	
	/**
	 * The play() method that will be implemented will return a string stating what the player is doing at that point in time.
	 */
	public String play();
}
