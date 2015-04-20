
public  class PriceCodeNewRelease extends PriceCode{
	
	private final static double DAY_FACTOR=3;
	
	public  double calcPrice(int daysRent)
	{
		double price=daysRent*DAY_FACTOR;
        return price;
	}
	
}