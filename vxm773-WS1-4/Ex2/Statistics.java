import java.util.function.Function;

/**
 * A class that computes the mean and the standard deviation of the application
 * of a function to a non- empty array of elements, respectively. The mean μ (or
 * arithmetic average) is computed by summing up the elements and dividing by
 * the number of elements. The standard deviation σ is defined as the square
 * root of the average quadratic differences of the elements from the mean.
 * 
 * @author Vasileios Manolis
 * @version 12.11.2017
 */
public class Statistics {

	/**
	 * A method that calculates the mean of the application of a function to a non-
	 * empty array of elements.
	 * 
	 * @param f
	 *            a function
	 * @param argumentValues
	 *            a non-empty array of elements
	 * @return the mean of the of the application of a function to a non- empty
	 *         array of elements
	 */
	public static double mean(Function<Double, Double> f, double[] argumentValues) {
		double counterMean = 0;
		double sumMean = 0;
		double mean = 0;

		for (int i = 0; i < argumentValues.length; i++) {
			sumMean = sumMean + f.apply(argumentValues[i]);
			counterMean = counterMean + 1;
		}

		mean = sumMean / counterMean;

		return mean;

	}

	/**
	 * A method that calculates the standardDeviation of the application of a
	 * function to a non- empty array of elements.
	 * 
	 * @param f
	 *            a function
	 * @param argumentValues
	 *            a non-empty array of elements
	 * @return the standardDeviation of the of the application of a function to a
	 *         non- empty array of elements
	 */
	public static double standardDeviation(Function<Double, Double> f, double[] argumentValues) {
		double counterSD = 0;
		double sumSD = 0;
		double standardDeviation = 0;
		double mean = mean(f, argumentValues);

		for (int i = 0; i < argumentValues.length; i++) {
			sumSD = sumSD + Math.pow((f.apply(argumentValues[i]) - mean), 2);
			counterSD = counterSD + 1;
		}
		standardDeviation = Math.sqrt(sumSD / counterSD);

		return standardDeviation;

	}

}
