/**
 * 
 */

/**
 * @author MurphyP1
 *
 */
import java.text.DecimalFormat;
import java.util.PriorityQueue;

public class Stock implements Comparable<Stock> {
	//Fields
	private String symbol;
	private String name;
	private double price;
	private double lowPrice, highPrice, lastPrice, dayVolume, askPrice;
	
	private PriorityQueue<TradeOrder> buyOrders;
	private PriorityQueue<TradeOrder> sellOrders;
	
	public static DecimalFormat money = new DecimalFormat("$#,##0.00");
	
	Stock(String s, String n, double p) {
		symbol = s;
		name = n;
		
		price = p;
		lowPrice = p;
		highPrice = p;
		lastPrice = p;
		dayVolume = 0;
		askPrice = lastPrice;
		
		buyOrders = new PriorityQueue<TradeOrder>();
		sellOrders = new PriorityQueue<TradeOrder>();
		
	}
	
	public String getQuote() {
		return name + " (" + symbol + ") \n "
				+ "Price: " + price + " hi: " + lowPrice + " hi: " + highPrice + " vol: " + dayVolume
				+"\n Ask: " + askPrice + " size: " + price + " Bid: " + dayVolume ;
	}
	
	public void placeOrder(TradeOrder order) {
		
	}
	
	public String toString() {
		return symbol + " " + name + " " + money.format(price); 
	}
	
	@Override
	public int compareTo(Stock arg0) {
		// TODO Auto-generated method stub
		return (int) (lastPrice - this.lastPrice);
	}
	
}
