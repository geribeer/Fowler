public class ConsoleStatementWriter implements CustomerStatementWriter {

	private String output;

	@Override
	public void startStatement(String customerName) {
		output = "Rental Record for " + customerName + "\n";
		output += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
	}

	@Override
	public void printRental(String movieTitle, int daysRented, double amount) {
		output += "\t" + movieTitle + "\t" + "\t" + daysRented + "\t" + amount + "\n";
	}

	@Override
	public void printSummary(double totalAmount, int frequentRenterPoints) {
		output += "Amount owed is " + totalAmount + "\n";
		output += "You earned " + frequentRenterPoints + " frequent renter points";
	}

	@Override
	public void closeStatement() {
		// orint statement
		System.out.println(output);
	}

}
