package iteratordesignpattern;

import java.util.ArrayList;

/**
 * The ToDo class contains things about specific tasks that have to be done as well as multiple methods regarding that information.
 * @author colin
 */

public class ToDo {
	
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * The constructor simply initializes all of the variables of the class.
	 * @param title The title of the ToDo in the form of a string.
	 * @param description A string describing the ToDo.
	 * @param price A double representing the price of the ToDo.
	 * @param contact A string representing the contact of the ToDo.
	 * @param supplies An ArrayList of type String that represents the supplies needed.
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	
	/**
	 * This function simply returns the price of the specific ToDo.
	 * @return A double containing the price of the ToDo.
	 */
	public double getPrice() {
		return this.price;
	}
	
	/**
	 * This function formats and then returns all information regarding the specific ToDo.
	 * @return A string that contains all of the information about the ToDo, formatted.
	 */
	public String toString() {
		String ret = "\n***** " + this.title + " *****\n";
		ret += this.description + "\n";
		ret += "Business Contact: " + this.contact + "\n";
		for(String sup : supplies) {
			ret += "- " + sup + "\n";
		}
		ret += "Price: " + this.getPrice() + "\n";
		return ret;
	}
}
