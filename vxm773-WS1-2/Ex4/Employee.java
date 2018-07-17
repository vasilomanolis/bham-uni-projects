/**
 * Class about employees' information. In particular information about their
 * name, hourly salary and the number of hours they work. The class computes
 * the monthly salary (as the product of hourly salary and their number of
 * hours, minus tax computers at a fixed rated). It can also compute a salary
 * increase.
 * 
 * @author Vasileios Manolis
 * @version 2016-10-15
 */

public class Employee {
	private String name;
	private double hourlySalary;
	private int numberOfHours;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            The name of the employee
	 * @param hourlySalary
	 *            The hourlySalary of the employee
	 * @param numberOfHours
	 *            The numberOfHours of the employee
	 */
	public Employee(String name, double hourlySalary, int numberOfHours) {
		this.name = name;
		this.hourlySalary = hourlySalary;
		this.numberOfHours = numberOfHours;
	}

	// Writing the Setters

	/**
	 * @param name
	 *            The new name of the Employee
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param hourlySalary
	 *            The new hourlySalary of the Employee
	 */
	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	/**
	 * @param numberOfHours
	 *            The new numberOfHours of the Employee
	 */
	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	// Writing the Getters

	/**
	 * @return The name of the employee
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return The hourly salary of the employee
	 */
	public double getHourlySalary() {
		return hourlySalary;
	}

	/**
	 * @return The number of hours of the employee
	 */
	public int getNumberOfHours() {
		return numberOfHours;
	}

	/**
	 * return A String that contains the name, the hourly salary and the number of
	 * hours (e.g. "Maria has an hourly salary of 60.5 \u00a3 and has worked last
	 * month for 32 hours."
	 */
	public String toString() {
		return name + " has an hourly salary of " + hourlySalary + " \u00a3 and has worked last month for "
				+ numberOfHours + " hours.";
	}

	/**
	 * @param taxRate
	 *            the tax rate
	 * @return the monthly salary (as the product of hourly salary and their number
	 *         of hours, minus tax computers at a fixed rated)
	 */
	public double monthlySalary(double taxRate) {
		return (hourlySalary * numberOfHours) * (1 - taxRate / 100);
	}

	/**
	 * @param percentage
	 *            the percentage of the increase of the salary
	 */
	public void increaseSalary(double percentage) {
		setHourlySalary(hourlySalary * (1 + percentage / 100));
	}

}
