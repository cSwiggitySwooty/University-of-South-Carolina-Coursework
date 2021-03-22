package strategydesignpattern;

/**
 * Goalie is an extension of the Player class. It outputs general information as well as changes the player's behaviors.
 * @author colin
 *
 */

public class Goalie extends Player {
	
	/**
	 * The constructor takes in a string and then passes that string into the parent constructor.
	 * @param aName
	 */
	public Goalie(String aName) {
		super(aName);
	}
	
	/**
	 * setOffenceBehavior() sets the offenceBehavior to BlockGoalBehavior().
	 */
	public void setOffenceBehavior() {
		this.offenceBehavior = new BlockGoalBehavior();
	}
	
	/**
	 * setDefenceBehavior() sets the offenceBehavior to BlockGoalBehavior().
	 */
	public void setDefenceBehavior() {
		this.defenceBehavior  = new BlockGoalBehavior();
	}
	
	/**
	 * toString() outputs the player's name as well as the position he plays. In this case, it is Goalie.
	 */
	public String toString() {
		return this.name + " plays the position: Goalie";
	}
}
