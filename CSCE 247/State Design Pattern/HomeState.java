/**
 * The HomeState is the default state of the game console.
 * @author colin
 */
public class HomeState implements State {
	private GameConsole gameConsole;
	
	/**
	 * Takes in a GameConsole instance and uses that as the instance variable for gameConsole.
	 * @param gameConsole The main GameConsole object.
	 */
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Prints out the corresponding dialogue when pressing the home button.
	 */
	public void pressHomeButton() {
		System.out.println("You are already on the home screen.");
	}
	
	/**
	 * Changes the GameConsole's state to NintendoState and prints out the corresponding dialogue.
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * Changes the GameConsole's state to XBoxState and prints out the corresponding dialogue.
	 */
	public void pressXBoxButton() {
		System.out.println("Starting xBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Prints out that no Games can be displayed since you're on the home screen.
	 */
	public void pressGameButton() {
		System.out.println("You have to pick a gaming system to play.");
	}
}
