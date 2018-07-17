
/**
 * A class which sorts arrays from the start by going once through the array and
 * always selecting the smallest element from the rest of the array and swapping
 * it with the element currently under consideration.
 * 
 * @author Vasileios Manolis
 * @version 21.10.2017
 */

public class SelectionSort {

	/**
	 * @param arr
	 *            an array of integers
	 * @return the sorted array of integers
	 */
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index]; // smallerNumber is a temporary integer
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

}
