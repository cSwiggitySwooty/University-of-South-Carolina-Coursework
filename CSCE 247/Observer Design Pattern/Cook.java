package observerdesignpattern;

import java.util.ArrayList;

/**
 * The Cook class is one of the main classes here. It is in charge of notifying Observers (which it has an ArrayList of) and managing said Observers.
 * It is an implementation of the Subject interface.
 * @author colin
 *
 */

public class Cook implements Subject {
	private ArrayList<Observer> observers;
	private String name;
	
	/**
	 * The constructor simply sets the name variable and then initializes the ArrayList.
 	 * @param name The name of the Cook.
	 */
	public Cook(String name) {
		this.name = name;
		this.observers = new ArrayList<>();
	}
	
	/**
	 * registerObserver adds observers to the ArrayList.
	 * @param observer An Observer to add to the ArrayList.
	 */
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	/**
	 * removeObserver searches the ArrayList for a given Observer and removes it if it is present.
	 * @param observer The Observer to remove.
	 */
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	/**
	 * notifyObservers iterates through the ArrayList and calls the update function on all of the Observers, giving them information about where the Cook was.
	 * @param location Where the Cook was.
	 * @param description What the Cook was doing at the location.
	 */
	public void notifyObservers(String location, String description) {
		for(Observer o : observers) {
			o.update(location, description);
		}
	}
	
	/**
	 * The enterSighting function calls the notifyObservers function and gives the Observers information.
	 * @param location Where the Cook was.
	 * @param description What the Cook was doing at the location.
	 */
	public void enterSighting(String location, String description) {
		this.notifyObservers(location, description);
	}
	
	/**
	 * The getName function returns the name of the Cook.
	 * @return
	 */
	public String getName() {
		return this.name;
	}
}
