import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author <Vasileios Manolis> This class contains the test cases for Worksheet1
 *         solutions. <WRITE YOUR TEST CASES BELOW>
 */

public class Worksheet1Test {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test1() {

		int m1 = 5;
		int n1 = 2;
		int m2 = 0;
		int n2 = 0;

		int expected1 = 25;
		int actualPower1 = Worksheet1.power(m1, n1);
		int actualFastPower1 = Worksheet1.fastPower(m1, n1);

		assertEquals(expected1, actualPower1, actualFastPower1);

		int expected2 = 0;
		int actualPower2 = Worksheet1.power(m2, n1);
		int actualFastPower2 = Worksheet1.fastPower(m2, n1);

		assertEquals(expected2, actualPower2, actualFastPower2);

		int expected3 = 1;
		int actualPower3 = Worksheet1.power(m1, n2);
		int actualFastPower3 = Worksheet1.fastPower(m1, n2);

		assertEquals(expected3, actualPower3, actualFastPower3);

		int expected4 = 3125;
		int actualPower4 = Worksheet1.power(m1, m1);
		int actualFastPower4 = Worksheet1.fastPower(m1, m1);

		assertEquals(expected4, actualPower4, actualFastPower4);

	}

	@Test
	public void test2() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(0, L);
		L = new List<Integer>(8, L);
		L = new List<Integer>(-5, L);
		L = new List<Integer>(2, L);

		List<Integer> lExpected = new List<Integer>();
		lExpected = new List<Integer>(0, lExpected);
		lExpected = new List<Integer>(-8, lExpected);
		lExpected = new List<Integer>(5, lExpected);
		lExpected = new List<Integer>(-2, lExpected);

		assertEquals(lExpected, Worksheet1.negateAll(L));

		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(8, L2);
		L2 = new List<Integer>(8, L2);
		L2 = new List<Integer>(5, L2);
		L2 = new List<Integer>(2, L2);

		List<Integer> lExpected2 = new List<Integer>();
		lExpected2 = new List<Integer>(-8, lExpected2);
		lExpected2 = new List<Integer>(-8, lExpected2);
		lExpected2 = new List<Integer>(-5, lExpected2);
		lExpected2 = new List<Integer>(-2, lExpected2);

		assertEquals(lExpected2, Worksheet1.negateAll(L2));

		List<Integer> L3 = new List<Integer>();
		L3 = new List<Integer>(0, L3);

		List<Integer> lExpected3 = new List<Integer>();
		lExpected3 = new List<Integer>(0, lExpected3);

