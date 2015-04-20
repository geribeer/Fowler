import java.util.Enumeration;
import java.util.Vector;

class Customer {
	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();

	public Customer(String newname) {
		name = newname;
	};

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	};

	public String getName() {
		return name;
	};

	public void statement(CustomerStatementWriter writer) {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Enumeration<Rental> enum_rentals = rentals.elements();

		writer.startStatement(name);

		while (enum_rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental rental = enum_rentals.nextElement();
			// determine amounts for each line
			thisAmount = rental.getRentAmount();
			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if (rental.isBonusPoints()) {
				frequentRenterPoints++;
			}

			// show figures for this rental
			String movieTitle = rental.getMovie().getTitle();
			int daysRented = rental.getDaysRented();
			writer.printRental(movieTitle, daysRented, thisAmount);
			totalAmount += thisAmount;
		}
		// add footer lines
		writer.printSummary(totalAmount, frequentRenterPoints);
		writer.closeStatement();
	}

}
