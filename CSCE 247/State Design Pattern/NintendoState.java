/**
 * The Nintendo state is one of two game states which actually displays games and can return to the home screen.
 * @author colin
 */
public class NintendoState implements State {
	private GameConsole gameConsole;
	private String[] games = {"Super Smash Bros", "Legend of Zelda", "Dark Souls Remastered", "Diablo III", "Mario Party"};
	
	/**
	 * Takes in a GameConsole instance and uses that as the instance variable for gameConsole.
	 * @param gameConsole The main GameConsole object.
	 */
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Changes the GameConsole's state to NintendoState and prints out the corresponding dialogue.
	 */
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * States that the user is already on the Nintendo and can't change to the system they are currently on.
	 */
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo.");
	}
	
	/**
	 * Changes the GameConsole's state to NintendoState and prints out the corresponding dialogue.
	 */
	public void pressXBoxButton() {
		System.out.println("Starting xBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Prints out the games for the Nintendo.
	 */
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(String game : games) {
			System.out.println(game);
		}
		System.out.println();
	}
}
