import static org.junit.Assert.assertEquals;

/**
 * @author Vasileios Manolis
 * 
 *         This class contains the solution for Worksheet2
 */

public class Worksheet2 implements Worksheet2Interface {

	// Exercise 1
	/**
	 * Given a tree of integers a, this is a method that returns a new tree
	 * containing all the elements of a with their sign negated, i.e., positive
	 * integers become negative and negative integers become positive
	 * 
	 * @param t
	 *            a tree of integers
	 * @return a new tree containing all the elements of a with their sign negated
	 */
	public static Tree<Integer> negateAll(Tree<Integer> t) {
		if (t.isEmpty())
			return new Tree<Integer>();
		else
			return new Tree<Integer>(-t.getValue(), negateAll(t.getLeft()), negateAll(t.getRight()));
	}

	// Exercise 2
	/**
	 * Given a tree of integers a, this method returns a boolean value indicating
	 * whether all the values in its nodes are positive, i.e., ≥ 0
	 * 
	 * @param a
	 *            a tree of integers
	 * @return a boolean value indicating whether all the values in its nodes are
	 *         positive
	 */
	public static boolean allPositive(Tree<Integer> a) {
		if (a.isEmpty())
			return true;
		else if (a.getValue() < 0)
			return false;
		else
			return (allPositive(a.getLeft()) && allPositive(a.getRight()));

	}

	// Exercise 3
	/**
	 * Given a tree a, this method constructs and returns a tree that is the mirror
	 * image of a along the left-right axis.
	 * 
	 * @param t
	 *            a tree of element type E
	 * @return a tree that is the mirror image of a along the left-right axis.
	 */
	public static <E> Tree<E> mirror(Tree<E> t) {
		if (t.isEmpty())
			return new Tree<E>();
		else

			return new Tree<E>(t.getValue(), mirror(t.getRight()), mirror(t.getLeft()));

	}

	// Exercise 4
	/**
	 * Given a tree a, this method produces and returns a list containing the values
	 * in a by traversing the nodes in postorder
	 * 
	 * @param t
	 *            a tree of element type E
	 * @return a list containing the values in a by trvaersing the nodes in
	 *         postorder,
	 */
	public static <E> List<E> postorder(Tree<E> t) {

		// List<E> L = new List<>();
		// List<E> R = new List<>();
		// List<E> RE = new List<>();

		if (t.isEmpty()) {
			return new List<>();
		} else
			// L = postorder(t.getLeft());
			// R = postorder(t.getRight());
			//
			// RE = addtoend(R, t.getValue());
			//
			// return append(L, RE);

			return (append(postorder(t.getLeft()), addtoend(postorder(t.getRight()), t.getValue())));

	}

	// Exercise 5
	/**
	 * Given a tree of integers a, this method returns a boolean value indicating
	 * whether a is a binary search tree.
	 * 
	 * @param a
	 *            a tree of integers
	 * @return a boolean value indicating whether a is a binary search tree.
	 */
	public static boolean isSearchTree(Tree<Integer> a) {
		if (a.isEmpty())
			return true;
		else
			// Used two helper functions (The sorted from the previous worksheet, and an
			// inorder function)
			return sorted(inOrder(a));

	}

	/**
	 * HELPER FUNCTION FOR EXERCISE 5: Given a tree a, this method produces and
	 * returns a list containing the values in a by traversing the nodes in inorder
	 * 
	 * @param t
	 *            a tree of element type E
	 * @return a list containing the values in a by traversing the nodes in in order
	 */
	public static <E> List<E> inOrder(Tree<E> t) {

		List<E> L = new List<>();
		List<E> R = new List<>();
		List<E> LE = new List<>();

		if (t.isEmpty()) {
			return new List<>();
		} else
			L = inOrder(t.getLeft());
		LE = addtoend(L, t.getValue());

		R = inOrder(t.getRight());

		return append(LE, R);

	}

