import java.util.ArrayList;

/**
 * A subclass of class ExamQuestion, in which the possibleAnswers are an
 * ArrayList<String>, that is, the answer is supposed to be a choice from the
 * list and the correctAnswers is of type ArrayList<Integer>, representing the
 * positions of the correct answers.
 * 
 * @author Vasileios Manolis
 * @version 13.11.2017
 *
 */
public class ExamQuestionMultipleChoice extends ExamQuestion {

	private ArrayList<String> possibleAnswers = new ArrayList<String>();
	private ArrayList<Integer> correctAnswers = new ArrayList<Integer>();

	/**
	 * 
	 * @param questionText
	 *            the question text of the question
	 * @param maximalMark
	 *            the maximal marks of the question
	 * @param possibleAnswers
	 *            the possible answers of the question
	 * @param correctAnswers
	 *            the correct answers of the question
	 */
	public ExamQuestionMultipleChoice(String questionText, int maximalMark, ArrayList<String> possibleAnswers,
			ArrayList<Integer> correctAnswers) {
		super(questionText, maximalMark);
		this.possibleAnswers = possibleAnswers;
		this.correctAnswers = correctAnswers;
	}

	/**
	 * A method that computes the points by scaling the difference between the
	 * number of correct answers and the number of incorrect answers to the maximal
	 * points and rounding the points to the next int (but not returning less than
	 * 0).
	 * 
	 * @param answersProvided
	 *            the provided answers
	 * @return the points by scaling the difference between the number of correct
	 *         answers and the number of incorrect answers to the maximal points and
	 *         rounding the points to the next int (but not returning less than 0).
	 */
	public int mark(ArrayList<Integer> answersProvided) {
		int correctCounter = 0;
		int falseCounter = 0;
		int points = 0;
		double markPerAnswer = (double) getMaximalMark() / correctAnswers.size();
		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int checkedValue : answersProvided) {
			if ((correctAnswers.contains(checkedValue)) && (!temp.contains(checkedValue))) {
				correctCounter++;
				temp.add(checkedValue);
			} else if (!correctAnswers.contains(checkedValue)) {
				falseCounter++;
			}
		}

		points = (int) Math.round((correctCounter * markPerAnswer) - (falseCounter * markPerAnswer));

		points = (points >= 0) ? points : 0;

		return points;
	}

	/**
	 * A toString methods that prints the possible and the correct answers in a
	 * readable way
	 */
	public String toString() {
		return super.toString() + "\n" + "Possible answers are: " + possibleAnswers + "\n"
				+ "Correct answer positions are: " + correctAnswers;
	}

}