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
    
    double getCharge(){
    	return _movie.getCharge(_daysRented);
    }
    
    int getFrequentRenterPoints(){
    	return _movie.getFrequentRenterPoints(_dayRented);
    }
    
}