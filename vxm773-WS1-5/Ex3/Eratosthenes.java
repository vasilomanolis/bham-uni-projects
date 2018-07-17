import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class with a method public static int[] sieve(int max) which returns the
 * array of all prime numbers between 1 and n (n included if it is a prime
 * number) in increasing order. If the given maximum number is less or equals to
 * 1, then an IllegalArgumentException is thrown as prime numbers |a prime
 * number (or a prime) is a natural number greater than 1 that has no positive
 * divisors other than 1 and itself".
 * 
 * @author Vasileios Manolis
 * @version 25.11.2017
 *
 */
public class Eratosthenes {

	/**
	 * A method that returns the array of all prime numbers between 1 and n (n
	 * included if it is a prime number) in increasing order.
	 * 
	 * @param max
	 *            the maximum number of the array between 1 and max
	 * @return array of all prime numbers between 1 and n (n included if it is a
	 *         prime number) in increasing order.
	 */
	public static int[] sieve(int max) { 

		// If the given maximum number is less or equals to
		// 1, then an IllegalArgumentException is thrown as prime numbers |a prime
		// number (or a prime) is a natural number greater than 1 that has no positive
		// divisors other than 1 and itself".

		if (max <= 1) {
			throw new IllegalArgumentException(
					"Please give a number greater than 1 as negative numbers, 0 and 1 are not negative numbers by definition.");
		}

		else {

			// An ArrayList which will save the value of each prime number is initialized
			ArrayList<Integer> primeNumberList = new ArrayList<>();

			// An array of boolean is initialized with length max+1.
			boolean[] sieve = new boolean[max + 1]; 

			// By definition 0 and 1 are not prime numbers.
			sieve[0] = false;
			sieve[1] = false;
			// Initially all value from 2 are set to True.
			for (int i = 2; i < sieve.length; i++) { // Let A be an array of Boolean values, indexed by integers 2 to n,
				sieve[i] = true; // initially all set to true.
			}

			for (int i = 2; i <= max; i++) {
				if (sieve[i] == true) {
					primeNumberList.add(i);
					for (int j = i + 1; j <= max; j++) { 
						if (j % i == 0) {
							sieve[j] = false;
						}
					}

				}
			}

			int[] PrimeNumberArray = new int[primeNumberList.size()];
			for (int i = 0; i < PrimeNumberArray.length; i++) {
				PrimeNumberArray[i] = primeNumberList.get(i);
			}

			return PrimeNumberArray;

		}

	}

	// An example
	public static void main(String[] args_) {
		// For negative number, 0 and 1 an IllegalArgumentException is thrown.
		// System.out.println(Arrays.toString(sieve(-5)));
		// System.out.println(Arrays.toString(sieve(0)));
		// System.out.println(Arrays.toString(sieve(1)));
		System.out.println(Arrays.toString(sieve(7)));
		System.out.println(Arrays.toString(sieve(9)));
		System.out.println(Arrays.toString(sieve(17)));

	}

}
