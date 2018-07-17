
/**
 * A class that creates objects of type Good with a getters for the price of
 * goods and a toString method that prints information about Goods in a easily,
 * readable way.
 * 
 * @author Vasileios Manolis
 * @version 27.112017
 *
 */
public class Good {
	private String name;
	private int price;

	/**
	 * Constructor for a good
	 * 
	 * @param name
	 *            the name of the good
	 * @param price
	 *            the price of the good
	 */
	public Good(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	/**
	 * A getter for the price of the good
	 * 
	 * @return the price of the good
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * A toString method that prints information about Goods in a easily, readable
	 * way.
	 */
	public String toString() {
		return name + " for " + price + "$";
	}

	// An example
	public static void main(String[] args) {
		Good g1 = new Good("GoodN1", 1000);
		System.out.println(g1);

	}

}
