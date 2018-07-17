/**
 * A subclass ExamQuestionNumeric of class ExamQuestion that contains a method
 * public int mark(int value) in the subclass that returns full marks if the
 * answer is correct and 0 otherwise.
 * 
 * @author Vasileios Manolis
 * @version 13.11.2017
 *
 */
public class ExamQuestionNumeric extends ExamQuestion {

	private int answer;

	/**
	 * A constructor of an ExamQuestionNumeric
	 * 
	 * @param questionText
	 *            the question text of the question
	 * @param maximalMark
	 *            the maximal mark of the question
	 * @param answer
	 *            the correct answer of the question
	 */
	public ExamQuestionNumeric(String questionText, int maximalMark, int answer) {
		super(questionText, maximalMark);
		this.answer = answer;
	}

	/**
	 * A method that returns the maximal mark if the answer is correct or 0 if the
	 * answer is wrong
	 * 
	 * @param value
	 *            the user's answer
	 * @return the maximal mark if the answer is correct or 0 if the answer is wrong
	 */
	public int mark(int value) {
		if (value == answer) {
			return getMaximalMark();
		} else
			return 0;
	}

	/**
	 * A toString method that prints the correct answer in a readable way
	 */
	public String toString() {
		return super.toString() + " Correct answer is: " + answer;
	}

}
