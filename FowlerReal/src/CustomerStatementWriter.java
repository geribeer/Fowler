public interface CustomerStatementWriter {

	public void startStatement(String customerName);

	public void printRental(String movieTitle, int daysRented, double amount);

	public void printSummary(double totalAmount, int frequentRenterPoints);
	
	public void closeStatement();
}
