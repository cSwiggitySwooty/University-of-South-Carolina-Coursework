package factorydesignpattern;

import java.util.ArrayList;

/**
 * The Cake class is an abstract class that prints information out as well as storing all variables related to cakes.
 * @author colin
 */

public abstract class Cake {
	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;
	
	/**
	 * The constructor simply initializes the ArrayList.
	 */
	public Cake() {
		decorations = new ArrayList<String>();
	}
	
	/**
	 * This function calls createLayers(), frostCake(), and addDecorations(). It is called by Bakery to get information about the class.
	 */
	public void createCake() {
		this.createLayers();
		this.frostCake();
		this.addDecorations();
	}
	
	/**
	 * This function outputs information about the cake, including the layers, the shape, and the flavor of the cake.
	 */
	private void createLayers() {
		if(this.shape == Shape.CUPCAKES) {
			System.out.println("Creating " + this.flavor + " cupcakes");
			return;
		}
		if(this.shape == Shape.BUNT) {
			System.out.println("Creating " + this.flavor + " bunt cake");
			return;
		}
		if(numLayers != 1) {
			System.out.println("Creating a " + this.numLayers + " layered " + this.shape.toString().toLowerCase() + " " + this.flavor + " cake");
		}
		else {
			System.out.println("Creating a " + this.numLayers + " layer " + this.shape.toString().toLowerCase() + " " + this.flavor + " cake");
		}
	}
	
	/**
	 * Here, information about the frosting is printed to the console.
	 */
	private void frostCake() {
		System.out.println("Frosting cake with " + this.icing + " icing.");
	}
	
	/**
	 * For this function, the ArrayList containing all cake decorations is looped through to ouput all the decorations on this specific cake.
	 */
	private void addDecorations() {
		for(String dec : this.decorations) {
			System.out.println("Adding " + dec + ".");
		}
	}
	
	/**
	 * The getPrice() function simply returns the price of the cake.
	 * @return The price of the cake, in the form of a double.
	 */
	public double getPrice() {
		return this.price;
	}
}
