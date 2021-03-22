package observerdesignpattern;

import java.util.ArrayList;

/**
 * The DEA is another implementation of the Observer interface. It stores information about where the Cook has been and what he was doing at those locations.
 * It stores the locations in an ArrayList of type String and then stores the description of what he was doing in a String called notes.
 * @author colin
 *
 */

public class DEA implements Observer {
	private Subject cook;
	private ArrayList<String> locations;
	private String notes;
	
	/**
	 * In the constructor, the cook is set as the Subject and the DEA registers with the cook to become an Observer.
	 * The locations ArrayList is also initialized, and both it and the notes String variable are formatted.
	 * @param cook The cook parameter is for the Observer to register with. This is the Subject that the DEA is watching.
	 */
	public DEA(Subject cook) {
		this.cook = cook;
		this.locations = new ArrayList<>();
		this.locations.add("Locations:\n");
		this.notes = "\nNotes:\n";
		this.cook.registerObserver(this);
	}
	
	/**
	 * The update updates the ArrayList of where the Subject has been and then adds to the notes.
	 * @param location Where the Subject was.
	 * @param description What the Subject was doing at the corresponding location.
 	 */
	public void update(String location, String description) {
		this.locations.add(location + "\n");
		this.notes += (description + "\n");
	}
	
	/**
	 * This function returns a full String about where the Subject was and what he was doing.
	 * @return
	 */
	public String getLog() {
		String log = "";
		for(String l : locations) {
			log += l;
		}
		log += notes;		
		return log;
	}
}
