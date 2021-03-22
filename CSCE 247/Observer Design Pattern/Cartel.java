package observerdesignpattern;

import java.util.ArrayList;

/**
 * The Cartel class is an implementation of the Observer interface. It is one of two classes that stores information about the Subject.
 * It contains information about the Cook as well as an ArrayList of Sightings (where the cook has been and what he was doing).
 * @author colin
 *
 */

public class Cartel implements Observer {
	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	/**
	 * For the constructor, the Cartel sets the Subject it is observing and also creates the ArrayList it will be using.
	 * On top of that, it also registers with the Subject in order to be an Observer of that Subject.
	 * @param cook The cook parameter is for the Observer to register with. This is the Subject that the Cartel is watching.
	 */
	public Cartel(Subject cook) {
		this.cook = cook;
		this.sightings = new ArrayList<>();
		this.cook.registerObserver(this);
	}
	
	/**
	 * The update method takes in the location of the Subject and the description of what he was doing and adds that to the ArrayList by creating a new Sighting.
	 * @param location This will be a short string about where the Subject was.
	 * @param description This will be a string telling what the Subject was doing at the location.
	 */
	public void update(String location, String description) {
		this.sightings.add(new Sighting(location, description));
	}
	
	/**
	 * getLog returns information about both the location where the Subject has been and what he was doing at the location.
	 * @return
	 */
	public String getLog() {
		String log = "";
		for(Sighting s : sightings) {
			log += s.getLocation() + " " + s.getDetails();
		}
		return log;
	}
}
