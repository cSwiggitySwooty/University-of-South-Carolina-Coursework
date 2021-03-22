/**
 * Displays information of Stock command actions to the screen
 * 
 * @author nylesgeiger
 *
 */
public class StockTrade {

	public StockTrade() {}

	/**
	 * Notifies user on information about occurring the 'buying' stock action
	 * @param stockName The name of the stock brought
	 * @param numShares the number of shares bought of a stock
	 */
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " + numShares + " of " + stockName);
	}

	/**
	 * Notifies user on information about occurring the 'selling' stock action
	 * @param stockName The name of the stock being sold
	 * @param numShares the number of shares of the stock being sold
	 */
	public void sell(String stockName, int numShares) {
		System.out.println("Selling " + numShares + " of " + stockName);
	}
	
}