package factorydesignpattern;

/**
 * The Bakery class is only used for creating the cakes so that it's more convenient.
 * @author colin
 */

public class Bakery {
	
	/**
	 * The orderCake function first creates the cake by calling the createCake function. After that, it then calls the object cake's createCake function.
	 * @param type Takes in a string that determines which type of cake is made.
	 * @return The cake that was created.
	 */
	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		cake.createCake();
		System.out.println(cake.getPrice());
		return cake;
	}
	
	/**
	 * This function simply takes in a string and then creates a cake based off of the string that was inputted.
	 * @param type Takes in a string that determines which type of cake is made.
	 * @return The cake that was created.
	 */
	private Cake createCake(String type) {
		if(type.equalsIgnoreCase("carrot cake")) {
			return new CarrotCake();
		}
		else if(type.equalsIgnoreCase("black forest cake")) {
			return new BlackForestCake();
		}
		else if(type.equalsIgnoreCase("birthday cake")) {
			return new BirthdayCake();
		}
		return null;
	}
}
