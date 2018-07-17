/**
 * @author <Vasileios Manolis> This class contains the solution for Worksheet1
 */

public class Worksheet1 {

	// Exercise 1

	/**
	 * A recursive algorithm for raising integer m to the power of integer n (both
	 * non- negative)
	 * 
	 * @param m
	 *            an integer (m is raised to the power of the integer n)
	 * @param n
	 *            an integer (m is raised to the power of the integer n)
	 * @return the power of integer m raised to the integer n (both non- negative)
	 */
	public static int power(int m, int n) {
		if (n == 0)
			return 1;
		else
			return power(m, n - 1) * m;
	}

	/**
	 * A alternative recursive algorithm for raising integer m to the power of
	 * integer n (both non- negative)
	 * 
	 * @param m
	 *            an integer (m is raised to the power of the integer n)
	 * @param n
	 *            an integer (m is raised to the power of the integer n)
	 * @return the power of integer m raised to the integer n (both non- negative)
	 */
	public static int fastPower(int m, int n) {
		if (n == 0)
			return 1;
		else if (n % 2 == 0)
			return fastPower(m, n / 2) * fastPower(m, n / 2);
		else
			return m * fastPower(m, n - 1);
	}

	// Exercise 2

	/**
	 * Given a list of integers a, this is a method that returns a new list with all
	 * the elements of a with sign negated, i.e., positive integers become negatives
	 * and negative integers become positives. Example: [2, -5, 8, 0] ==> [-2, 5,
	 * -8, 0]
	 * 
	 * @param a
	 *            a list of integers
	 * @return a new list with all the elements of a with sign negate
	 */
	public static List<Integer> negateAll(List<Integer> a) {
		if (a.isEmpty())
			return a;
		else
			return new List<Integer>(-a.getHead(), negateAll(a.getTail()));

	}

	// Exercise 3
	/**
	 * Given an integer x which is assumed to be in the list a, this is a method
	 * that returns the position of the first occurrence of x in a. Positions are
	 * counted as 0, 1, 2, . . .. If x does not appear in the list, you should throw
	 * an IllegalArgumentException. Examples: x: 3 a:[7,5,3,8] ==> 2 x: 2 a: [7, 5,
	 * 3, 8] ==> IllegalArgumentException
	 * 
	 * @param x
	 *            an integer x which is assumed to be in the list a
	 * @param a
	 *            a list of integers
	 * @return the position of the first occurrence of x in a
	 */
	public static int find(int x, List<Integer> a) {
		if (a.isEmpty())
			throw new IllegalArgumentException();
		else if (x == a.getHead())
			return 0;
		else
			return 1 + find(x, a.getTail());
	}

	// Exercise 4

	/**
	 * Given a list of integers a, this is a method that returns a boolean value
	 * indicating whether all its elements are positive, i.e., ≥ 0.
	 * 
	 * @param a
	 *            a list of integers
	 * @return a boolean value indicating whether all its elements are positive
	 */
	public static boolean allPositive(List<Integer> a) {
		if (a.isEmpty())
			return true;
		else if (a.getHead() < 0)
			return false;
		else
			return allPositive(a.getTail());
	}

	// Exercise 5

	/**
	 * Given a list of integers a, this is a method that returns a new list which
	 * contains all the positive elements of a. The elements should appear in the
	 * result in the same relative order as in a. Example: [2, 3, -5, 8, -2] ==> [2,
	 * 3, 8]
	 * 
	 * @param a
	 *            a list of integers
	 * @return a new list which contains all the positive elements of a
	 */
	public static List<Integer> positives(List<Integer> a) {
		if (a.isEmpty())
			return a;
		else if (a.getHead() >= 0)
			return new List<Integer>(a.getHead(), positives(a.getTail()));
		else
			return positives(a.getTail());
	}

	// Exercise 6

	/**
	 * Given a list of integers a, this method must return a boolean value
	 * indicating whether a is sorted in increasing order. (There can be duplicate
	 * copies of elements. But, sortedness would require that all the duplicate
	 * copies would appear together.)
	 * 
	 * @param a
	 *            a list of integers
	 * @return a boolean value indicating whether a is sorted in increasing order.
	 */
	public static boolean sorted(List<Integer> a) {
		if (a.isEmpty())
			return true;
		else if (a.isEmpty() == false) {
			if ((a.getHead() > a.getTail().getHead()))
				return false;
		} else {
			return sorted(a.getTail());
		}
		return true;
	}

