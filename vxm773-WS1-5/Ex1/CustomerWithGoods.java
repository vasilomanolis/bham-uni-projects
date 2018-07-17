import java.util.ArrayList;

/**
 * A sub-class of Customer class which has the additional field variable
 * ArrayList<Good> goods, which stores the goods a customer has ever ordered.
 * 
 * @author Vasileios Manolis
 * @version 27.11.2017
 */
public class CustomerWithGoods extends Customer {

	private ArrayList<Good> goods;

	/**
	 * A constructor for CustomerWithGoods
	 * 
	 * @param customerName
	 *            the name of the customer
	 * @param address
	 *            the address of the customer
	 * @param telephoneNumber
	 *            the phone number of the customer
	 * @param goods
	 *            the good the customer has ordered
	 */
	public CustomerWithGoods(String customerName, String address, String telephoneNumber, ArrayList<Good> goods) {
		super(customerName, address, telephoneNumber);
		this.goods = goods;
	}

	/**
	 * A getter for the goods the customer has ordered
	 * 
	 * @return the goods the customer has ordered
	 */
	public ArrayList<Good> getGoods() {
		return goods;
	}

	/**
	 * A method that adds new goods to the customer's ordered goods
	 * 
	 * @param good
	 *            the new good to be added
	 */
	public void buy(Good good) {
		goods.add(good);
	}

	/**
	 * A method that returns the value of all goods the customers has ordered
	 * 
	 * @return the total value of all goods the customers has ordered
	 */
	public int valueOfGoods() {
		int valueOfGoods = 0;

		for (int i = 0; i < goods.size(); i++) {
			valueOfGoods = valueOfGoods + goods.get(i).getPrice();
		}
		return valueOfGoods;
	}

	/**
	 * A toString method that prints information about the customer, the goods and
	 * the value of the goods a customer has ordered
	 */
	public String toString() {
		return "Customer Name: " + getCustomerName() + "\nAddress: " + getAddress() + "\nPhone: " + getTelephoneNumber()
				+ "\nTotal Value: " + valueOfGoods() + "$" + "\nGoods Information:" + goods + "\n\n";
	}

	// /**
	// * A test not to be taken into consideraton
	// *
	// * @param args
	// */
	// public static void main(String[] args) {
	//
	// ArrayList<Good> goodslist1 = new ArrayList<Good>();
	// Good Laptop = new Good("Laptop", 1000);
	// Good Laptop2 = new Good("Laptop2", 2000);
	//
	// goodslist1.add(Laptop);
	// goodslist1.add(Laptop2);
	//
	// CustomerWithGoods Vasilis = new CustomerWithGoods("Vasilis", "Bristol Road",
	// "43423222", goodslist1);
	// System.out.println(Vasilis);
	// }

}
