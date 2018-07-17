import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author
 * 
 *
 */

public class Worksheet2Test {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void test1() {

		Tree<Integer> t = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(-7, new Tree(), new Tree()), new Tree(-9, new Tree(), new Tree())));

		Tree<Integer> t2 = new Tree<>(-6,
				new Tree<>(-4, new Tree<>(-2, new Tree(-1, new Tree(), new Tree()), new Tree()),
						new Tree(-5, new Tree(), new Tree())),
				new Tree(-8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));

		assertEquals(t2, Worksheet2.negateAll(t));

		Tree<Integer> t3 = new Tree<>();
		assertEquals(t3, Worksheet2.negateAll(t3));

		Tree<Integer> t4 = new Tree(6);
		Tree<Integer> t5 = new Tree(-6);
		assertEquals(t5, Worksheet2.negateAll(t4));

		Tree<Integer> t6 = new Tree(0);
		assertEquals(t6, Worksheet2.negateAll(t6));

	}

	@Test
	public void test2() {

		Tree<Integer> t = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(-7, new Tree(), new Tree()), new Tree(-9, new Tree(), new Tree())));

		assertEquals(false, Worksheet2.allPositive(t));

		Tree<Integer> t3 = new Tree<>();
		assertEquals(true, Worksheet2.allPositive(t3));

		Tree<Integer> t4 = new Tree(6);
		assertEquals(true, Worksheet2.allPositive(t4));
		Tree<Integer> t5 = new Tree(-6);
		assertEquals(false, Worksheet2.allPositive(t5));

		Tree<Integer> t6 = new Tree(0);
		assertEquals(true, Worksheet2.allPositive(t6));

	}

	@Test
	public void test3() {

		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		Tree<Integer> t2 = new Tree(30, (new Tree(40, new Tree(50), new Tree(35))), new Tree(5));

		assertEquals(t2, Worksheet2.mirror(t1));

		Tree<Integer> t3 = new Tree();
		assertEquals(t3, Worksheet2.mirror(t3));

		Tree<Integer> t4 = new Tree(5);
		assertEquals(t4, Worksheet2.mirror(t4));

	}

	@Test
	public void test4() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		List<Integer> L1 = new List<Integer>();
		L1 = new List<Integer>(30, L1);
		L1 = new List<Integer>(40, L1);
		L1 = new List<Integer>(50, L1);
		L1 = new List<Integer>(35, L1);
		L1 = new List<Integer>(5, L1);
		assertEquals(L1, Worksheet2.postorder(t1));

		Tree<Integer> t3 = new Tree(0);
		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(0, L2);
		assertEquals(L2, Worksheet2.postorder(t3));

		Tree<Integer> t4 = new Tree<>();
		List<Integer> L3 = new List<Integer>();
		assertEquals(L3, Worksheet2.postorder(t4));

	}

	@Test
	public void test5() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		assertEquals(true, Worksheet2.isSearchTree(t1));

		Tree<Integer> t2 = new Tree(30, new Tree(5), (new Tree(40, new Tree(10), new Tree(50))));
		assertEquals(false, Worksheet2.isSearchTree(t2));

		Tree<Integer> t3 = new Tree(0);
		assertEquals(true, Worksheet2.isSearchTree(t3));

		Tree<Integer> t4 = new Tree<>();
		assertEquals(true, Worksheet2.isSearchTree(t4));

		Tree<Integer> t5 = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(-7, new Tree(), new Tree()), new Tree(-9, new Tree(), new Tree())));
		assertEquals(false, Worksheet2.isSearchTree(t5));

		Tree<Integer> t6 = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));
		assertEquals(true, Worksheet2.isSearchTree(t6));

	}

	@Test
	public void test5_INORDER_HELPER() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		List<Integer> L1 = new List<Integer>();
		L1 = new List<Integer>(50, L1);
		L1 = new List<Integer>(40, L1);
		L1 = new List<Integer>(35, L1);
		L1 = new List<Integer>(30, L1);
		L1 = new List<Integer>(5, L1);
		assertEquals(L1, Worksheet2.inOrder(t1));

		Tree<Integer> t3 = new Tree(0);
		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(0, L2);
		assertEquals(L2, Worksheet2.inOrder(t3));

		Tree<Integer> t4 = new Tree<>();
		List<Integer> L3 = new List<Integer>();
		assertEquals(L3, Worksheet2.inOrder(t4));

		Tree<Integer> t6 = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));

		List<Integer> L4 = new List<Integer>();
		L4 = new List<Integer>(9, L4);
		L4 = new List<Integer>(8, L4);
		L4 = new List<Integer>(7, L4);
		L4 = new List<Integer>(6, L4);
		L4 = new List<Integer>(5, L4);
		L4 = new List<Integer>(4, L4);
		L4 = new List<Integer>(2, L4);
		L4 = new List<Integer>(1, L4);
		assertEquals(L4, Worksheet2.inOrder(t6));

	}

	@Test
	public void test5_Sorted_HELPER() {

		List<Integer> L = new List<Integer>();
		L = new List<Integer>(8, L);
		L = new List<Integer>(3, L);
		L = new List<Integer>(5, L);
		L = new List<Integer>(7, L);

		assertEquals(false, Worksheet2.sorted(L));

		List<Integer> L2 = new List<Integer>();
		L2 = new List<Integer>(1000, L2);
		L2 = new List<Integer>(5, L2);
		L2 = new List<Integer>(1, L2);
		L2 = new List<Integer>(0, L2);
		L2 = new List<Integer>(-10, L2);

		assertEquals(true, Worksheet2.sorted(L2));

		List<Integer> L3 = new List<Integer>();
		L3 = new List<Integer>(0, L3);
		L3 = new List<Integer>(1, L3);
		L3 = new List<Integer>(5, L3);
		L3 = new List<Integer>(1000, L3);

		assertEquals(false, Worksheet2.sorted(L3));

		List<Integer> L4 = new List<Integer>();
		L4 = new List<Integer>(0, L4);
		L4 = new List<Integer>(-1, L4);
		L4 = new List<Integer>(-4, L4);
		L4 = new List<Integer>(-5, L4);

		assertEquals(true, Worksheet2.sorted(L4));

		List<Integer> L5 = new List<Integer>();
		L5 = new List<Integer>(3, L5);
		assertEquals(true, Worksheet2.sorted(L5));

	}

	@Test
	public void test7() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		assertEquals(50, Worksheet2.max(t1));

		Tree<Integer> t3 = new Tree(0);
		assertEquals(0, Worksheet2.max(t3));

		Tree<Integer> t6 = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));
		assertEquals(9, Worksheet2.max(t6));

	}

	@Test
	public void test7Exception() {

		Tree<Integer> t4 = new Tree<>();

		thrown.expect(IllegalArgumentException.class);

		Worksheet2.max(t4);

	}

	@Test
	public void test8() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		Tree<Integer> t2 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree())));
		assertEquals(t2, Worksheet2.delete(t2, 50));

		Tree<Integer> t3 = new Tree(30, new Tree(5), (new Tree(40, new Tree(), new Tree())));
		assertEquals(t3, Worksheet2.delete(t2, 35));

		Tree<Integer> t4 = new Tree(30, new Tree(5), (new Tree(35, new Tree(), new Tree())));
		assertEquals(t4, Worksheet2.delete(t2, 40));

		Tree<Integer> t5 = new Tree(5, new Tree(), (new Tree(40, new Tree(35), new Tree())));
		assertEquals(t5, Worksheet2.delete(t2, 30));

		Tree<Integer> t6 = new Tree(30, new Tree(), (new Tree(40, new Tree(35), new Tree())));
		assertEquals(t6, Worksheet2.delete(t2, 5));

		Tree<Integer> t10 = new Tree(0);
		Tree<Integer> t11 = new Tree();
		assertEquals(t11, Worksheet2.delete(t10, 0));

	}

	@Test
	public void test9() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		assertEquals(true, Worksheet2.isHeightBalanced(t1));

		Tree<Integer> t2 = new Tree(30, new Tree(5), (new Tree(40, new Tree(10), new Tree(50))));
		assertEquals(true, Worksheet2.isHeightBalanced(t2));

		Tree<Integer> t3 = new Tree(0);
		assertEquals(true, Worksheet2.isHeightBalanced(t3));

		Tree<Integer> t4 = new Tree<>();
		assertEquals(true, Worksheet2.isHeightBalanced(t4));

		Tree<Integer> t5 = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(-7, new Tree(), new Tree()), new Tree(-9, new Tree(), new Tree())));
		assertEquals(true, Worksheet2.isHeightBalanced(t5));

		Tree<Integer> t6 = new Tree<>(6,
				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
						new Tree(5, new Tree(), new Tree())),
				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));
		assertEquals(true, Worksheet2.isHeightBalanced(t6));

		Tree<Integer> t7 = new Tree(30, new Tree(), (new Tree(40, new Tree(10), new Tree(50))));
		assertEquals(false, Worksheet2.isHeightBalanced(t7));

		Tree<Integer> t8 = new Tree(30, new Tree(), (new Tree(40, new Tree(), new Tree())));
		assertEquals(true, Worksheet2.isHeightBalanced(t8));

	}

	@Test
	public void test10() {
		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
		Tree<Integer> t2 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree())));
		assertEquals(t2, Worksheet2.deleteHB(t2, 50));


		Tree<Integer> t10 = new Tree(0);
		Tree<Integer> t11 = new Tree();
		assertEquals(t11, Worksheet2.deleteHB(t10, 0));

	}

}
