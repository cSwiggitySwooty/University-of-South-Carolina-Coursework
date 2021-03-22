import java.util.ArrayList;

/**
 * Agent class has the ability to maintain a list of commands and to execute
 * each one 
 * @author nylesgeiger
 *
 */
public class Agent {

	private ArrayList<Command> orders;

	/**
	 * initializes a list of commands
	 */
	public Agent() {
		orders = new ArrayList<Command>();
	}

	/**
	 * Adds given command to the list
	 * @param command a command
	 */
	public void placeOrder(Command command) {
		orders.add(command);
	}

	/**
	 * Performs the execute method for every command in the list
	 */
	public void processOrders() {

		for (Command order : orders) {
			order.execute();
		}

	}

}