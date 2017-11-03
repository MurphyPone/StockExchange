import java.util.HashMap;

public class StockExchange {
	HashMap<String, Stock> listedStocks; 
	
	public StockExchange() {
		listedStocks = new HashMap<String, Stock>();
	}
	
	public String getQuote(String symbol) {
		if(listedStocks.get(symbol) == null) {
			throw new IllegalArgumentException("oop");
		}
		return listedStocks.get(symbol).getQuote();
	}

	public void listStock(String symbol, String name, double price) {
		listedStocks.put(symbol, new Stock(symbol, name, price));
	}
	 
	public void placeOrder(TradeOrder order) {	//Is a trade order a plural amount of individual stocks? Why do they have such similar fields?! :(
		if(listedStocks.get(order.getSymbol()) == null) {
			throw new IllegalArgumentException("oop");
		}
		listedStocks.get(order.getSymbol()).placeOrder(order);	//puke
	}
}
