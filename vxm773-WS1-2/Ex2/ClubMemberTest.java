import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Ex2.
 * 
 * @author Vasileios Manolis
 * 
 */

public class ClubMemberTest {

	private ClubMember c1;

	@Before
	public void setUp() {

		c1 = new ClubMember("John Snow", "7 September 1992", "39195", "Platinum");
	}

	@Test
	public void test1() {

		assertEquals("John Snow", c1.getName());
		assertEquals("7 September 1992", c1.getDateOfBirth());
		assertEquals("39195", c1.getRegistrationNumber());
		assertEquals("Platinum", c1.getMembershipType());
	}

	@Test
	public void test2() {

		c1 = new ClubMember("Danaerys Targeryan", "1 December 1985", "77777", "Gold");

		assertEquals("Danaerys Targeryan", c1.getName());
		assertEquals("1 December 1985", c1.getDateOfBirth());
		assertEquals("77777", c1.getRegistrationNumber());
		assertEquals("Gold", c1.getMembershipType());
	}

	@Test
	public void test3() {

		String expected = "[John Snow, 7 September 1992, ID: 39195, Platinum]";
		assertEquals(expected, c1.toString());
	}

	@Test
	public void test4() {

		c1 = new ClubMember("Bob", "16 March 1979", "32452", "Silver");

		String expected = "[Bob, 16 March 1979, ID: 32452, Silver]";
		assertEquals(expected, c1.toString());
	}

	@Test
	public void test5() {

		c1 = new ClubMember("Zero", "0 March 0", "0", "Zero");

		assertEquals("Zero", c1.getName());
		assertEquals("0 March 0", c1.getDateOfBirth());
		assertEquals("0", c1.getRegistrationNumber());
		assertEquals("Zero", c1.getMembershipType());
	}

	@Test
	public void test6() {

		c1 = new ClubMember("Vasilis", "10 March 1990", "CA300", "Gold");

		assertEquals("Vasilis", c1.getName());
		assertEquals("10 March 1990", c1.getDateOfBirth());
		assertEquals("CA300", c1.getRegistrationNumber());
		assertEquals("Gold", c1.getMembershipType());
	}
}