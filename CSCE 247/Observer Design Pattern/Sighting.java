package observerdesignpattern;

/**
 * The Sighting class is used by the Cartel, and it is a concise way of storing data.
 * It stores the location and details of what happened with ways to access and modify that data.
 * @author colin
 *
 */

public class Sighting {
	private String location;
	private String details;
	
	/**
	 * The constructor simply stores the information in the two variables.
	 * @param location Where the Subject was.
	 * @param details What he was doing at the time.
	 */
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}
	
	/**
	 * getLocation returns the location of the Subject.
	 * @return
	 */
	public String getLocation() {
		return this.location;
	}
	
	/**
	 * getDetails returns what the Subject was doing (with some formatting).
	 * @return
	 */
	public String getDetails() {
		return ("(" + this.details + ")\n");
	}
}
