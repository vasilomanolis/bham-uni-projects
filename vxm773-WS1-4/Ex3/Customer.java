/**
 * A public class Customer that implements the interface Sortable.
 * 
 * @author Vasileios Manolis
 * @version 13.11.2017
 */
public class Customer implements Sortable {

	private String name;
	private double totalMoneySpent;
	private String address;

	/**
	 * 
	 * @param name
	 *            the name of the customer
	 * @param totalMoneySpent
	 *            the total money spent by the customer
	 * @param address
	 *            the address of the customer
	 */
	public Customer(String name, double totalMoneySpent, String address) {
		this.name = name;
		this.totalMoneySpent = totalMoneySpent;
		this.address = address;
	}

	/**
	 * 
	 * A toString method that return information of a Customer (name, total money
	 * spent, address)
	 */
	public String toString() {
		return "A customer with name, total money spent and address " + name + ", " + totalMoneySpent + ", " + address
				+ " respectively.";
	}

	/**
	 * A method that returns the total money spent by a customer
	 * 
	 * @returns the total money spent by the customer
	 */
	public double compareValue() {
		return totalMoneySpent;
	}

}