/**
 * A class ExamQuestion with field variables private String questionText and
 * private int maximalMark. It contains a constructor, getters/setters for the
 * two field variables, and a public String toString() method which return for
 * example for a question with maximally 10 marks and a questionText of "What is
 * 2 times 3?" the string "Question (Maximal mark: 10): What is 2 times 3?".
 * 
 * @author Vasileios Manolis
 * @version 13.11.2017
 */
public class ExamQuestion {

	private String questionText;
	private int maximalMark;

	/**
	 * A constructor for ExamQuestion
	 * 
	 * @param questionText
	 *            the question text of the question
	 * @param maximalMark
	 *            the maximal mark of the question
	 */

	public ExamQuestion(String questionText, int maximalMark) {

		this.questionText = questionText;
		this.maximalMark = maximalMark;
	}

	/**
	 * A getter for questionText
	 * 
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * A setter for questionText
	 * 
	 * @param questionText
	 *            the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	/**
	 * A getter for maximalMark
	 * 
	 * @return the maximalMark
	 */
	public int getMaximalMark() {
		return maximalMark;
	}

	/**
	 * A setter for maximalMark
	 * 
	 * @param maximalMark
	 *            the maximalMark to set
	 */
	public void setMaximalMark(int maximalMark) {
		this.maximalMark = maximalMark;
	}

	/**
	 * A toString method that returns the question text and the maximalMark in a
	 * easily readable way
	 */
	public String toString() {
		return "Question (Maximal mark: " + maximalMark + "): " + questionText;
	}

}
