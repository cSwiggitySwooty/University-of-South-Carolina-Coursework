package strategydesignpattern;

import java.util.Random;

/**
 * This class implements the interface DefenceBehavior. It is used for randomly determining what a player is doing at a given time.
 * @author colin
 *
 */

public class BlockBehavior implements DefenceBehavior {
	
	/**
	 * This play() function generates a number using java.util.Random in the range [0,3) and then uses that in a switch-case statement to determine which string to return.
	 */
	public String play() {
		Random r = new Random();
		int makePlay = r.nextInt(3);
		switch(makePlay) {
			case 0: return "blocks player from passing";
			case 1: return "blocks player from shooting";
			case 2: return "checks player with puck";
		}
		return "";
	}
}
