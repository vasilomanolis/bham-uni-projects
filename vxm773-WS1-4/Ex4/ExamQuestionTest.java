import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Vasileios Manolis
 *
 */
public class ExamQuestionTest {

	private ExamQuestion question1;
	private ExamQuestionNumeric numericQuestion1;
	private ExamQuestionNumeric numericQuestion2;
	private ExamQuestionSimpleChoice simpleChoiceQuestion1;
	private ExamQuestionSimpleChoice simpleChoiceQuestion2;
	private ExamQuestionMultipleChoice multipleChoiceQuestion1;
	private ExamQuestionMultipleChoice multipleChoiceQuestion2;

	@Before
	public void setup() {
		question1 = new ExamQuestion("What is 10 times 5?", 10);
		new ExamQuestion("What is 5 plus 5?", 100);

		numericQuestion1 = new ExamQuestionNumeric("What is 10 times 5?", 10, 50);
		numericQuestion2 = new ExamQuestionNumeric("What is 5 plus 5?", 20, 10);
		new ExamQuestionNumeric("What is 3 times 4?", 50, 12);

		ArrayList<String> simpleChoiceAnswers1 = new ArrayList<String>(Arrays.asList("43", "555", "10", "220"));
		simpleChoiceQuestion1 = new ExamQuestionSimpleChoice("What is 5 plus 5?", 10, simpleChoiceAnswers1, 3);

		ArrayList<String> simpleChoiceAnswers2 = new ArrayList<String>(
				Arrays.asList("48", "23", "23", "7", "13", "-1"));
		simpleChoiceQuestion2 = new ExamQuestionSimpleChoice("What is 6 times 8?", 100, simpleChoiceAnswers2, 1);

		ArrayList<String> possibleAnswers1 = new ArrayList<>(Arrays.asList("5", "4", "55", "62"));
		ArrayList<Integer> correctAnswers1 = new ArrayList<>(Arrays.asList(1, 2));
		multipleChoiceQuestion1 = new ExamQuestionMultipleChoice("x + x = 9", 100, possibleAnswers1, correctAnswers1);

		ArrayList<String> possibleAnswers2 = new ArrayList<>(Arrays.asList("54", "20", "443", "10"));
		ArrayList<Integer> correctAnswers2 = new ArrayList<>(Arrays.asList(2, 4));
		multipleChoiceQuestion2 = new ExamQuestionMultipleChoice("x - x = 10", 20, possibleAnswers2, correctAnswers2);
	}

	@Test
	public void test1() {
		int actual1 = question1.getMaximalMark();
		int actual2 = numericQuestion1.getMaximalMark();

		int expected1 = 10;
		int expected2 = 10;

		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);

		String actual3 = question1.getQuestionText();
		String expected3 = "What is 10 times 5?";

		String actual4 = numericQuestion1.getQuestionText();
		String expected4 = "What is 10 times 5?";

		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4);

	}

	@Test
	public void test2() {

		int expected = 0;
		int actual = numericQuestion1.mark(5);

		assertEquals(expected, actual);
	}

	@Test
	public void test3() {

		int expected = 20;
		int actual = numericQuestion2.mark(10);

		assertEquals(expected, actual);
	}

	@Test
	public void test4() {

		int expected1 = 0;
		int actual1 = simpleChoiceQuestion1.mark(1);

		int expected2 = 100;
		int actual2 = simpleChoiceQuestion2.mark(1);

		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);

	}

	@Test
	public void test6() {

		int expected1 = 0;
		int actual1 = simpleChoiceQuestion1.mark(0);

		int expected2 = 0;
		int actual2 = simpleChoiceQuestion2.mark(0);

		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);

	}

	@Test
	public void test7() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2, 3));

		int expected = 0;
		int actual = multipleChoiceQuestion1.mark(givenAnswers);

		assertEquals(expected, actual);
	}

	@Test
	public void test8() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(1, 2));

		int expected = 100;
		int actual = multipleChoiceQuestion1.mark(givenAnswers);

		assertEquals(expected, actual);
	}

	@Test
	public void test9() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(5, 1, 2));

		int expected = 50;
		int actual = multipleChoiceQuestion1.mark(givenAnswers);

		assertEquals(expected, actual);
	}

	@Test
	public void test10() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2, 3));

		int expected = 0;
		int actual = multipleChoiceQuestion2.mark(givenAnswers);

		assertEquals(expected, actual);
	}

	@Test
	public void test11() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2, 4));

		int expected = 20;
		int actual = multipleChoiceQuestion2.mark(givenAnswers);

		assertEquals(expected, actual);
	}

	@Test
	public void test12() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(1));

		int expected = 0;
		int actual = multipleChoiceQuestion2.mark(givenAnswers);

		assertEquals(expected, actual);

	}

	@Test
	public void test13() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(1, 2, 1));

		int expected = 0;
		int actual = multipleChoiceQuestion2.mark(givenAnswers);

		assertEquals(expected, actual);

	}

	@Test
	public void test14() {

		ArrayList<Integer> givenAnswers = new ArrayList<>(Arrays.asList(2, 5));

		int expected = 0;
		int actual = multipleChoiceQuestion2.mark(givenAnswers);

		assertEquals(expected, actual);
	}

	@Test
	public void test15() {

		int expected = 10;
		int actual = numericQuestion1.mark(50);

		assertEquals(expected, actual);
	}

}