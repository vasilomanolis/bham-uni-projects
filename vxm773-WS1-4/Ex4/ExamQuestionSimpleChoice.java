import java.util.ArrayList;
import java.util.Arrays;

/**
 * A subclass of class ExamQuestion, in which the possibleAnswers are an
 * ArrayList<String>, that is, the answer is supposed to be a choice from the
 * list and the correctAnswer is of type int, representing the position of the
 * correct answer
 * 
 * @author Vasileios Manolis
 * @version 13.11.2017
 *
 */
public class ExamQuestionSimpleChoice extends ExamQuestion {

	private ArrayList<String> possibleAnswers = new ArrayList<String>();
	private int correctAnswer;

	/**
	 * A constructor of ExamQuestionSimpleChoice
	 * 
	 * @param questionText
	 *            the question text of the question
	 * @param maximalMark
	 *            the maximal mark of the question
	 * @param possibleAnswers
	 *            the possible answers of the question
	 * @param correctAnswer
	 *            the correct answer of the question
	 */
	public ExamQuestionSimpleChoice(String questionText, int maximalMark, ArrayList<String> possibleAnswers,
			int correctAnswer) {
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswer = correctAnswer;
	}

	/**
	 * A method that returns full marks if the answer is correct and 0 otherwise
	 * 
	 * @param value
	 *            the given answer to be checked
	 * @return full marks if the answer is correct and 0 otherwise
	 */
	public int mark(int value) {
		if (value == correctAnswer) {
			return getMaximalMark();
		} else
			return 0;
	}

	/**
	 * A toString method that prints the possible and correct answers in a easily,
	 * readable way
	 */
	public String toString() {
		return super.toString() + "\n" + "Possible answers are: " + possibleAnswers + "\n"
				+ "Correct answer position is: " + correctAnswer;
	}

	static ArrayList<String> a = new ArrayList<>(Arrays.asList("4", "5", "10", "20"));

}
