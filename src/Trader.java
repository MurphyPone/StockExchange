/**
 * 
 */

/**
 * @author MurphyP1
 *
 */
import java.util.ArrayList;

//Where all the login info is stored
public class Trader implements Comparable<Trader> {
	//Maps and sets of all the traders 
	private Brokerage brokerage;
	private String un;
	private String pw;
	private ArrayList<String> mailbox;
	private TraderWindow myWindow;
	
	public Trader(Brokerage b, String u, String p) {
		brokerage = b;
		un = u;
		pw = p;
		mailbox = new ArrayList<String>();
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
	
	public void getQuote(String symbol) {
		brokerage.getQuote(symbol, this);
	}
	
	public boolean hasMessages() {
		return mailbox.size() > 0;
	}
	
	public void receiveMessage(String msg) {
		mailbox.add(msg);
		if(myWindow != null) {
			for(int i = mailbox.size()-1; i > 0; i--) {
				myWindow.showMessage(mailbox.remove(i));	//Thanks Patrick
			}
		}
	}
	
	//Logout the user
	public void quit() {
		brokerage.logout(this);
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