	// Exercise 7
	/**
	 * 
	 * Given two sorted lists a and b, this is a method that returns a new sorted
	 * list that contains all the elements of a and all the elements of b. Any
	 * duplicate copies of elements in a or b or their combination are retained.
	 * Examples: a: [2, 5, 5, 8] b:[5, 7, 8, 9] ==> [2, 5, 5, 5, 7, 8, 8, 9] a: [2,
	 * 5, 5, 8] b:[9] ==> [2, 5, 5, 8, 9]
	 * 
	 * @param a
	 *            a sorted list of integers
	 * @param b
	 *            a sorted list of integers
	 * @return a new sorted list that contains all the elements of a and all the
	 *         elements of b
	 */
	public static List<Integer> merge(List<Integer> a, List<Integer> b) {
		if (a.isEmpty() || b.isEmpty()) {
			if (a.isEmpty() && b.isEmpty())
				return a;
			else if (a.isEmpty())
				return b;
			else if (b.isEmpty())
				return a;
		}

		else if (a.getHead() <= b.getHead())
			return new List<Integer>(a.getHead(), merge(a.getTail(), b));
		else
			return new List<Integer>(b.getHead(), merge(a, b.getTail()));

		return a;
	}

	// Exercise 8

	/**
	 * Given a sorted list a, this method returns a copy of the list a with all
	 * duplicate copies removed. Example: [2, 5, 5, 5, 7, 8, 8, 9] ==> [2, 5, 7, 8,
	 * 9]
	 * 
	 * @param a
	 *            a list of integers
	 * @return a copy of the list a with all duplicate copies removed
	 */
	static List<Integer> removeDuplicates(List<Integer> a) {
		if (a.isEmpty() || a.getTail().isEmpty())
			return a;

		if (a.getHead() != a.getTail().getHead()) {
			return new List<Integer>(a.getHead(), removeDuplicates(a.getTail()));
		}
		// else if ( a.getHead() == a.getTail().getHead() ) {
		// return a.getTail(); }
		else if (a.getHead() == a.getTail().getHead()) {
			return removeDuplicates(a.getTail());
		}
		return a;

	}

	// /**
	// * NOT TO BE MARKED, THIS IS A MAIN METHOD WITH A FEW EXAMPLES PEDAGOGIC
	// REASONS,
	// * FOR BETTER UNDERSTANDING. PLEASE, NOT TO BE MARKED BY THE TUTOR.
	// *
	// */
	// public static void main(String[] args) {
	// List<Integer> L = new List<Integer>();
	// L = new List<Integer>(15, L);
	// L = new List<Integer>(-10, L);
	// L = new List<Integer>(5, L);
	//
	// List<Integer> a = new List<Integer>();
	// a = new List<Integer>(3, a);
	// a = new List<Integer>(3, a);
	// a = new List<Integer>(2, a);
	// a = new List<Integer>(1, a);
	//
	// List<Integer> b = new List<Integer>();
	// b = new List<Integer>(7, b);
	// b = new List<Integer>(3, b);
	// b = new List<Integer>(3, b);
	// b = new List<Integer>(1, b);
	//
	// System.out.println(merge(a, b));
	//
	// List<Integer> duplicates = new List<Integer>();
	// duplicates = new List<Integer>(9, duplicates);
	//
	// duplicates = new List<Integer>(9, duplicates);
	// duplicates = new List<Integer>(8, duplicates);
	// duplicates = new List<Integer>(8, duplicates);
	// duplicates = new List<Integer>(7, duplicates);
	// duplicates = new List<Integer>(5, duplicates);
	// duplicates = new List<Integer>(5, duplicates);
	// duplicates = new List<Integer>(5, duplicates);
	// duplicates = new List<Integer>(2, duplicates);
	//
	// System.out.println(removeDuplicates(duplicates));
	//
	// L = new List<Integer>(15, L);
	//
	// System.out.println(L.getHead());
	// System.out.println(L.getTail().getHead());
	// System.out.println(find(5, L));
	// System.out.println(allPositive(L));
	// System.out.println(positives(L));
	//
	// System.out.println(sorted(L));
	// System.out.println(removeDuplicates(L));
	//
	// System.out.print(power(2, 4));
	// System.out.print(fastPower(2, 4));
	//
	// }
}