	/**
	 * HELPER FUNCTION FROM PREVIOUS WORKSHEET FOR EXERCISE 5: Given a list of
	 * integers a, this method must return a boolean value indicating whether a is
	 * sorted in increasing order. (There can be duplicate copies of elements. But,
	 * sortedness would require that all the duplicate copies would appear
	 * together.)
	 * 
	 * @param a
	 *            a list of integers
	 * @return a boolean value indicating whether a is sorted in increasing order.
	 */
	public static boolean sorted(List<Integer> a) {
		if (a.isEmpty())
			return true;
		else if (a.getTail().isEmpty())
			return true;
		else if (a.getHead() <= a.getTail().getHead())
			return sorted(a.getTail());
		else
			return false;
	}

	// Exercise 6
	/**
	 * Given a binary search tree of integers a, this method prints the values
	 * stored in it in descending order.
	 * 
	 * Pre-conditions: The given tree is a binary search tree
	 * 
	 * @param a
	 *            a tree of integers
	 */
	public static void printDescending(Tree<Integer> a) {
		if (a.isEmpty())
			return;
		else
			printDescending(a.getRight());
		System.out.print(a.getValue());
		printDescending(a.getLeft());

	}

	// Exercise 7
	/**
	 * Assuming that the argument tree a is a binary search tree, this is a method
	 * to find the maximum value stored in a tree Pre-Conditions: The input tree
	 * should be a binary search tree
	 * 
	 * @param a
	 *            a tree of integers
	 * @return the maximum value stored in a tree
	 */
	public static int max(Tree<Integer> a) {

		if (a.isEmpty())
			throw new IllegalArgumentException("Please, don't give me an empty tree :) ");
		else if (!a.getRight().isEmpty())
			return max(a.getRight());
		else
			return a.getValue();

	}

	// Exercise 8
	/**
	 * Assuming that the argument tree a is a binary search tree, this method
	 * deletes the value x from a and return the resulting tree. Pre-conditions: The
	 * value should exist in the binary search tree
	 * 
	 * @param a
	 *            a tree of integers
	 * @param x
	 *            the numbers that will be deleted
	 * @return the resulting tree after deleting the value
	 */
	public static Tree<Integer> delete(Tree<Integer> a, int x) {
		Tree<Integer> d = new Tree<Integer>();

		if (a.isEmpty())
			return new Tree<Integer>();
		if (x < a.getValue())
			d = new Tree<Integer>(a.getValue(), delete(a.getLeft(), x), a.getRight());
		else if (x > a.getValue())
			d = new Tree<Integer>(a.getValue(), a.getLeft(), delete(a.getRight(), x));
		else {

			if (!a.getLeft().isEmpty() && !a.getRight().isEmpty()) {
				return new Tree<Integer>(max(a.getLeft()), a.getLeft().getLeft(), a.getRight());
			} else if (a.getRight().isEmpty())
				return a.getLeft();
			else
				return a.getRight();
		}
		return d;
	}

	// Exercise 9
	/**
	 * Given a tree a (of an arbitrary element type E), this methods checks to see
	 * if it is height-balanced, returning a boolean value. Assumed that height
	 * balanced trees does not necessarily are binary search trees
	 * 
	 * @param a
	 *            a tree of an arbitrary element type E
	 * @return a boolean value indicating if the tree is height balanced (true: it
	 *         is heightbalance)
	 */
	public static <E> boolean isHeightBalanced(Tree<E> a) {
		if (a.isEmpty())
			return true;

		else if (Math.abs(a.getLeft().getHeight() - a.getRight().getHeight()) <= 1 && (isHeightBalanced(a.getLeft()))
				&& (isHeightBalanced(a.getRight())))

			return true;
		else
			return false;
	}

	// Exercise 10
	/**
	 * A modified versions of insert method that maintain the height-balanced
	 * property of trees. Pre-conditions: The input trees are height-balanced binary
	 * search trees. No duplicates.
	 * 
	 * @param x
	 *            the number that will be inserted
	 * @param a
	 *            a tree of integers
	 * @return a height balanced tree including the inserted value
	 */
	public static Tree<Integer> insertHB(int x, Tree<Integer> a) {
		Tree<Integer> d = new Tree<Integer>();
		
		if (a.isEmpty())
			return new Tree<Integer>(x);
		else

		if (x < a.getValue())
			d = insertHB(x, a.getLeft());
		else if (x > a.getValue())
			d= insertHB(x, a.getRight());
		else
			return d;

		int balance = getBalance(d);

		// If this node becomes unbalanced, then
		// there are 4 cases Left Left Case
		if (balance > 1 && x < d.getLeft().getValue())
			return rightRotate(d);

		// Right Right Case
		if (balance < -1 && x > d.getRight().getValue())
			return leftRotate(d);

		// Left Right Case
		if (balance > 1 && x > d.getLeft().getValue()) {
			leftRotate(d.getLeft());
			return rightRotate(d);
		}

		// Right Left Case
		if (balance < -1 && x < d.getRight().getValue()) {
			rightRotate(d.getRight());
			return leftRotate(d);
		}

		return d;

	}

