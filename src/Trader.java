/**
 * 
 */

/**
 * @author MurphyP1
 *
 */

//Where all the login info is stored
public class Trader implements Comparable<Trader> {
	//Maps and sets of all the traders 
	private Brokerage brokerage;
	private String un;
	private String pw;
	
	public Trader(Brokerage b, String u, String p) {
		brokerage = b;
		un = u;
		pw = p;
	}
	
	public String getName() {
		return un;
	}
	
	public String getPassword() {
		return pw;
	}
	
	public String toString() {
		return brokerage +" : " + un;
	}
	
	public String printPassword() {
		return "this is the user's password in plaintext lol " + pw;
	}
	
	public void getQoute(String symbol) {
		brokerage.getQuote(symbol, this);
	}
	
	
	//TODO help me
	@Override
	public int compareTo(Trader arg0) {
		return 7;
	}
	
	public boolean equals(Object other) {
		return (other instanceof Trader );
	}

}
