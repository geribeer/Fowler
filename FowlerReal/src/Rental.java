class Rental {

	private final static int BONUS_POINTS_MINIMUMDAYS = 1;
	private Movie movie;
	private int daysRented;

	public Rental(Movie newmovie, int newdaysRented) {
		movie = newmovie;
		daysRented = newdaysRented;
	}

	public double getRentAmount() {
		PriceCode priceCode = movie.getPriceCode();
		double price = priceCode.calcPrice(daysRented);
		return price;
	}

	public boolean isBonusPoints() {
		if (movie.getPriceCode() instanceof PriceCodeNewRelease) {
			if (daysRented > BONUS_POINTS_MINIMUMDAYS) {
				return true;
			}
		}
		return false;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

}