	/**
	 * A modified versions of delete method that maintain the height-balanced
	 * property of trees.
	 * 
	 * Pre-conditions: The input trees are height-balanced binary search trees. No
	 * duplicates.
	 * 
	 * @param x
	 *            the number that will be deleted
	 * @param a
	 *            a tree of integers
	 * @return a height balanced tree after deleting the value x
	 */
	public static Tree<Integer> deleteHB(Tree<Integer> a, int x) {

		if (a.isEmpty())
			return new Tree<Integer>();
		else {
			a = delete(a, x);

			int balance = getBalance(a);

			// If this node becomes unbalanced, then
			// there are 4 cases

			// Left Left Case
			if (balance > 1 && getBalance(a.getLeft()) >= 0)
				return rightRotate(a);

			// Left Right Case
			if (balance > 1 && getBalance(a.getLeft()) < 0) {
				leftRotate(a.getLeft());
				return rightRotate(a);
			}

			// Right Right Case
			if (balance < -1 && getBalance(a.getRight()) <= 0)
				return leftRotate(a);

			// Right Left Case
			if (balance < -1 && getBalance(a.getRight()) > 0) {
				rightRotate(a.getRight());
				return leftRotate(a);
			}

			return a;

		}
	}

	/**
	 * A HELPER FUNCTION FOR EXERCISE 10: THe method does a right rotation of a
	 * non-empty tree.
	 * 
	 * @param a
	 *            a tree of integers
	 * @return the rotated tree
	 */
	public static Tree<Integer> rightRotate(Tree<Integer> a) {

		return new Tree<Integer>(a.getLeft().getValue(), a.getLeft().getLeft(),
				new Tree<Integer>(a.getValue(), a.getLeft().getRight(), a.getRight()));
	}

	/**
	 * A HELPER FUNCTION FOR EXERCISE 10: THe method does a left rotation of a
	 * non-empty tree.
	 * 
	 * @param a
	 *            a tree of integers
	 * @return the rotated tree
	 */
	public static Tree<Integer> leftRotate(Tree<Integer> a)

	{

		return new Tree<Integer>(a.getRight().getValue(),
				new Tree<Integer>(a.getValue(), a.getLeft(), a.getRight().getLeft()), a.getRight().getRight());
	}

	/**
	 * A HELPER FUNCTION FOR EXERCISE 10: THe method calculates the difference in
	 * height between the left and the right nod
	 * 
	 * @param a
	 *            a tree of integers
	 * @return the difference in height between the left and the right nod
	 */
	static int getBalance(Tree<Integer> a) {
		if (a.isEmpty())
			return 0;
		return a.getLeft().getHeight() - a.getRight().getHeight();
	}

	/**
	 * A HELPER FUNCTION: Calculates the maximum between two integers
	 * 
	 * @param x
	 *            an integer
	 * @param y
	 *            an integer
	 * @return the maximum value between the two integers
	 */
	int max(int x, int y) {
		return (x > y) ? x : y;
	}

	// A HELPPER FUNCTION FROM THE ListOpsGeneric
	// append creates a new list by appending two given lists
	// It is generic in the element type E.

	static <E> List<E> append(List<E> a, List<E> b) {
		if (a.isEmpty())
			return b;
		else
			return new List(a.getHead(), append(a.getTail(), b));
	}

	// A HELPPER FUNCTION FROM THE ListOpsGeneric
	// addtoend creates a new list by adding an element at the end of
	// the given list, also generic in the element type E.

	static <E> List<E> addtoend(List<E> a, E x) {
		return append(a, new List(x, new List()));
	}

