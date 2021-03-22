package factorydesignpattern;

/**
 * BirthdayCake is an extension of the Cake class with different instance variable values.
 * @author colin
 */

public class BirthdayCake extends Cake {
	
	/**
	 * The constructor simply sets all the instance variables to predefined values.
	 */
	public BirthdayCake() {
		name = "Birthday Cake";
		price = 109.99;
		numLayers = 1;
		shape = Shape.SHEET;
		flavor = "Funfetti";
		icing = "Vanilla";
		decorations.add("Sprinkles");
		decorations.add("Candy Flowers");
		decorations.add("Icing Writing");
	}
	
}
