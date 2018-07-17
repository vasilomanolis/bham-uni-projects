import java.util.ArrayList;

/**
 *
 * A class CustomerBase with the single field variable private
 * ArrayList<CustomerWithGoods> allCustomers, an ArrayList which contains all
 * customers of a company together with the goods they ever ordered.
 * 
 * @author Vasileios Manolis
 * @version 27.11.2017
 *
 */
public class CustomerBase {

	private ArrayList<CustomerWithGoods> allCustomers;

	/**
	 * A constructor for a CustomerBase
	 * 
	 * @param allCustomers
	 *            an ArrayList with the all customers of a company
	 */
	public CustomerBase(ArrayList<CustomerWithGoods> allCustomers) {
		super();
		this.allCustomers = allCustomers;
	}

	/**
	 * A method that adds a customer to an an ArrayList with the all customers of a
	 * company
	 * 
	 * @param customer
	 *            a customer of the company
	 */
	public void addCustomer(CustomerWithGoods customer) {
		allCustomers.add(customer);
	}

	/**
	 * The method filterLoyal is to collect from the customer base of all customers
	 * those customers who have an above average number of orders.
	 * 
	 * @return a ArrayList with those customers who have an above average number of
	 *         orders.
	 */
	public ArrayList<CustomerWithGoods> filterLoyal() {

		int sumOfOrders = 0;
		ArrayList<CustomerWithGoods> loyalCustomers = new ArrayList<CustomerWithGoods>();

		for (CustomerWithGoods Customer : allCustomers) {
			sumOfOrders = sumOfOrders + Customer.getGoods().size();
		}

		double averageOrders = sumOfOrders / (double) allCustomers.size();

		for (CustomerWithGoods Customer : allCustomers) {
			if (Customer.getGoods().size() > averageOrders) {
				loyalCustomers.add(Customer);
			}

		}

		return loyalCustomers;
	}

	/**
	 * A method to collect all those customers for whom the value of all their
	 * orders combined is above average.
	 * 
	 * @return an ArrayList with those customers for whom the value of all their
	 *         orders combined is above average.
	 */
	public ArrayList<CustomerWithGoods> filterValued() {

		double valueOfAllGoods = 0;
		ArrayList<CustomerWithGoods> valuedCustomers = new ArrayList<CustomerWithGoods>();

		for (CustomerWithGoods Customer : allCustomers) {
			valueOfAllGoods = valueOfAllGoods + Customer.valueOfGoods();
		}

		double sumOfAverageValue = valueOfAllGoods / (double) allCustomers.size();

		for (CustomerWithGoods Customer : allCustomers)
			if (Customer.valueOfGoods() > sumOfAverageValue) {
				valuedCustomers.add(Customer);
			}

		return valuedCustomers;
	}

}
