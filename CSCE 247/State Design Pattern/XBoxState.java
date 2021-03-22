/**
 * The XBox state is one of two game states which actually displays games and can return to the home screen.
 * @author colin
 */
public class XBoxState implements State {
	private GameConsole gameConsole;
	private String[] games = {"Overwatch", "Smite", "Dark Souls III", "Call of Duty: Black Ops II", "GTAV"};
	
	/**
	 * Takes in a GameConsole instance and uses that as the instance variable for gameConsole.
	 * @param gameConsole The main GameConsole object.
	 */
	public XBoxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Changes the GameConsole's state to HomeState and prints out the corresponding dialogue.
	 */
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * Changes the GameConsole's state to NintendoState and prints out the corresponding dialogue.
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * States that the user is already on the Xbox and can't change to the system they are currently on.
	 */
	public void pressXBoxButton() {
		System.out.println("You are already viewing XBox.");
	}
	
	/**
	 * Prints out the games for the Xbox.
	 */
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(String game : games) {
			System.out.println(game);
		}
		System.out.println();
	}
}
