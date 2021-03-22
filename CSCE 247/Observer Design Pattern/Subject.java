package observerdesignpattern;

/**
 * This is an interface that only the cook will use. It has the functions register, remove, and notify observers.
 * @author colin
 *
 */

public interface Subject {
	
	/**
	 * The registerObserver function will add an observer to an ArrayList that the cook has.
	 * @param observer The observer will be someone watching the cook. Either the DEA or the Cartel.
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * The removeObserver method will remove an observer from the cook's ArrayList.
	 * @param observer The observer will be someone watching the cook. Either the DEA or the Cartel.
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * notifyObservers will give the observers information about where the cook has been.
	 * @param location The location will be a short string telling the observers where the cook has been.
	 * @param description The description will tell the observers what the cook was doing at the corresponding location.
	 */
	public void notifyObservers(String location, String description);
}
