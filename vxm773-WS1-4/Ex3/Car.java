/**
 * A public class Car that implements the interface Sortable.
 * 
 * @author Vasileios Manolis
 * @version 13.11.2017
 */
public class Car implements Sortable {

	private double maxSpeed;
	private String carNumber;
	private String make;

	/**
	 * A constructor of a Car
	 * 
	 * @param maxSpeed
	 *            the maxSpeed of the car
	 * @param carNumber
	 *            the car number
	 * @param make
	 *            the maker of the car
	 */
	public Car(double maxSpeed, String carNumber, String make) {
		this.maxSpeed = maxSpeed;
		this.carNumber = carNumber;
		this.make = make;
	}

	/**
	 * 
	 * A toString method that return information of a Car (max speed, car number and
	 * maker)
	 */
	public String toString() {
		return "A car with max speed, car number and maker " + maxSpeed + ", " + carNumber + ", " + make
				+ " respectively.";
	}

	/**
	 * A method that returns the max speed of the car
	 * 
	 * @returns the max speed of the car
	 */
	public double compareValue() {
		return maxSpeed;
	}

}