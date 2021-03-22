/**
 * Allows the user to buy stocks with a given name and quantity. 
 * @author William Rochester
 *
 */
public class BuyStockCommand implements Command {
	
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	/**
	 * Initialized all values using the given data
	 * @param stockTrade The stock trader to use
	 * @param sockName The name of the stock to buy
	 * @param shares Number of shares to buy
	 */
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	
	/**
	 * Buys the given amount of shares of the given stock using the stock trader.
	 */
	public void execute() {
		stockTrade.buy(stockName, shares);
	}

}
