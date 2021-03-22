package strategydesignpattern;

import java.util.Random;

/**
 * The Forward class is an extension of the base class Player.
 * It includes functions for outputting the name of the player as well as for changing the player's behavior.
 * @author colin
 *
 */

public class Forward extends Player {
	
	/**
	 * The constructor only takes in a string and then passes that string into the parent constructor.
	 * @param aName
	 */
	public Forward(String aName) {
		super(aName);
	}
	
	/**
	 * setOffenceBehavor() generates a random number from [0,2) and then uses that to select a new offence behavior.
	 */
	public void setOffenceBehavior() {
		Random r = new Random();
		int behaviorCheck = r.nextInt(2);
		if(behaviorCheck == 0) {
			this.offenceBehavior = new PassBehavior();
			return;
		}
		this.offenceBehavior = new ShootBehavior();
	}
	
	/**
	 * setDefenceBehavor() generates a random number from [0,2) and then uses that to select a new defence behavior.
	 */
	public void setDefenceBehavior() {
		Random r = new Random();
		int behaviorCheck = r.nextInt(2);
		if(behaviorCheck == 0) {
			this.defenceBehavior = new ChasePuckBehavior();
			return;
		}
		this.defenceBehavior = new BlockBehavior();
	}
	
	/**
	 * toString() outputs the player's name as well as the position he plays. In this case, it is Forward.
	 */
	public String toString() {
		return this.name + " plays the position: Forward";
	}
}
