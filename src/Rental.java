class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getCharge() {
        return getMovie().getCharge(getDaysRented());
    }

    public int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(getDaysRented());
    }


}

public class ChildrensPrice implements Price {


    public int getPriceCode(){
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented){
         if (daysRented > 3) return (daysRented - 3 ) * 1.5;
           else return 1.5;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}

public class NewReleasePrice implements Price {
    public int getPriceCode(){
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented){
        return (daysRented * 3 );
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 2;
    }

}

public interface Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    abstract int getFrequentRenterPoints(int daysRented);
}

public class RegularPrice implements Price {
    public int getPriceCode(){
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented){
        if (daysRented > 2) return (daysRented - 2 ) * 1.5;
        else return 2;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}