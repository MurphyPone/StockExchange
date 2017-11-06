
public class SafeTradeTest {

	public static void main(String[] args) {
		Stock s = new Stock("HELPME", "Tutoring Inc.", 99999999.50);
		Stock frown = new Stock("IMSAD", "The end of the semester is nye", -0.005);
		
		System.out.print(s +"\n" + frown);
		
		Brokerage b = new Brokerage();
	}
}
