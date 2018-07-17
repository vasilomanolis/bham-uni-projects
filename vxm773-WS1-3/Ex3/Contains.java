import java.util.ArrayList;

/**
 * 
 * A class that returns an ArrayList of all those integers in a range between
 * the integer "from" inclusively to the integer "to" exclusively which do
 * contain a particular digit.
 * 
 * @author Vasileios Manolis
 * @version 28.10.2017
 *
 */

public class Contains {

	/**
	 * @param from
	 *            the first integer of the checked range
	 * @param to
	 *            the last integer of the checked range
	 * @param containedDigit
	 *            the integer digit that will be checked if it is contained within
	 *            the range [to-from)
	 * @return the ArrayList of all those integers in a range between the integer
	 *         "from" inclusively to the integer "to" exclusively which contain the
	 *         integer "containedDigit"
	 */
	public static ArrayList<Integer> allIntegersWith(int from, int to, int containedDigit) {

		ArrayList<Integer> allIntegersWith = new ArrayList<Integer>();

		for (int i = from; i < to; i++) {
			/*
			 * Using String.valueOf() method to convert integer into string and then use 
			 * "contains" to check if the "containedDigit" is contained within the 
			 * range[to-from).
			 */
			
			if (String.valueOf(i).contains(String.valueOf(containedDigit)))
				allIntegersWith.add(i);
		}
		return allIntegersWith;

	}

}