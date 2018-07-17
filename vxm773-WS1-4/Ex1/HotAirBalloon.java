
/**
 * An extension of the Aircraft with the additional field of gasTemperature to
 * accommodate HotAirBalloon aircrafts
 * 
 * @author Vasileios Manolis
 * @version 11.11.2017
 */
public class HotAirBalloon extends Aircraft {

	private double gasTemperature;

	/**
	 * Constructor for an HotAirBalloon
	 * 
	 * @param maxSpeed
	 *            the maxSpeed of the aircraft (HotAirBalloon)
	 * @param maxWeight
	 *            the maxWeight of the aircraft (HotAirBalloon)
	 * @param maxPersons
	 *            the maxPerson of the aircraft (HotAirBalloon)
	 * @param gasTemperature
	 *            the gasTemperature of the HotAirBalloon
	 */
	public HotAirBalloon(double maxSpeed, double maxWeight, int maxPersons, double gasTemperature) {
		// First, call the constructor of the superclass.
		super(maxSpeed, maxWeight, maxPersons);
		this.gasTemperature = gasTemperature;
	}

	/**
	 * Getter for the gasTemperature
	 * 
	 * @return the gasTemperature of the aircraft (HotAirBalloon)
	 */
	public double getGasTemperature() {
		return gasTemperature;
	}

	/**
	 * 
	 * Setter for the gasTemperature
	 *
	 * @param gasTemperature
	 */
	public void setGasTemperature(double gasTemperature) {
		this.gasTemperature = gasTemperature;
	}

	@Override
	/**
	 * A to String method that print information about a HotAirBalloon in an easy,
	 * readable way using also the toString of the super class Aircraft.
	 */
	public String toString() {
		return super.toString() + " It has a gas temperature of maximally " + gasTemperature + "°C.";
	}

}
