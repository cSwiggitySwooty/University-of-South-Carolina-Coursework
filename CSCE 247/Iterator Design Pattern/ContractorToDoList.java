package iteratordesignpattern;

import java.util.ArrayList;

/**
 * The ContractorToDoList is the main class for this project. It holds a variety of things, including an array of ToDos, it's address, and how many items are in the ToDo list.
 * @author colin
 */

public class ContractorToDoList {

	private String address;
	private ToDo[] todos;
	int count;
	
	/**
	 * The constructor simply sets the address based off of the input and initializes the array.
	 * @param address This is a string representing the address of the location.
	 */
	public ContractorToDoList(String address) {
		this.address = address;
		todos = new ToDo[2];
	}
	
	/**
	 * This addToDo method creates a new ToDo and adds it to the ContractorToDoList's ToDo array.
	 * @param title The title of the ToDo in the form of a string.
	 * @param description A string describing the ToDo.
	 * @param price A double representing the price of the ToDo.
	 * @param contact A string representing the contact of the ToDo.
	 * @param supplies An ArrayList of type String that represents the supplies needed.
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo newTodo = new ToDo(title, description, price, contact, supplies);
		if(this.todos.length == count) {
			this.todos = growArray(todos);
		}
		todos[count] = newTodo;
		count++;
	}
	
	/**
	 * Creates a new ToDoIterator by passing in the ToDo array and then returns that ToDoIterator.
	 * @return A new ToDoIterator that contains the same array that the ContractorToDoList has.
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(this.todos);
	}
	
	/**
	 * Gets the address of the specific contract
	 * @return A string containing the address.
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Sums up all costs of individual ToDos in the ToDo array and then returns that sum.
	 * @return A double that contains the sum of all costs.
	 */
	public double getTotalCost() {
		int sum = 0;
		for(int i = 0; i < this.count; i++) {
			sum += this.todos[i].getPrice();
		}
		return sum;
	}
	
	/**
	 * This function doubles the size of the ToDo array.
	 * @param todos Takes in an array containing ToDos.
	 * @return An array that contains all elements of the previous array with double the space.
	 */
	private ToDo[] growArray(ToDo[] todos) {
		ToDo[] newTodos = new ToDo[count * 2];
		for(int i = 0; i < this.todos.length; i++) {
			newTodos[i] = this.todos[i];
		}
		return newTodos;
	}
}
