package iteratordesignpattern;

import java.util.Iterator;

/**
 * This ToDoIterator class is for looping through the ToDo list easily, containing a hasNext() and next() method (implements the Iterator interface).
 * @author colin
 */

public class ToDoIterator implements Iterator<ToDo> {
	
	private ToDo[] todos;
	private int position;
	
	/**
	 * The constructor initializes the array of ToDos and the position variable.
	 * @param todos An array of ToDos to be looped through.
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
		this.position = 0;
	}
	
	/**
	 * This method checks to see if there is another element in the ToDo array.
	 */
	public boolean hasNext() {
		if(this.todos.length <= this.position) {
			return false;
		}
		if(this.todos[this.position] != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * This method simply returns the ToDo of the current position then increments the position.
	 * @return The ToDo attributed to the current position.
	 */
	public ToDo next() {
		ToDo ret = todos[this.position];
		this.position++;
		return ret;
	}
	
}
