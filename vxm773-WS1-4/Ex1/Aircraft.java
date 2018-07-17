
/**
 * A class that has as input the maxSpeed, maxWeight and maxPersons of an
 * aircraft and prints that information in a easy, readable way.
 * 
 * @author Vasileios Manolis
 * @version 11.11.2017
 */
public class Aircraft {

	private double maxSpeed;
	private double maxWeight;
	private int maxPersons;

	/**
	 * A constructor for an Aircraft
	 * 
	 * @param maxSpeed
	 *            the maxSpeed of the aircraft
	 * @param maxWeight
	 *            the maxWeight of the aircraft
	 * @param maxPersons
	 *            the maxPerson of the aircraft
	 */
	public Aircraft(double maxSpeed, double maxWeight, int maxPersons) {
		this.maxSpeed = maxSpeed;
		this.maxWeight = maxWeight;
		this.maxPersons = maxPersons;
	}

	/**
	 * Getter for maxSpeed
	 * 
	 * @return the maxSpeed
	 */
	public double getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * Setter for maxSpeed
	 * 
	 * @param maxSpeed
	 *            the maxSpeed to set
	 */
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * Getter for maxWeight
	 * 
	 * @return the maxWeight
	 */
	public double getMaxWeight() {
		return maxWeight;
	}

	/**
	 * Setter for maxWeight
	 * 
	 * @param maxWeight
	 *            the maxWeight to set
	 */
	public void setMaxWeight(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	/**
	 * Getter for maxPersons
	 * 
	 * @return the maxPersons
	 */
	public int getMaxPersons() {
		return maxPersons;
	}

	/**
	 * Setter for maxPersons
	 * 
	 * @param maxPersons
	 *            the maxPersons to set
	 */
	public void setMaxPersons(int maxPersons) {
		this.maxPersons = maxPersons;
	}

	/**
	 * A toString method that prints information in a easy readable way
	 */
	public String toString() {

		if (maxPersons == 1) {
			return "The aircraft has a maximal speed of " + maxSpeed + " km/h and a maximal weight of " + maxWeight
					+ " kg. It can carry " + maxPersons + " person.";
		} else {

			return "The aircraft has a maximal speed of " + maxSpeed + " km/h and a maximal weight of " + maxWeight
					+ " kg. It can carry " + maxPersons + " persons.";
		}

	}

}
