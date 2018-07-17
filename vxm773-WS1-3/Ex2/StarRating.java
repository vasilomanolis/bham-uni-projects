
/**
 * A class that interprets any rating between 1 and 5 (1 <= rating <= 5, which
 * could be interpreted as the rating averaged over several individual ratings).
 * A "CRAP" rating starts at 1.0 and may extend up to, but excluding 5.
 * A "OK" rating starts at 4.0 and may extend up to, but excluding 4.5. 
 * A "EXCELENT" rating from 4.5 and may extend up to, but excluding 5. 
 * A "[HAS ONLY ONE REVIEW]" rating should be returned for 5.0. 
 * For values less than 1.0 or bigger than 5.0 the class 
 * throws an IllegalArgumentException.
 * 
 * @author Vasileios Manolis
 * @version 21.10.2017
 */

public class StarRating {

	/**
	 * @param rating
	 *            the rating of a movie
	 * @return a String with the interpretation of the rating or an
	 *         IllegalArgumentException if (rating < 1 || rating > 5)
	 */
	public static String interpret(double rating) {
		if (1 <= rating && rating < 4)
			return "CRAP";
		else if (4 <= rating && rating < 4.5)
			return "OK";
		else if (4.5 <= rating && rating < 5)
			return "EXCELLENT";
		else if (rating == 5)
			return "[HAS ONLY ONE REVIEW]";
		else if (rating < 1 || rating > 5)
			throw new IllegalArgumentException("The rating should be between 1 and 5");

		// This will never execute. All ratings have been included before this part of the code.
		return null;
	}

}
