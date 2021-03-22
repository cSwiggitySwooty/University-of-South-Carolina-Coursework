package strategydesignpattern;

import java.util.Random;

/**
 * This class implements two interfaces. Using this class as a behavior means it will work the same, regardless of whether or not it is an offence or defence behavior.
 * This class is used to determine what a player is doing at any given time.
 * @author colin
 *
 */

public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
	
	/**
	 * The play() function generates a random number on the range [0,4) using java.util.Random and then, through a switch-case statement, uses that to determine which string to return.
	 */
	public String play() {
		Random r = new Random();
		int makePlay = r.nextInt(4);
		switch(makePlay) {
			case 0: return "hand blocks the puck";
			case 1: return "catches the puck";
			case 2: return "blocks puck with knee pads";
			case 3: return "blocks puck with stick";
		}
		return "";
	}
}
