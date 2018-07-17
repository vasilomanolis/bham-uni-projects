/**
 * @author Editor: Vasileios Manolis, Authors: Alex Evangelidis and Manfred
 *         Kerber
 * @version Edited version 2017-11-13, Original version 2017-10-25
 *
 *          This class was edited for the WS4 by Vasileios Manolis. The
 *          quickSort algorithm in the class Sorting has been modified from the
 *          lab lecture of Week 5 so that it works for any array of objects of
 *          classes implementing the interface Sortable (such as Car[] or
 *          Customer[]) with respect to the values given by compareValue().
 *
 *          The class originally contained implementations of two sorting
 *          algorithms, bubbleSort and quickSort. Furthermore we have a method
 *          to check whether a given array of type Sortable[] is sorted.
 *
 */
public class Sorting {
	/**
	 * @param a
	 *            An array for which it is to be checked whether it is sorted.
	 * @return true if and only if the array sorted in increasing order.
	 */
	public static boolean isSorted(Sortable[] a) {
		/*
		 * As soon as a single pair of adjecent values is out of order the array is not
		 * sorted, hence false is returned.
		 */
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i].compareValue() > a[i + 1].compareValue()) {
				return false;
			}
		}
		/*
		 * If no pair of adjecent values is out of order the array is sorted, hence true
		 * is returned.
		 */
		return true;
	}

//	/**
//	 * @param numbers
//	 *            The array takes an (unsorted) array of Sortable.
//	 * @return The same numbers, but in ascending order.
//	 */
//	public static Sortable[] bubbleSort(Sortable[] numbers) {
//		Sortable tmp;
//		int size = numbers.length;
//		/*
//		 * The loop invariant for the outer loop is that the first i elements will be in
//		 * the correct order. Initially that is the first 0 elements will be in the
//		 * correct order, then the first, then the first two and so on, that is in each
//		 * round one more element will be in the right order from the left. Furthermore,
//		 * the arrays will always contain the same elements.
//		 */
//		for (int i = 1; i < size; i++) {
//			/*
//			 * The loop invariant for the inner loop is that the smallest element between i
//			 * and the end of the array can be found among the elements between i and j. If
//			 * the smallest element is toward the right of the array it will be moved
//			 * forward. As a consequence the smallest element will be in position i after
//			 * the loop terminates.
//			 */
//			for (int j = size - 1; j >= i; j--) {
//				if (numbers[j].compareValue() < numbers[j - 1].compareValue()) {
//					tmp = numbers[j];
//					numbers[j] = numbers[j - 1];
//					numbers[j - 1] = tmp;
//				}
//			}
//		}
//		return numbers;
//	}

	/**
	 * Helper method to call quickSort.
	 * 
	 * @param a
	 *            The array to be sorted
	 * @return The sorted array.
	 */
	public static Sortable[] quickSort(Sortable[] a) {
		if (a.length == 0) {
			return a;
		}
		return quickSort(a, 0, a.length - 1);
	}

	/**
	 * @param a
	 *            The array to be sorted in a range.
	 * @param start
	 *            The smallest index in the range of the array to be sorted.
	 * @param end
	 *            The largest index in the range of the array to be sorted.
	 * @return The value of the pivot.
	 */
	public static Sortable determinePivot(Sortable[] a, int start, int end) {
		// first get the pivot index (middle index of the array)
		int pivot_index = start + (end - start) / 2;

		// Use pivot to store the middle element of the array
		return a[pivot_index];
	}

	/**
	 * Performs in-place quicksort over the provided array,
	 * 
	 * @param a
	 *            The array to be sorted in a range.
	 * @param start
	 *            The smallest index in the range of the array to be sorted.
	 * @param end
	 *            The largest index in the range of the array to be sorted.
	 * @return The array in which the specified range is sorted.
	 */
	public static Sortable[] quickSort(Sortable[] a, int start, int end) {
		Sortable temp;
		int i = start;
		int j = end;

		Sortable pivot = determinePivot(a, start, end);

		// As long as i and j do not cross
		while (i <= j) {

			// Scan the array from left to right as long as the
			// value is less than the pivot
			while (a[i].compareValue() < pivot.compareValue()) {
				i++;
			}

			// Scan the array from right to left as long as
			// the value is greater than the pivot
			while (a[j].compareValue() > pivot.compareValue()) {
				j--;
			}

			// In the case where the ith element
			// is greater than the pivot
			// or in the case where the jth element
			// is less than the pivot
			// Swap i with j and increment and decrement
			// i and j, respectively.

			if (i <= j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}

		// At this point the partitioning phase
		// has been completed because i and j cross
		// Now call the same method recursively
		// for the two sub arrays("left" and "right")
		if (start < j) {
			quickSort(a, start, j);
		}
		if (i < end) {
			quickSort(a, i, end);
		}
		return a;
	}
}