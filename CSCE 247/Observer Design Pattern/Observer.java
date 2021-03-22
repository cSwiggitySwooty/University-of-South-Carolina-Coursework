package observerdesignpattern;

/**
 * The Observer interface is the one that the DEA and Cartel will have to follow in order to get information from the Subject.
 * @author colin
 *
 */

public interface Observer {
	
	/**
	 * The update function will take information from the updateObservers command that the Subject has.
	 * @param location This will be a short string about where the Subject was.
	 * @param description This will be a string telling what the Subject was doing at the location.
	 */
	public void update(String location, String description);
	
	/**
	 * getLog returns information about both the location where the Subject has been and what he was doing at the location.
	 * @return
	 */
	public String getLog();
}
