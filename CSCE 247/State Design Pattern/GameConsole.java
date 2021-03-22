/**
 * The GameConsole class contains all the different types of states available and calls them when a button is pressed.
 * @author colin
 */
public class GameConsole {
	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	/**
	 * The constructor simply creates new objects for the different states and begins with the home state.
	 */
	GameConsole() {
		HomeState = new HomeState(this);
		NintendoState = new NintendoState(this);
		xBoxState = new XBoxState(this);
		state = HomeState;
		System.out.println("Starting up the Game Console\n");
	}
	
	/**
	 * Presses the current state's home button.
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	/**
	 * Presses the current state's Nintendo button.
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	
	/**
	 * Presses the current state's XBox button.
	 */
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	
	/**
	 * Presses the current state's game button.
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	/**
	 * Sets the current state to the given state.
	 * @param state The new state.
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Returns the current home state
	 * @return A state which is the current home state.
	 */
	public State getHomeState() {
		return this.HomeState;
	}
	
	/**
	 * Returns the current Nintendo state
	 * @return A state which is the current Nintendo state.
	 */
	public State getNintendoState() {
		return this.NintendoState;
	}
	
	/**
	 * Returns the current Xbox state
	 * @return A state which is the current Xbox state.
	 */
	public State getXBoxState() {
		return this.xBoxState;
	}
}
