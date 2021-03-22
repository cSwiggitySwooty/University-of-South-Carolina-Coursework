package strategydesignpattern;

import java.util.Random;

/**
 * The Defenceman class extends the base class Player.
 * It has functions for outputting information and changing the player's behavior.
 * @author colin
 *
 */

public class Defenceman extends Player {
	
	/**
	 * This function takes in a string and then calls the parent constructor with the same string as the parameter.
	 * @param aName
	 */
	public Defenceman(String aName) {
		super(aName);
	}
	
	/**
	 * setOffenceBehavior() takes in nothing and then generates a random number from [0,10) by using java.util.Random.
	 * It uses this number to determine which behavior to set.
	 * SlapShotBehavior() only has a 1/10 chance of being selected. As such, it was arbitrarily assigned to the value 9.
	 */
	public void setOffenceBehavior() {
		Random r = new Random();
		int behaviorCheck = r.nextInt(10);
		if(behaviorCheck == 9) {
			this.offenceBehavior = new SlapShotBehavior();
			return;
		}
		this.offenceBehavior = new PassBehavior();
	}
	
	/**
	 * setDefenceBehavior() uses java.util.Random to generate a number from [0,2) and then uses that to select a new defence behavior.
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
	 * toString() outputs the player's name as well as the position he plays. In this case, it is Defenceman.
	 */
	public String toString() {
		return this.name + " plays the position: Defenceman";
	}
}
