import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Ex3.
 * 
 * @author Vasileios Manolis
 * 
 */

public class DistanceTest {

	private Distance d1, d2;

	@Before
	public void setUp() {
		d1 = new Distance(5.6);
		d2 = new Distance(10.1);
	}

	@Test
	public void test1() {
		double expected = 5.6;
		assertEquals(expected, d1.getKilometres(), 0.00000001);
	}

	@Test
	public void test2() {
		double expected = 3.4796873252;
		assertEquals(expected, d1.getMiles(), 0.00000001);
	}

	@Test
	public void test3() {

		double expected = 5600;
		assertEquals(expected, d1.getMetres(), 0.000001);
	}

	@Test
	public void test4() {

		double expected = 6124.2496924205;
		assertEquals(expected, d1.getYards(), 0.000001);
	}

	@Test
	public void test5() {

		double expected = 10.1;
		assertEquals(expected, d2.getKilometres(), 0.00000001);
	}

	@Test
	public void test6() {

		double expected = 10100;
		assertEquals(expected, d2.getMetres(), 0.000001);
	}

}