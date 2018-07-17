import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Vasileios Manolis
 */

public class EratosthenesTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void test1() {

		int max = 15;

		int[] expected = { 2, 3, 5, 7, 11, 13 };
		int[] actual = Eratosthenes.sieve(max);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {

		int max = 17;

		int[] expected = { 2, 3, 5, 7, 11, 13, 17 };

		int[] actual = Eratosthenes.sieve(max);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test3() {

		int max = 503;

		int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197,
				199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317,
				331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449,
				457, 461, 463, 467, 479, 487, 491, 499, 503 };
		int[] actual = Eratosthenes.sieve(max);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test4() {

		int max = 0;

		exception.expect(IllegalArgumentException.class);
		Eratosthenes.sieve(max);
	}

	@Test
	public void test5() {

		int max = 1;

		exception.expect(IllegalArgumentException.class);
		Eratosthenes.sieve(max);
	}

	@Test
	public void test6() {

		int max = -5;

		exception.expect(IllegalArgumentException.class);
		Eratosthenes.sieve(max);

	}

	@Test
	public void test7() {

		int max = 2;

		int[] expected = { 2 };
		int[] actual = Eratosthenes.sieve(max);

		assertArrayEquals(expected, actual);
	}

}