		assertEquals(lExpected3, Worksheet1.negateAll(L3));

	}

	@Test
	public void test3() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(7, L);

		assertEquals(0, Worksheet1.find(7, L));
		assertEquals(1, Worksheet1.find(5, L));
		assertEquals(2, Worksheet1.find(3, L));
		assertEquals(3, Worksheet1.find(8, L));

		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(8, L2);

		assertEquals(0, Worksheet1.find(8, L2));

	}

	@Test
	public void test3Exception() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(7, L);

		thrown.expect(IllegalArgumentException.class);

		Worksheet1.find(2, L);

	}

	@Test
	public void test4() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(7, L);

		assertEquals(true, Worksheet1.allPositive(L));

		List<Integer> L2 = new List<Integer>(-8, L);
		assertEquals(false, Worksheet1.allPositive(L2));

		List<Integer> L3 = new List<Integer>();
		L3 = new List<Integer>(-8, L3);
		L3 = new List<Integer>(-3, L3);
		L3 = new List<Integer>(-5, L3);
		L3 = new List<Integer>(-7, L3);

		assertEquals(false, Worksheet1.allPositive(L3));

	}

	@Test
	public void test5() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(-2, L);
		L = new List<Integer>(8, L);
		L = new List<Integer>(-5, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(2, L);

		List<Integer> lExpected = new List<Integer>();
		lExpected = new List<Integer>(8, lExpected);
		lExpected = new List<Integer>(3, lExpected);
		lExpected = new List<Integer>(2, lExpected);

		assertEquals(lExpected, Worksheet1.positives(L));

		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(2, L2);
		L2 = new List<Integer>(-8, L2);
		L2 = new List<Integer>(-5, L2);
		L2 = new List<Integer>(-3, L2);
		L2 = new List<Integer>(-2, L2);

		List<Integer> lExpected2 = new List<Integer>();
		lExpected2 = new List<Integer>(2, lExpected2);

		assertEquals(lExpected2, Worksheet1.positives(L2));

	}

	@Test
	public void test6() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(7, L);

		assertEquals(false, Worksheet1.sorted(L));

		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(1000, L2);
		L2 = new List<Integer>(5, L2);
		L2 = new List<Integer>(1, L2);
		L2 = new List<Integer>(0, L2);
		L2 = new List<Integer>(-10, L2);

		assertEquals(true, Worksheet1.sorted(L2));

		List<Integer> L3 = new List<Integer>();
		L3 = new List<Integer>(0, L3);
		L3 = new List<Integer>(1, L3);
		L3 = new List<Integer>(5, L3);
		L3 = new List<Integer>(1000, L3);

		assertEquals(false, Worksheet1.sorted(L3));

		List<Integer> L4 = new List<Integer>();
		L4 = new List<Integer>(0, L4);
		L4 = new List<Integer>(-1, L4);
		L4 = new List<Integer>(-4, L4);
		L4 = new List<Integer>(-5, L4);

		assertEquals(true, Worksheet1.sorted(L4));

	}

	@Test
	public void test7() {

		List<Integer> a = new List<Integer>();
		a = new List<Integer>(8, a);
		a = new List<Integer>(5, a);
		a = new List<Integer>(5, a);
		a = new List<Integer>(2, a);

		List<Integer> b = new List<Integer>();
		b = new List<Integer>(9, b);
		b = new List<Integer>(8, b);
		b = new List<Integer>(7, b);
		b = new List<Integer>(5, b);

		List<Integer> lExpected = new List<Integer>();
		lExpected = new List<Integer>(9, lExpected);
		lExpected = new List<Integer>(8, lExpected);
		lExpected = new List<Integer>(8, lExpected);
		lExpected = new List<Integer>(7, lExpected);
		lExpected = new List<Integer>(5, lExpected);
		lExpected = new List<Integer>(5, lExpected);
		lExpected = new List<Integer>(5, lExpected);
		lExpected = new List<Integer>(2, lExpected);

		assertEquals(lExpected, Worksheet1.merge(a, b));

		List<Integer> b2 = new List<Integer>();
		b2 = new List<Integer>(9, b2);

		List<Integer> lExpected2 = new List<Integer>();
		lExpected2 = new List<Integer>(9, lExpected2);
		lExpected2 = new List<Integer>(8, lExpected2);
		lExpected2 = new List<Integer>(5, lExpected2);
		lExpected2 = new List<Integer>(5, lExpected2);
		lExpected2 = new List<Integer>(2, lExpected2);

		assertEquals(lExpected2, Worksheet1.merge(a, b2));

	}

	@Test
	public void test8() {

		List<Integer> L = new List<Integer>();

		L = new List<Integer>(9, L);
		L = new List<Integer>(8, L);
		L = new List<Integer>(8, L);
		L = new List<Integer>(7, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(2, L);

		List<Integer> lExpected = new List<Integer>();
		lExpected = new List<Integer>(9, lExpected);
		lExpected = new List<Integer>(8, lExpected);
		lExpected = new List<Integer>(7, lExpected);
		lExpected = new List<Integer>(5, lExpected);
		lExpected = new List<Integer>(2, lExpected);

		assertEquals(lExpected, Worksheet1.removeDuplicates(L));

		List<Integer> L2 = new List<Integer>();

		L2 = new List<Integer>(2, L2);
		L2 = new List<Integer>(2, L2);
		L2 = new List<Integer>(2, L2);
		L2 = new List<Integer>(2, L2);
		L2 = new List<Integer>(2, L2);
		L2 = new List<Integer>(1, L2);

		List<Integer> lExpected2 = new List<Integer>();
		lExpected2 = new List<Integer>(2, lExpected2);
		lExpected2 = new List<Integer>(1, lExpected2);

		assertEquals(lExpected2, Worksheet1.removeDuplicates(L2));

	}

}
