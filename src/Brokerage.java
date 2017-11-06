import java.util.TreeMap;
import java.util.TreeSet;

//Collection of maps and sets of users and stocks
public class Brokerage implements Login {	//Login interface?
	private StockExchange exchange;
	private TreeMap<String, Trader> registeredTraders;
	private TreeSet<Trader> loggedInTraders;
	
	//Default Constructor
	public Brokerage() {
		exchange = new StockExchange();
		registeredTraders = new TreeMap<String, Trader>();
		loggedInTraders = new TreeSet<Trader>();
	}
	
	public Brokerage(StockExchange ex) {
		exchange = ex;
		registeredTraders = new TreeMap<String, Trader>();
		loggedInTraders = new TreeSet<Trader>();
	}
	
	public void getQuote(String symbol, Trader trader) {
		trader.receiveMessage(exchange.getQuote(symbol));
	}
	
	public int addUser(String name, String password) {
		int len = name.length();
		if(len < 4 || len > 10) 
			return -1;
		len = password.length();
		
		if (len < 2 || len > 10)
			return -2;
		
		if(registeredTraders.containsKey(name))
			return -2;
		
		registeredTraders.put(name, new Trader(this, name, password));
		return 0; //successful 
	}
	
	public int login(String name, String password) {
		Trader trader = registeredTraders.get(name);
		
		if(trader == null )
			return -1;
		String storedPassword = trader.getPassword();
		if(!storedPassword.equals(password))
			return -2;
		if(registeredTraders.containsValue(trader))
			return -3;
		
		loggedInTraders.add(trader);
		if(!trader.hasMessages())	//If no messages waiting
			trader.receiveMessage("Welcome to Safe Trade");	//Display welcome
	
		return 0;
	}
	
	public void logout(Trader trader) {
		if(registeredTraders.containsValue(trader))
			loggedInTraders.remove(trader);
	}
	
	public void placeOrder(TradeOrder order) {
		exchange.placeOrder(order);
	}

}
