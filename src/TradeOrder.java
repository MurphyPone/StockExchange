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
	
	public TradeOrder(Trader order, String smbl, boolean bOrder, boolean mrktOrder, int nShares, double prc) {
		this.trader = order;
		this.symbol = smbl;
		this.buy = bOrder;
		this.market = mrktOrder;
		this.shares = nShares;
		this.price = prc;
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
	
	
	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public boolean isBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setMarket(boolean market) {
		this.market = market;
	}

	public void subtractShares(int shares) {
		//TODO;;;
	}
}
