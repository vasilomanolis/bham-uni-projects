import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Ex5.
 * 
 * @author Vasileios Manolis
 * 
 */

public class ComplexTest {

	private Complex c1, c2, c3, c4, c5;
	private final static double EPSILON = 1e-6;

	@Before
	public void setUp() {
		c1 = new Complex(0, 0);
		c2 = new Complex(1, 0);
		c3 = new Complex(0, 1);
		c4 = new Complex(2, 4);
		c5 = new Complex(7, 10);
	}

	@Test
	public void test1() {

		Complex c6 = c1.add(c2);

		assertEquals(1.0, c6.getRealPart(), EPSILON);
		assertEquals(0.0, c6.getImaginaryPart(), EPSILON);

		assertEquals(0.0, c1.getRealPart(), EPSILON);
		assertEquals(0.0, c1.getImaginaryPart(), EPSILON);

		assertEquals(1.0, c2.getRealPart(), EPSILON);
		assertEquals(0.0, c2.getImaginaryPart(), EPSILON);

		String expected = "1.0 + 0.0i";
		assertEquals(expected, c6.toString());

	}

	@Test
	public void test2() {

		Complex c6 = c2.multiply(c3);

		assertEquals(0.0, c6.getRealPart(), EPSILON);
		assertEquals(1.0, c6.getImaginaryPart(), EPSILON);

		assertEquals(1.0, c2.getRealPart(), EPSILON);
		assertEquals(0.0, c2.getImaginaryPart(), EPSILON);

		assertEquals(0.0, c3.getRealPart(), EPSILON);
		assertEquals(1.0, c3.getImaginaryPart(), EPSILON);

		String expected = "0.0 + 1.0i";
		assertEquals(expected, c6.toString());

	}

	@Test
	public void test3() {

		Complex c6 = c4.add(c5);

		assertEquals(9.0, c6.getRealPart(), EPSILON);
		assertEquals(14.0, c6.getImaginaryPart(), EPSILON);

		assertEquals(2.0, c4.getRealPart(), EPSILON);
		assertEquals(4.0, c4.getImaginaryPart(), EPSILON);

		assertEquals(7.0, c5.getRealPart(), EPSILON);
		assertEquals(10.0, c5.getImaginaryPart(), EPSILON);

		String expected = "9.0 + 14.0i";
		assertEquals(expected, c6.toString());

	}

	@Test
	public void test4() {

		Complex c6 = c4.multiply(c5);

		assertEquals(-26.0, c6.getRealPart(), EPSILON);
		assertEquals(48.0, c6.getImaginaryPart(), EPSILON);

		assertEquals(2.0, c4.getRealPart(), EPSILON);
		assertEquals(4.0, c4.getImaginaryPart(), EPSILON);

		assertEquals(7.0, c5.getRealPart(), EPSILON);
		assertEquals(10.0, c5.getImaginaryPart(), EPSILON);

		String expected = "-26.0 + 48.0i";
		assertEquals(expected, c6.toString());

	}

	@Test
	public void test5() {

		Complex c6 = c5.add(c5);

		assertEquals(14.0, c6.getRealPart(), EPSILON);
		assertEquals(20.0, c6.getImaginaryPart(), EPSILON);

		assertEquals(7.0, c5.getRealPart(), EPSILON);
		assertEquals(10.0, c5.getImaginaryPart(), EPSILON);

		String expected = "14.0 + 20.0i";
		assertEquals(expected, c6.toString());

	}

	@Test
	public void test6() {

		Complex c6 = c1.add(c5);

		assertEquals(7.0, c6.getRealPart(), EPSILON);
		assertEquals(10.0, c6.getImaginaryPart(), EPSILON);

		assertEquals(0.0, c1.getRealPart(), EPSILON);
		assertEquals(0.0, c1.getImaginaryPart(), EPSILON);

		assertEquals(7.0, c5.getRealPart(), EPSILON);
		assertEquals(10.0, c5.getImaginaryPart(), EPSILON);

		String expected = "7.0 + 10.0i";
		assertEquals(expected, c6.toString());

	}

}