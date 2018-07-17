import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Ex4.
 * 
 * @author Vasileios Manolis
 */

public class EmployeeTest {

	private Employee emp1;
	private final static double EPSILON = 1e-6;

	@Before
	public void setUp() {
		emp1 = new Employee("Michael Jackson", 50, 100);
	}

	@Test
	public void test1() {

		emp1.setName("Jackson");
		emp1.setHourlySalary(60);
		emp1.setNumberOfHours(150);

		assertEquals("Jackson", emp1.getName());
		assertEquals(60, emp1.getHourlySalary(), EPSILON);
		assertEquals(150, emp1.getNumberOfHours());
	}

	@Test
	public void test2() {

		emp1.setName("Janet");
		emp1.setHourlySalary(70);
		emp1.setNumberOfHours(0);

		assertEquals("Janet", emp1.getName());
		assertEquals(70, emp1.getHourlySalary(), EPSILON);
		assertEquals(0, emp1.getNumberOfHours());
	}

	@Test
	public void test3() {

		String expected = "Michael Jackson has an hourly salary of 50.0 \u00a3 and has worked last month for 100 hours.";

		assertEquals(expected, emp1.toString());
	}

	@Test
	public void test4() {

		emp1.setHourlySalary(60.5);
		emp1.setNumberOfHours(0);

		String expected = "Michael Jackson has an hourly salary of 60.5 \u00a3 and has worked last month for 0 hours.";

		assertEquals(expected, emp1.toString());

		assertEquals(0, emp1.monthlySalary(10), EPSILON);

		emp1.increaseSalary(10);

		assertEquals(66.55, emp1.getHourlySalary(), EPSILON);
	}

	@Test
	public void test5() {

		emp1.setHourlySalary(60.5);
		emp1.setNumberOfHours(0);

		String expected = "Michael Jackson has an hourly salary of 60.5 \u00a3 and has worked last month for 0 hours.";

		assertEquals(expected, emp1.toString());

		assertEquals(0, emp1.monthlySalary(10), EPSILON);

		emp1.increaseSalary(0);

		assertEquals(60.5, emp1.getHourlySalary(), EPSILON);
	}

	@Test
	public void test6() {

		emp1.setHourlySalary(0);
		emp1.setNumberOfHours(0);

		emp1.increaseSalary(0);
		emp1.increaseSalary(0);
		assertEquals(0.0, emp1.monthlySalary(0), EPSILON);

		String expected = "Michael Jackson has an hourly salary of 0.0 \u00a3 and has worked last month for 0 hours.";

		assertEquals(expected, emp1.toString());

	}

}