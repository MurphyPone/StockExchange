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
				else if(t1.isLimit() && t2.isLimit())
					if (asc) 
						return (int) (t2.getPrice() - t1.getPrice()) * 100;
					else 
						return (int) (t1.getPrice() - t2.getPrice()) * 100;
		return 7;
	}

	public boolean isAsc() {
		return asc;
	}
}
