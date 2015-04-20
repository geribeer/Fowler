public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price _price;
    ublic Movie(String name, int priceCode) {
        title = name;
        setPriceCode(priceCode);
      }
    public int getPriceCode() {
        return _price.getPriceCode();
     }
     public void setPriceCode(int arg) {
         switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
            case CHILDRENS:
            _price = new ChildrensPrice();
            break;
            case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
        throw new IllegalArgumentException("Incorrect Price Code");
         }
     }
    public String getTitle (){
        return title;
    };
    
    int getFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
           return 2;
        else
           return 1;
    }
    
    double getCharge(int daysRented) {
    	 return _price.getCharge(daysRented);
    }
}