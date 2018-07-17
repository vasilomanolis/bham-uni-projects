import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that computes the minimum, maximum, mean value (the average value)
 * and the medium (the value that is the middle most values of all values) of a
 * two dimensional array a (e.g. with dimension m x n, temperatures measured at
 * m different weather stations at n difference points in time).
 * 
 * 
 * @author Vasileios Manolis
 * @version 2017.10.29
 */
public class ArrayMethods {
	/**
	 * 
	 * @param a,
	 *            a two dimensional array a (e.g. with dimension m x n, temperatures
	 *            measured at m different weather stations at n difference points in
	 *            time)
	 * @return the maximum value
	 */
	public static double max(double[][] a) {

		int check = a.length;
		double maxValue = 0;

		// Checking with 1 because of the two dimensional array to ensure the array is
		// not empty
		if (check > 1) {

			// assume first element is the max
			maxValue = a[0][0];

			for (int rows = 0; rows < a.length; rows++) {
				for (int columns = 0; columns < a[rows].length; columns++) {
					if ((a[rows][columns]) > maxValue)
						maxValue = a[rows][columns];
				}
			}
		} else {
			throw new IllegalArgumentException();
		}

		return maxValue;
	}

	/**
	 * 
	 * @param a,
	 *            a two dimensional array a (e.g. with dimension m x n, temperatures
	 *            measured at m different weather stations at n difference points in
	 *            time)
	 * @return the minimum value
	 */
	public static double min(double[][] a) {
		int check = a.length;
		double minValue = 0;

		if (check > 1) {

			// assume first element is the min
			minValue = a[0][0];

			for (int rows = 0; rows < a.length; rows++) {
				for (int columns = 0; columns < a[rows].length; columns++) {
					if ((a[rows][columns]) < minValue)
						minValue = a[rows][columns];
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
		return minValue;

	}

	/**
	 * 
	 * @param a,
	 *            a two dimensional array a (e.g. with dimension m x n, temperatures
	 *            measured at m different weather stations at n difference points in
	 *            time)
	 * @return the mean value (the average value)
	 */
	public static double mean(double[][] a) {

		int check = a.length;

		double total = 0;
		int counter = 0;
		if (check > 1) {

			for (int rows = 0; rows < a.length; rows++) {
				for (int columns = 0; columns < a[rows].length; columns++) {
					total = total + a[rows][columns];
					counter = counter + 1;
				}
			}
		} else {
			throw new IllegalArgumentException();

		}
		return total / counter;
	}

	/**
	 * @param a,
	 *            a two dimensional array a (e.g. with dimension m x n, temperatures
	 *            measured at m different weather stations at n difference points in
	 *            time)
	 * @return the median value (the value that is the middle most values of all
	 *         values)
	 */
	public static double median(double[][] a) {

		int check = a.length;
		double median = 0;

		if (check > 1) {

			ArrayList<Double> mergedList = new ArrayList<Double>();

			// Creating an ArrayList that containing all the values of the double array
			for (int rows = 0; rows < a.length; rows++) {
				for (int columns = 0; columns < a[rows].length; columns++) {
					mergedList.add(a[rows][columns]);
				}
			}

			// Sorting the ArrayList

			Collections.sort(mergedList);

			// Calculating the median
			median = 0;

			if (mergedList.size() % 2 == 0) {
				median = ((mergedList.get((mergedList.size() / 2) - 1)
						+ mergedList.get((mergedList.size() / 2) - 1 + 1)) / 2);
			} else {
				median = mergedList.get(((mergedList.size() - 1) / 2));
			}
		}

		else {
			throw new IllegalArgumentException();
		}
		return median;

	}

}