	// A HELPPER FUNCTION FROM THE ListOpsGeneric
	// reverse creates a reversed version of a given list, i.e., the
	// same elements appear but in reverse order, also generic in the
	// element type E.

	static <E> List<E> reverse(List<E> a) {
		if (a.isEmpty())
			return new List();
		else
			return addtoend(reverse(a.getTail()), a.getHead());
	}

	
// PLEASE, THE FOLLOWING TEST METHOD NOT TO BE GRADED
	
	//public static void main(String[] args) {

	//	Tree<Integer> T = new Tree<Integer>();

		// System.out.println(T.getHeight());

//
//		Tree<Integer> t = new Tree<>(6,
//				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
//						new Tree(5, new Tree(), new Tree())),
//				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));
//
//		Tree<Integer> t2 = new Tree(6, new Tree(4, new Tree(2, new Tree(1, new Tree(), new Tree()), new Tree()),
//				new Tree(5, new Tree(), new Tree())), new Tree());
//
//		Tree<Integer> t3 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
//
//		Tree<Integer> t7 = new Tree(30, new Tree(5), (new Tree(40, new Tree(10), new Tree(50))));
//
//		Tree<Integer> tbalanced = new Tree<>(6,
//				new Tree<>(4, new Tree<>(2, new Tree(), new Tree()), new Tree(5, new Tree(), new Tree())),
//				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));
//
//		// System.out.println(tbalanced);
		// System.out.println(isHeightBalanced(tbalanced));
		// System.out.println(delete(tbalanced, 4));

		// System.out.println(t);
		// System.out.println(insertHB(3, t));

//		Tree<Integer> t4 = new Tree();
//		Tree<Integer> t5 = new Tree(6);

		// System.out.println(max(new Tree(4)));
		// System.out.println((t));

		// System.out.println(postorder(t));
		// System.out.println((t3));
		// System.out.println(delete(t3, 50));
		// System.out.println(deleteHB(t3, 50));
		// System.out.println(isHeightBalanced(deleteHB(t3, 30)));
		// System.out.println(isHeightBalanced(deleteHB(t3, 5)));
		// System.out.println(isHeightBalanced(deleteHB(t3, 40)));
		// System.out.println(isHeightBalanced(deleteHB(t3, 35)));
		// System.out.println(isHeightBalanced(deleteHB(t3, 50)));
		// System.out.println(isHeightBalanced(deleteHB(t3, 30)));

//		System.out.println((t7));
//
//		System.out.println(isSearchTree(t3));
//		System.out.println(isHeightBalanced(t3));
//
//		System.out.println(insertHB(10, t3));
//		System.out.println(isSearchTree(t3));
//		System.out.println(isHeightBalanced(insertHB(10, t3)));
//		System.out.println(isHeightBalanced(t4));
//
//		Tree<Integer> t10 = new Tree<>(6,
//				new Tree<>(4, new Tree<>(2, new Tree(1, new Tree(), new Tree()), new Tree()),
//						new Tree(5, new Tree(), new Tree())),
//				new Tree(8, new Tree(7, new Tree(), new Tree()), new Tree(9, new Tree(), new Tree())));
//
//		System.out.println(t10);

		// System.out.println(inOrder(t5));
		// System.out.println(isSearchTree(t5));

		// System.out.println(isSearchTree(t3));

		// new Tree(5, new Tree(), new Tree)

		// System.out.println(t);
		// System.out.println(mirror(t));
		// System.out.println(isSearchTree(t));
		// System.out.println(postorder(t));
		// printDescending(t);
		// System.out.print(new Tree());

		// System.out.println(negateAll(t));
		// System.out.println(allPositive(t));

		// System.out.println((t));

		// System.out.println(delete(t, 8));
		
//		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
//		System.out.println(insertHB(55, t1));
//		System.out.println(insertHB(38, t1));
//		System.out.println(insertHB(7, t1));
//		System.out.println(insertHB(0, t1));
		
//		Tree<Integer> t1 = new Tree(30, new Tree(5), (new Tree(40, new Tree(35), new Tree(50))));
//		System.out.println(deleteHB(t1, 30));

	
//	}

}