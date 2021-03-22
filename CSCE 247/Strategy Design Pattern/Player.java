package strategydesignpattern;

/**
 * The Player class is the parent class for Forward, Goalie, and Defenceman.
 * It contains information about the player like name, whether it is on offence, and the behaviors of the player as well as functions to change and output this information.
 * @author colin
 *
 */

public abstract class Player {
	protected String name;
	private boolean offence;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 * The constructor takes in a string and sets the player's name to this string.
	 * After that, it sets the player to offence and then sets the OffenceBehavior and DefenceBehavior depending on what kind of player it is (Forward, Defenceman, or Goalie).
	 * @param aName
	 */
	public Player(String aName) {
		this.name = aName;
		offence = true;
		this.setOffenceBehavior();
		this.setDefenceBehavior();
	}
	
	/**
	 * setDefenceBehavior() will change the player's behavior depending on what type of player he is.
	 */
	public abstract void setDefenceBehavior();
	
	/**
	 * setOffenceBehavior() will change the player's behavior depending on what type of player he is.
	 */
	public abstract void setOffenceBehavior();
	
	/**
	 * play() will output to the console what the player is doing on either offence or defence.
	 * @return
	 */
	public String play() {
		if(offence) {
			return offenceBehavior.play();
		}
		return defenceBehavior.play();
	}
	
	/**
	 * The method turnover() swaps the boolean offence to put the player on defence.
	 */
	public void turnover() {
		offence = !offence;
	}
}
