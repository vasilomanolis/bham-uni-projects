import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Vasileios Manolis
 */

public class SelectionSortTest {

	@Test
	public void test1() {

		int[] a = { 4, 1, 4, 8, 3, 9, 0 };

		int[] expected = { 0, 1, 3, 4, 4, 8, 9 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {

		int[] a = { 5, -3, 20, 7, 0, -17 };

		int[] expected = { -17, -3, 0, 5, 7, 20 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test3() {

		int[] a = { 9, 4, 2, 66, 34, 2, 6, -435, -1 };

		int[] expected = { -435, -1, 2, 2, 4, 6, 9, 34, 66 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test4() {

		int[] a = { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 2, 2, 2 };

		int[] expected = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test5() {

		int[] a = { 4 };

		int[] expected = { 4 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test6() {

		int[] a = { 8, 0, Integer.MIN_VALUE, -5 };

		int[] expected = { Integer.MIN_VALUE, -5, 0, 8 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test7() {

		int[] a = {};

		int[] expected = {};
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test8() {

		int[] a = { 0 };

		int[] expected = { 0 };
		int[] actual = SelectionSort.selectionSort(a);

		assertArrayEquals(expected, actual);
	}
}
