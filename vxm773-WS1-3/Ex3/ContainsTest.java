import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

/**
 * @author Vasileios Manolis
 */
public class ContainsTest {

	@Test
	public void test1() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 12, 20, 21));
		ArrayList<Integer> actual = Contains.allIntegersWith(2, 22, 2);

		assertEquals(expected, actual);

	}

	@Test
	public void test2() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(-22, -21, -20, -12, -2, 2));
		ArrayList<Integer> actual = Contains.allIntegersWith(-22, 12, 2);

		assertEquals(expected, actual);

	}

	@Test
	public void test3() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(-10, 0));
		ArrayList<Integer> actual = Contains.allIntegersWith(-10, 10, 0);

		assertEquals(expected, actual);

	}

	@Test
	public void test4() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList());
		ArrayList<Integer> actual = Contains.allIntegersWith(10, 16, 7);

		assertEquals(expected, actual);

	}

	@Test
	public void test5() {

		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));
		ArrayList<Integer> actual = Contains.allIntegersWith(0, 1, 0);

		assertEquals(expected, actual);

	}

	@Test
	public void test6() {

		ArrayList<Integer> expected = new ArrayList<Integer>(
				Arrays.asList(17, 27, 37, 47, 57, 67, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 87, 97));
		ArrayList<Integer> actual = Contains.allIntegersWith(10, 100, 7);

		assertEquals(expected, actual);

	}

}