
/**
 * An extension of the Aircraft with the additional field of range to
 * accommodate Aeroplane aircrafts
 * 
 * @author Vasileios Manolis
 * @version 11.11.2017
 */
public class Aeroplane extends Aircraft {

	private double range;

	/**
	 * A constructor for Aeroplane
	 * 
	 * @param maxSpeed
	 *            the maxSpeed of the aircraft (HotAirBalloon)
	 * @param maxWeight
	 *            the maxWeight of the aircraft (HotAirBalloon)
	 * @param maxPersons
	 *            the maxPerson of the aircraft (HotAirBalloon)
	 * @param range
	 *            the range of the HotAirBalloon
	 */
	public Aeroplane(double maxSpeed, double maxWeight, int maxPersons, double range) {
		// First, call the constructor of the superclass
		super(maxSpeed, maxWeight, maxPersons);
		this.range = range;
	}

	/**
	 * Getter for the range
	 * 
	 * @return the range of the aircraft (Aeroplane)
	 */
	public double getRange() {
		return range;
	}

	/**
	 * Setter for the range
	 * 
	 * @param range
	 *            the range of the aircraft (Aeroplane)
	 */
	public void setRange(double range) {
		this.range = range;
	}

	@Override
	/**
	 * A to String method that print information about a Aeroplane in an easy,
	 * readable way using also the toString of the super class Aircraft.
	 * 
	 */
	public String toString() {
		return super.toString() + " It has a range of " + range + " km.";
	}

}