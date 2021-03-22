package strategydesignpattern;

/**
 * The OffenceBehavior interface is used to determine what a player is doing on offence.
 * @author colin
 *
 */
public interface OffenceBehavior {
	
	/**
	 * The play() function  will return a string that states what the player is doing.
	 * @return
	 */
	public String play();
}
