package factorydesignpattern;

/**
 * CarrotCake is an extension of the Cake class with different instance variable values.
 * @author colin
 */

public class CarrotCake extends Cake {
	
	/**
	 * The constructor simply sets all the instance variables to predefined values.
	 */
	public CarrotCake() {
		name = "Carrot Cake";
		price = 54.99;
		numLayers = 2;
		shape = Shape.ROUND;
		flavor = "Carrot";
		icing = "Cream Cheese";
		decorations.add("Walnuts");
		decorations.add("Candy Carrots");
	}
}
