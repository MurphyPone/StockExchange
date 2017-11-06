import java.util.Comparator;

public class PriceComparator implements Comparator<TradeOrder> {

	private boolean asc;	//If true, make an ascending comparator
	
	PriceComparator() { 
		asc = true;
	} 
	
	PriceComparator(boolean ascending){
		asc = ascending;
	}
	
	public int compare(TradeOrder t1, TradeOrder t2) {
		if(t1.isMarket() && t2.isMarket())
			return 0;
		else 
			if(t1.isMarket() && t2.isLimit())
				return -1;
			else 
				if(t1.isLimit() && t2.isMarket() )
					return 1;
				else { //Both are limit
					int pennies1 = (int)(100.0 * t1.getPrice() + 0.5);
					int pennies2 = (int)(100.0 * t2.getPrice() + 0.5);
					
					if(asc)
						return pennies1 - pennies2;
					else 
						return pennies2 - pennies1;
				}
	}

	public boolean isAsc() {
		return asc;
	}
}
