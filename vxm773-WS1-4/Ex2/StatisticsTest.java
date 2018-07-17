import static org.junit.Assert.assertEquals;
import java.util.function.Function;
import org.junit.Test;

/**
 * @author Vasileios Manolis
 *
 */
public class StatisticsTest {

	private final static double EPSILON = 1e-6;

	@Test
	public void test1() {

		Function<Double, Double> f1 = x -> x * x;
		double[] a = { 0, 3, 4, 3, 2 };

		double expectedMean = 7.6;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 5.388877434122992;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
	}

	@Test
	public void test2() {

		Function<Double, Double> f1 = x -> Math.pow(x, 2);
		double[] a = { 2, 4, 8, 10 };

		double expectedMean = 46.0;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 38.41874542459709;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);

	}

	@Test
	public void test3() {

		Function<Double, Double> f1 = x -> Math.tan(x);
		double[] a = { -3, -2, -5, 0, 0, 2, 1, 4 };

		double expectedMean = 0.7797863195406679;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 1.5771229716646524;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);

	}

	@Test
	public void test4() {

		Function<Double, Double> f1 = x -> x * 0;
		double[] a = { 0, 0, 0, 0, 0 };

		double expectedMean = 0;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 0;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);

	}

	// public test
	@Test
	public void test5() {

		Function<Double, Double> f1 = x -> x;
		double[] a = { 5, 5, 5, 5, 5, 5, 5 };

		double expectedMean = 5;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 0;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);

	}

	@Test
	public void test6() {

		Function<Double, Double> f1 = x -> Math.sin(x);
		double[] a = { -2.4, -4, 4, 3, 2, 1 };

		double expectedMean = 0.2027375398570491;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 0.696412900400492;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
	}

	@Test
	public void test7() {

		Function<Double, Double> f1 = x -> Math.tan(x);
		double[] a = { 3, -3, 7 };

		double expectedMean = 0.29048266090810626;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 0.4269738835160674;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
	}

	@Test
	public void test8() {

		Function<Double, Double> f1 = x -> Math.tan(Math.tan(x));
		double[] a = { -10, 10 };

		double expectedMean = 0.0;
		double actualMean = Statistics.mean(f1, a);
		assertEquals(expectedMean, actualMean, EPSILON);

		double expectedStd = 0.7576211478872673;
		double actualStd = Statistics.standardDeviation(f1, a);
		assertEquals(expectedStd, actualStd, EPSILON);
	}

}
