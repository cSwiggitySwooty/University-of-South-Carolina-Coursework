package factorydesignpattern;

/**
 * BlackForestCake is an extension of the Cake class with different instance variable values.
 * @author colin
 */

public class BlackForestCake extends Cake {
	
	/**
	 * The constructor simply sets all the instance variables to predefined values.
	 */
	public BlackForestCake() {
		name = "Black Forest Cake";
		price = 47.99;
		numLayers = 3;
		shape = Shape.ROUND;
		flavor = "Black Forest";
		icing = "Whipped Cream";
		decorations.add("Cherries");
		decorations.add("Chocolate Flakes");
		decorations.add("Whipped Cream");
	}
	
}
