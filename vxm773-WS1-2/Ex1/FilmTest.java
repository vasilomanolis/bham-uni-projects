import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Ex1.
 * 
 * @author Vasileios Manolis
 */

public class FilmTest {

	private Film f1;

	@Before
	public void setUp() {
		f1 = new Film("Fight Club", 1999, 139);
	}

	@Test
	public void test1() {

		f1.setLength(0);

		assertEquals("Fight Club", f1.getTitle());
		assertEquals(1999, f1.getYear());
		assertEquals(0, f1.getLength());
	}

	@Test
	public void test2() {

		f1.setLength(10);

		assertEquals("Fight Club", f1.getTitle());
		assertEquals(1999, f1.getYear());
		assertEquals(10, f1.getLength());
	}

	@Test
	public void test3() {

		f1.setLength(23);

		assertEquals("Fight Club", f1.getTitle());
		assertEquals(1999, f1.getYear());
		assertEquals(23, f1.getLength());
	}

	@Test
	public void test4() {

		f1.setYear(0);

		assertEquals("Fight Club", f1.getTitle());
		assertEquals(0, f1.getYear());
		assertEquals(139, f1.getLength());
	}

	@Test
	public void test5() {

		f1.setLength(77);

		assertEquals("Fight Club", f1.getTitle());
		assertEquals(1999, f1.getYear());
		assertEquals(77, f1.getLength());
	}

	@Test
	public void test6() {

		f1.setTitle("Fight Club Zero");
		f1.setYear(0);
		f1.setLength(0);

		assertEquals("Fight Club Zero", f1.getTitle());
		assertEquals(0, f1.getYear());
		assertEquals(0, f1.getLength());
	}
}