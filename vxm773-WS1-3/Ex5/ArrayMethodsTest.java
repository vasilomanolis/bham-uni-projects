import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * 
 * @author Vasileios Manolis
 *
 */
public class ArrayMethodsTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private final static double EPSILON = 1e-6;

	@Test
	public void test1() {

		double[][] a = { { 4, 0, 3, 1 }, { 5.4, -2.3, 0, 0, 1 } };

		double expectedMin = -2.3;
		double expectedMax = 5.4;
		double expectedMean = 1.3444444444444;
		double expectedMedium = 1;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	@Test
	public void test2() {

		double[][] a = { { 0, 0, 0 }, { 0, 0, 0 } };

		double expectedMin = 0;
		double expectedMax = 0;
		double expectedMean = 0;
		double expectedMedium = 0;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	@Test
	public void test3() {

		double[][] a = { {} };
		exception.expect(IllegalArgumentException.class);
		ArrayMethods.min(a);
	}

	@Test
	public void test4() {

		double[][] a = { {} };
		exception.expect(IllegalArgumentException.class);
		ArrayMethods.max(a);
	}

	@Test
	public void test5() {

		double[][] a = { {} };
		exception.expect(IllegalArgumentException.class);
		ArrayMethods.mean(a);
	}

	@Test
	public void test6() {

		double[][] a = { {} };
		exception.expect(IllegalArgumentException.class);
		ArrayMethods.median(a);
	}

	@Test
	public void test7() {

		double[][] a = { { 9.88, 3, 2, 1, -1000 }, { 6.2, 5.3, -2 } };

		double expectedMin = -1000;
		double expectedMax = 9.88;
		double expectedMean = -121.8275;
		double expectedMedium = 2.5;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

	@Test
	public void test8() {

		double[][] a = { { 1, 1, 1 }, { 0, 0 } };

		double expectedMin = 0;
		double expectedMax = 1;
		double expectedMean = 0.6;
		double expectedMedium = 1;

		assertEquals(expectedMin, ArrayMethods.min(a), EPSILON);
		assertEquals(expectedMax, ArrayMethods.max(a), EPSILON);
		assertEquals(expectedMean, ArrayMethods.mean(a), EPSILON);
		assertEquals(expectedMedium, ArrayMethods.median(a), EPSILON);
	}

}