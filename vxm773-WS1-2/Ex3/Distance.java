/**
 * Class to convert distances given in kilometres to metres, miles and yards
 * 
 * @author Vasileios Manolis
 * @version 2016-10-15
 */

public class Distance {
	private double km;

	/**
	 * Constructor
	 * 
	 * @param km
	 *            Distance in kilometres
	 */
	public Distance(double km) {
		this.km = km;
	}

	/**
	 * @return Distance in miles 1 mile = 1.60934 kilometres
	 */
	public double getMiles() {
		return km / 1.60934;
	}

	/**
	 * @return Distance in kilometres
	 */
	public double getKilometres() {
		return km;
	}

	/**
	 * @return Distance in metres 1 metre = 0.001 kilometres
	 */
	public double getMetres() {
		return km * 1000;
	}

	/**
	 * @return Distance in yards 1 mile = 1.60934 kilometres & 1 mile = 1760 yards
	 *         1760 yards = 1.60934 km
	 */
	public double getYards() {
		return km * (1760 / 1.60934);
	}

}
