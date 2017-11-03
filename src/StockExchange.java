import java.util.HashMap;

public class StockExchange {
	HashMap<String, Stock> listedStocks; 
	
	public StockExchange(String s) {
		//What is the value for the "Stock"????
		listedStocks = new HashMap<s, Stock>();
	}
	
	public String getQuote(String symbol) {
		//.get() takes in a value, not the key ?!??!?!?!
		return listedStocks.get(symbol).getQuote();
	}

	public void listStock(String symbol, String name, double price) {
		listedStocks.add(new Stock(symbol, name, price));
	}
	
	public void placeOrder(TradeOrder order) {	//Is a trade order a plural amount of individual stocks? Why do they have such similar fields?! :(
		order.symbol.placeOrder;	//how to get the individual stock based on the symbol
	}
}
