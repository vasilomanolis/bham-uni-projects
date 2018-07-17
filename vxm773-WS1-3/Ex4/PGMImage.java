import java.io.*;
import java.util.Scanner;

/**
 * The class creates an image in form of a greyscale image which is read in from
 * a file. It contains a method to crop the left upper half of the picture and
 * write it out again.
 *
 * @version 2015-10-19
 * @author Manfred Kerber
 */
public class PGMImage {
	private int width;
	private int height;
	private int maxShade;
	private String typeOfFile;
	private short[][] pixels;

	/**
	 * @param filename
	 *            The name of a file that contains an image in pgm format of type
	 *            P2.
	 *
	 */
	public PGMImage(String filename) {
		// try since the file may not exist.
		try {
			// we read from the scanner s which is linked to the file filename.
			Scanner s = new Scanner(new File(filename));

			/*
			 * The field variables are assigned by reading in from a file. The file should
			 * start with something like P2 150 176 255
			 * 
			 * where P2 is the file type, 150 the width of the image, 176 the height, and
			 * 255 the maximal grey value. Then follow 150*176 grey values between 0 and
			 * 255.
			 */

			// We read the initial element that is in our case "P2"
			typeOfFile = s.next();
			// Next we read the width, the height, and the maxShade.
			width = s.nextInt();
			height = s.nextInt();
			maxShade = s.nextInt();
			// We initialize and read in the different pixels.
			pixels = new short[height][width];
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					pixels[i][j] = s.nextShort();
				}
			}
			// We finished reading and close the scanner s.
			s.close();
		} catch (IOException e) {
			// If the file is not found, an error message is printed,
			// and an empty image is created.
			System.out.println("File not found.");

			typeOfFile = "P2";
			width = 0;
			height = 0;
			maxShade = 0;
			pixels = new short[width][height];
		}
	}

	/**
	 * @return The width of the image.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return The height of the image.
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @return The maximal grey value of the image.
	 */
	public int getMaxShade() {
		return maxShade;
	}

	/**
	 * @return The file type of the image.
	 */
	public String getTypeOfFile() {
		return typeOfFile;
	}

	/**
	 * @return The matrix representing the pixels of the image.
	 */
	public short[][] getPixels() {
		return pixels;
	}

	/**
	 * The method crops the left upper half of an image.
	 * 
	 * @param filename
	 *            The filename of the file in which the cropped image should be
	 *            saved.
	 */
	public void crop(String filename) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			// We write the file type to out.
			out.write(getTypeOfFile() + "\n");

			// We write the dimensions to out.
			out.write((getWidth() / 2) + " " + (getHeight() / 2) + "\n");

			// We write maximal number.
			out.write(getMaxShade() + "\n");

			byte counter = 0;
			for (int i = 0; i < getHeight() / 2; i++) {
				for (int j = 0; j < getWidth() / 2; j++) {
					out.write(getPixels()[i][j] + " ");
					counter++;
					if (counter == 15) {
						out.write("\n");
						counter = 0;
					}
				}
			}
			out.write("\n");
			// We close the file.
			out.close();
		} catch (IOException e) {
			// Errors are caught.
			System.out.println("File not found.");
		}
	}

	/*
	 * An example.
	 */
	 //public static void main(String[] args) {
	 // PGMImage cs = new PGMImage("ComputerScience.pgm");
	 // cs.rotate("ComputerScienceCrop.pgm");
	 //}

	/**
	 * We will extend the class PGMImage.java from the lecture with three methods 
	 * 1.A method that averages four adjacent cells and replaces them with a single cell 
	 * in a PGMImage by averaging and rounding, 
	 * 2. A method that rotates the image clockwise 90 degrees, 
	 * 3. A method that transforms the image into a black and white image. 
	 * The methods write the new image to a PGMImage file.
	 *
	 * @version 2017-11-01
	 * @author Manolis Vasileios
	 */

	/**
	 * 
	 * @param filename
	 *            The filename of the file in which the quartered image should be
	 *            saved.
	 * @return The resulting two-dimensional array (after averaging four adjacent
	 *         cells and replacing them with a single cell in a PGMImage by
	 *         averaging and rounding)
	 */
	public int[][] quarter(String filename) {

		int[][] quarteredTable = new int[getHeight() / 2][getWidth() / 2];

		try {

			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			// We write the file type to out.
			out.write(getTypeOfFile() + "\n");

			// We write the dimensions to out.
			out.write((getWidth() / 2) + " " + (getHeight() / 2) + "\n");

			// We write maximal number.
			out.write(getMaxShade() + "\n");

			int t1 = 0; // Initialize a counter before the start of the loop
			for (int i = 0; i < getHeight() - 1; i = i + 2) {
				int temp = 0; // Initialize a temporary variable temp
				for (int j = 0; j < getWidth() - 1; j = j + 2) {
					double a = Math.round((getPixels()[i][j] + getPixels()[i][j + 1] + getPixels()[i + 1][j]
							+ getPixels()[i + 1][j + 1]) / 4.0);
					quarteredTable[t1][temp] = (int) a;

					out.write(quarteredTable[t1][temp]);
					temp++; // Incrementing (+1) the temporary variable temp
				}
				t1++; // Incrementing (+1) the counter t1

			}

			out.write("\n");
			// We close the file.
			out.close();
		}

		catch (

		IOException e) {
			// Errors are caught.
			System.out.println("File not found.");
		}

		return quarteredTable;

	}

	/**
	 * 
	 * @param filename
	 *            The filename of the file in which the rotated image should be
	 *            saved.
	 * @return The resulting clockwise 90 degrees rotated array
	 */
	public int[][] rotate(String filename) {

		int[][] rotatedTable = new int[getWidth()][getHeight()];
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			// We write the file type to out.
			out.write(getTypeOfFile() + "\n");
			// We write the dimensions to out.
			out.write((getWidth() / 2) + " " + (getHeight() / 2) + "\n");
			// We write maximal number.
			out.write(getMaxShade() + "\n");
			for (int i = 0; i < getWidth(); i++) {
				for (int j = 0; j < getHeight(); j++) {
					rotatedTable[i][j] = getPixels()[getHeight() - j - 1][i];
					out.write(rotatedTable[i][j]);
				}
				out.write("\n");
			}
			out.close();
		}

		catch (

		IOException e) {
			// Errors are caught.
			System.out.println("File not found.");
		}
		return rotatedTable;
	}

	/**
	 * 
	 * @param filename
	 *            The filename of the file in which the black and white
	 *            image should be saved.
	 * @return The resulting black and white image
	 */
	public int[][] bw(String filename) {

		int rows = getWidth();
		int columns = getHeight();
		int[][] bwImage = new int[columns][rows];
		double sum = 0;

		double averageValue = 0;
		int counter = 0;
		try {

			BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			// We write the file type to out.
			out.write(getTypeOfFile() + "\n");

			// We write the dimensions to out.
			out.write((getWidth()) + " " + (getHeight()) + "\n");

			// We write maximal number.
			out.write(getMaxShade() + "\n");

			for (int c = 0; c < columns; c++) {
				for (int r = 0; r < rows; r++) {
					counter = counter + 1;
					sum = sum + pixels[c][r];
				}
			}

			averageValue = sum / counter;

			for (int c = 0; c < columns; c++) {
				for (int r = 0; r < rows; r++) {

					if (pixels[c][r] > averageValue) {
						bwImage[c][r] = 0;
					} else {
						bwImage[c][r] = 1;
					}
				}
			}

			out.write("\n");
			// We close the file.
			out.close();
		}

		catch (

		IOException e) {
			// Errors are caught.
			System.out.println("File not found.");
		}
		return bwImage;
	}


}
