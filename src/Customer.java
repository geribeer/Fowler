
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String newname){
        name = newname;
    };
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();+
            frequentRenterPoints += each.getFrequentRenterPoints();
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) 
                frequentRenterPoints ++;
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints) + " frequent renter points";
        return result;
    }
    
    public String htmlStatement(){
    	Enumeration rentals = _rentals.elements();
    	String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
    	while (rentals.hasMoreElements()){
    		Rental each = (Rental) rentals.nextElement();
    		result += each.getMovie().getTitle() + ": " +String.valueOf(each.getCharge()) + "<BR>\n";
    	}
    	result += >You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
    	sult += "On this rental you earned <EM>" + String.valueOf(getTotalFrequentRenterPoints()) +
    			"</EM> frequent renter points<P>";
    	return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
       Enumeration rentals = _rentals.elements();
       while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           result += each.getFrequentRenterPoints();
       }
       return result;
   }
    
    private double getTotalCharge() {
        double result = 0;
        Enumeration 
        rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
    
    private double amountFor(Rental aRental) {
        return aRental.getCharge();
   }

}
    