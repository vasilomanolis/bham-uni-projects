import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Vasileios Manolis
 */
public class AircraftTest {

	private Aircraft aircraft1, aircraft2, aircraft3;
	private Aeroplane aeroplane;
	private HotAirBalloon hotAirBaloon1;
	private final static double EPSILON = 1e-6;

	@Before
	public void setUp() {
		aircraft1 = new Aircraft(0, 0, 0);
		aircraft2 = new Aeroplane(100.0, 2, 1, 700.89);
		aircraft3 = new HotAirBalloon(0.5, 100, 140, 50);

		aeroplane = new Aeroplane(900.0, 1499, 600, 1300);
		hotAirBaloon1 = new HotAirBalloon(300.0, 400, 5, 90);
	}

	@Test
	public void test1() {

		String expected1 = "The aircraft has a maximal speed of 0.0 km/h and a maximal weight of 0.0 kg."
				+ " It can carry 0 persons.";
		String actual1 = aircraft1.toString();

		assertEquals(expected1, actual1);

		String expected2 = "The aircraft has a maximal speed of 100.0 km/h and a maximal weight of 2.0 kg."
				+ " It can carry 1 person. It has a range of 700.89 km.";
		String actual2 = aircraft2.toString();

		assertEquals(expected2, actual2);

		String expected3 = "The aircraft has a maximal speed of 0.5 km/h and a maximal weight of 100.0 kg. It can carry 140 persons."
				+ " It has a gas temperature of maximally 50.0\u00B0C.";
		String actual3 = aircraft3.toString();

		assertEquals(expected3, actual3);
	}

	@Test
	public void test2() {

		aircraft2.setMaxPersons(77);
		aircraft3.setMaxPersons(1);

		String expected1 = "The aircraft has a maximal speed of 100.0 km/h and a maximal weight of 2.0 kg."
				+ " It can carry 77 persons. It has a range of 700.89 km.";

		String actual1 = aircraft2.toString();

		assertEquals(expected1, actual1);

		String expected2 = "The aircraft has a maximal speed of 0.5 km/h and a maximal weight of 100.0 kg. It can carry 1 person."
				+ " It has a gas temperature of maximally 50.0\u00B0C.";
		String actual2 = aircraft3.toString();

		assertEquals(expected2, actual2);

	}

	@Test
	public void test3() {

		aircraft1.setMaxSpeed(0);
		aircraft2.setMaxSpeed(77.7);

		double expected1 = 0;
		double actual1 = aircraft1.getMaxSpeed();

		assertEquals(expected1, actual1, EPSILON);

		double expected2 = 77.7;
		double actual2 = aircraft2.getMaxSpeed();

		assertEquals(expected2, actual2, EPSILON);

		aircraft2.setMaxPersons(1);

		String expected3 = "The aircraft has a maximal speed of 77.7 km/h and a maximal weight of 2.0 kg. It can carry 1 person."
				+ " It has a range of 700.89 km.";
		String actual3 = aircraft2.toString();

		assertEquals(expected3, actual3);

	}

	@Test
	public void test4() {
		aeroplane.setRange(0);
		hotAirBaloon1.setGasTemperature(0);

		double expectedRange = 0;
		double actualRange = aeroplane.getRange();

		assertEquals(expectedRange, actualRange, EPSILON);

		double expectedTemp = 0;
		double actualTemp = hotAirBaloon1.getGasTemperature();

		assertEquals(expectedTemp, actualTemp, EPSILON);

		String expected1 = "The aircraft has a maximal speed of 900.0 km/h and a maximal weight of 1499.0 kg."
				+ " It can carry 600 persons. It has a range of 0.0 km.";
		String actual1 = aeroplane.toString();

		assertEquals(expected1, actual1);

		String expected2 = "The aircraft has a maximal speed of 300.0 km/h and a maximal weight of 400.0 kg. It can carry 5 persons."
				+ " It has a gas temperature of maximally 0.0\u00B0C.";
		String actual2 = hotAirBaloon1.toString();

		assertEquals(expected2, actual2);

	}

	@Test
	public void test5() {
		aeroplane.setRange(77.43);
		hotAirBaloon1.setGasTemperature(43.77);

		double expectedRange = 77.43;
		double actualRange = aeroplane.getRange();

		assertEquals(expectedRange, actualRange, EPSILON);

		double expectedTemp = 43.77;
		double actualTemp = hotAirBaloon1.getGasTemperature();

		assertEquals(expectedTemp, actualTemp, EPSILON);

		String expected1 = "The aircraft has a maximal speed of 900.0 km/h and a maximal weight of 1499.0 kg."
				+ " It can carry 600 persons. It has a range of 77.43 km.";
		String actual1 = aeroplane.toString();

		assertEquals(expected1, actual1);

		String expected2 = "The aircraft has a maximal speed of 300.0 km/h and a maximal weight of 400.0 kg. It can carry 5 persons."
				+ " It has a gas temperature of maximally 43.77\u00B0C.";
		String actual2 = hotAirBaloon1.toString();

		assertEquals(expected2, actual2);

	}

}
