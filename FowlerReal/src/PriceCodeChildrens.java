
public  class PriceCodeChildrens extends PriceCode{
	
	private final static double MINIMUM_PRICE=1.5;
	private final static int EXTRA_PAY_MINIMUMDAYS=3;
	private final static double EXTRA_PAY_FACTOR=1.5;
	
	public  double calcPrice(int daysRent)
	{
		double price=MINIMUM_PRICE;
        if (daysRent > EXTRA_PAY_MINIMUMDAYS)
        {
        	int payDays=daysRent-EXTRA_PAY_MINIMUMDAYS;
        	price+=payDays*EXTRA_PAY_FACTOR;
        }
        return price;
	}
	
}