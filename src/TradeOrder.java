public class TradeOrder {
	private double price;
	private int shares;
	private String symbol;
	private Trader trader;
	private boolean buy;
	private boolean market;
	
	public TradeOrder(double p, int shr, String smbl, Trader trd, boolean isBuy, boolean mrkt) {
		price = p;
		shares = shr;
		symbol = smbl;
		trader = trd;
		buy = isBuy;
		market = mrkt;
	}
	
	public String toString() {
		String buyOrSell, marketOrLim;
		
		if(buy) {
			buyOrSell = "buy";
		} else {
			buyOrSell = "sell";
		}
	
		if(market) {
			marketOrLim = "market";
		} else {
			marketOrLim = "limit";
		}
		
		return symbol + "\n" + buyOrSell + "\n" + shares + "\n" + marketOrLim + "\n" + Stock.money.format(price);
	}

	public boolean isMarket() {
		return market;
	}
	
	public boolean isLimit() {
		return !market;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void subtractShares(int shares) {

	}
}
