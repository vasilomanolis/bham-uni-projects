/**
 * Class that prints the title, the year and the length of Films *
 * 
 * @version 14.10.2017
 * @author Vasileios Manolis
 * 
 */

public class Film {
	private String title; // Title of the movie
	private int year; // Year of the movie
	private int length; // Length of the movie

	/**
	 * This constructor creates a Film object containing the title, year and length
	 * of the Film which are String, int and int respectively.
	 * 
	 * @param title
	 *            The title of the Film (e.g. "Fight Club")
	 * @param year
	 *            The year the movie was released (e.g. 1992)
	 * @param length
	 *            The length of the movie (e.g. 1034 referring to minutes)
	 */
	public Film(String title, int year, int length) {
		this.title = title;
		this.year = year;
		this.length = length;
	}

	// Writing the Getters

	/**
	 * @return The title of a Film
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return The year of a Film
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return The length of a Film
	 */
	public int getLength() {
		return length;
	}

	// Writing the Setters

	/**
	 * Sets the title of a Film
	 * 
	 * @param title
	 *            is the new title of a Film
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Sets the Year of a Film
	 * 
	 * @param year
	 *            is the new year of a Film
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Sets the length of the Film
	 * 
	 * @param length
	 *            is the new length of a Film
	 */
	public void setLength(int length) {
		this.length = length;
	}

	// Printing to the user

	/**
	 * This method says how to print information about a Film
	 * 
	 * @return A String how the object is printed
	 */
	public String toString() {
		return "The film" + title + "with duration" + length + "was released in" + year + ".";
	}

}