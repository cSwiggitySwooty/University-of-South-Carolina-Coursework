/**
 * Allows the user to sell stocks when given the name and quantity. 
 * @author Colin Anderson
 *
 */
public class SellStockCommand implements Command {

    private StockTrade stockTrade;
    private String stockName;
    private int shares;

    /**
     * Constructor initializes all values using the data given.
     * @param stockTrade The stock trader to use
     * @param sockName The name of the stock to sell
     * @param shares Number of shares to sell
     */
    public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
    this.stockTrade = stockTrade;
    this.stockName = stockName;
    this.shares = shares;
    }

    /**
     * Sells the given amount of shares of the given stock using the stock trader.
     */
    public void execute() {
        stockTrade.sell(stockName, shares);
    }
}
