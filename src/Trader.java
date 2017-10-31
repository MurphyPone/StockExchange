/**
 * 
 */

/**
 * @author MurphyP1
 *
 */

//Where all the login info is stored
public class Trader {
	//Maps and sets of all the traders 
	private Brokerage brokerage;
	private String un;
	private String pw;
	
	public Trader(Brokerage b, String u, String p) {
		brokerage = b;
		un = u;
		pw = p;
	}
	
	public String toString() {
		return brokerage +" : " + un;
	}
}
