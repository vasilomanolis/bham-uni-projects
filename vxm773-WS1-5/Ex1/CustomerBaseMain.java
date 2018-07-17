import java.util.ArrayList;

/**
 * A class with a main method,that can be used in the viva
 * 
 * @author Vasileios Manolis
 * @version 29.11.2017
 *
 */
public class CustomerBaseMain {

	public static void main(String[] args) {

		// Firstly, we create a few Goods
		Good Laptop = new Good("Laptop", 7000);
		Good PC = new Good("PC", 700);
		Good PlayStation4 = new Good("PlayStation 4", 500);
		Good plant = new Good("plant", 2);
		Good phone = new Good("Nokia 3310", 25);
		Good cable = new Good("USB Cable", 1);

		// Secondly, we create a few Order Lists

		ArrayList<Good> listWithOrdersCustomer1 = new ArrayList<Good>();
		ArrayList<Good> listWithOrdersCustomer2 = new ArrayList<Good>();
		ArrayList<Good> listWithOrdersCustomer3 = new ArrayList<Good>();
		ArrayList<Good> listWithOrdersCustomer4 = new ArrayList<Good>();

		// Thirdly, we create a few CustomersWithGoods

		CustomerWithGoods customerWithGoods1 = new CustomerWithGoods("Tim Berners-Lee", "CERN Street, Geneva",
				"07777777", listWithOrdersCustomer1);

		CustomerWithGoods customerWithGoods2 = new CustomerWithGoods("Marie Curie", "Bristol Road 35", "066666666",
				listWithOrdersCustomer2);

		CustomerWithGoods customerWithGoods3 = new CustomerWithGoods("Albert Einsten", "Bristol Road 53", "0888888",
				listWithOrdersCustomer3);

		CustomerWithGoods customerWithGoods4 = new CustomerWithGoods("Newton", "Bristol Road 7", "099999999",
				listWithOrdersCustomer4);

		// Fourthly, each CustomerWithGoods goes for shopping

		customerWithGoods1.buy(Laptop);
		customerWithGoods1.buy(PC);

		customerWithGoods2.buy(PC);
		customerWithGoods2.buy(Laptop);
		customerWithGoods2.buy(PlayStation4);

		customerWithGoods3.buy(plant);
		customerWithGoods3.buy(phone);
		customerWithGoods3.buy(cable);
		customerWithGoods3.buy(cable);

		ArrayList<CustomerWithGoods> allAmazonCustomers = new ArrayList<CustomerWithGoods>();
		CustomerBase amazonCustomerBase = new CustomerBase(allAmazonCustomers);

		amazonCustomerBase.addCustomer(customerWithGoods1);
		amazonCustomerBase.addCustomer(customerWithGoods2);
		amazonCustomerBase.addCustomer(customerWithGoods3);
		amazonCustomerBase.addCustomer(customerWithGoods4);

		System.out.println("CUSTOMER 1");
		System.out.println(customerWithGoods1);
		System.out.println();

		System.out.println("CUSTOMER 2");
		System.out.println(customerWithGoods2);
		System.out.println();

		System.out.println("CUSTOMER 3");
		System.out.println(customerWithGoods3);
		System.out.println();

		System.out.println("CUSTOMER 4");
		System.out.println(customerWithGoods4);
		System.out.println();

		System.out.println("LOYAL CUSTOMERS");
		System.out.println(amazonCustomerBase.filterLoyal());
		System.out.println();

		System.out.println("VALUABLE CUSTOMERS");
		System.out.println(amazonCustomerBase.filterValued());
		System.out.println();

	}

}
