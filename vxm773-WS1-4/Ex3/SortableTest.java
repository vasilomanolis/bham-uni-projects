import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Vasileios Manolis
 *
 */
public class SortableTest {

	public static final double EPSILON = 1e-6;

	private Sortable s1;
	private Sortable s2;
	private Sortable s3;
	private Sortable s4;
	private Sortable s5;
	private Sortable s6;
	private Sortable s7;

	@Test
	public void test1() {

		s1 = new Car(0, "DDDD DD", "Batmobil");
		s2 = new Car(132.22, "FD29 EKF", "Batmobil2");
		s3 = new Car(194, "WF11 YHC", "FasterBatmobil");

		Sortable[] a = { s1, s2, s3 };

		Sortable[] expected = { s1, s2, s3 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test2() {

		s4 = new Car(80.40, "Empty1", "Brand1");
		s5 = new Car(50.50, "Empty2", "Brand2");
		s6 = new Car(100.10, "Empty3", "Brand3");

		Sortable[] a = { s4, s5, s6 };

		Sortable[] expected = { s5, s4, s6 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test3() {

		s5 = new Customer("Bob", 4344.4, "24 Bristol Road");
		s6 = new Customer("Sarah", 999.99, "Chiou 19");

		Sortable[] a = { s5, s6 };

		Sortable[] expected = { s6, s5 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test4() {

		s4 = new Car(0, "433 FD", "Aston Martin");

		double expected = 0;
		double actual = s4.compareValue();

		assertEquals(expected, actual, EPSILON);
	}

	@Test
	public void test5() {

		s4 = new Car(0.0001, "VF43 DJE", "Toyota");

		double expected = 0.0001;
		double actual = s4.compareValue();

		assertEquals(expected, actual, EPSILON);
	}

	@Test
	public void test6() {

		s4 = new Customer("Barbara", 0.5, "2 Baker Street");

		double expected = 0.5;
		double actual = s4.compareValue();

		assertEquals(expected, actual, EPSILON);
	}

	@Test
	public void test7() {

		s1 = new Customer("Barbara", 0.5, "2 Baker Street");
		s4 = new Car(80.40, "Empty1", "Brand1");
		s5 = new Car(50.50, "Empty2", "Brand2");
		s6 = new Car(100.10, "Empty3", "Brand3");

		Sortable[] a = { s1, s4, s5, s6 };

		Sortable[] expected = { s1, s5, s4, s6 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);

	}

	@Test
	public void test8() {

		s4 = new Car(0.00, "Empty1", "Brand1");
		s5 = new Car(100.50, "Empty2", "Brand2");
		s6 = new Car(200.10, "Empty3", "Brand3");

		Sortable[] a = { s6, s5, s4 };

		Sortable[] expected = { s4, s5, s6 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test9() {

		s1 = new Car(999.0, "SA05 DSW", "BMW");
		s2 = new Car(999.0, "FDS34 DS", "Toyota");
		s3 = new Car(23.0, "JD32 JS", "Ferrari");
		s4 = new Customer("Theodore", 323.0, "24 Baker Street");
		s5 = new Customer("Rusvelt", 23.50, "1 Brazil Street");
		s6 = new Customer("Michael", 21.0, "42 Get Street");
		s7 = new Customer("Vasilis", 334.0, "42 Liga Str");

		Sortable[] a = { s1, s2, s3, s4, s5, s6, s7 };

		Sortable[] expected = { s6, s3, s5, s4, s7, s1, s2 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void test10() {

		s1 = new Car(999.0, "SA05 DSW", "BMW");
		s2 = new Car(10.0, "FDS34 DS", "Toyota");

		Sortable[] a = { s1, s2 };

		Sortable[] expected = { s2, s1 };
		Sortable[] actual = Sorting.quickSort(a);

		assertArrayEquals(expected, actual);
	}

}
