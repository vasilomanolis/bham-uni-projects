import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author Vasileios Manolis
 */

public class StarRatingTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void test1() {

		double rating = 1.0;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test2() {

		double rating = 1.7;

		String expected = "CRAP";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test3() {

		double rating = 4.0;

		String expected = "OK";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test4() {

		double rating = 4.44;

		String expected = "OK";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test5() {

		double rating = 4.5;

		String expected = "EXCELLENT";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test6() {

		double rating = 5.0;

		String expected = "[HAS ONLY ONE REVIEW]";
		String actual = StarRating.interpret(rating);

		assertEquals(expected, actual);
	}

	@Test
	public void test7() {

		double rating = 0.5;

		exception.expect(IllegalArgumentException.class);
		StarRating.interpret(rating);
	}

	@Test
	public void test8() {

		double rating = 5.4;

		exception.expect(IllegalArgumentException.class);
		StarRating.interpret(rating);
	}

	@Test
	public void test9() {

		double rating = -1.1;

		exception.expect(IllegalArgumentException.class);
		StarRating.interpret(rating);

	}
}