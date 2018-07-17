/**
 * Class that adds a complex number to another complex number and multiplies a
 * complex number with another complex number
 * 
 * @author Vasileios Manolis
 * @version 2016-10-15
 */
public class Complex {
	private double realPart; // the real part of a complex number
	private double imaginaryPart; // the imaginary part of a complex number

	/**
	 * Constructor
	 * 
	 * @param realPart
	 *            The realPart of a complex number
	 * @param imaginaryParts
	 *            The imaginary part of a complex number
	 */
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	// Writing the Setters

	/**
	 * @param realPart The new real part of a number
	 */
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}

	/**
	 * @param imaginaryPart
	 *            The new imaginary part of a number
	 */
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}

	// Writing the Getters

	/**
	 * @return The real part of the number
	 */
	public double getRealPart() {
		return realPart;
	}

	/**
	 * @return The imaginary part of the number
	 */
	public double getImaginaryPart() {
		return imaginaryPart;
	}

	// Writing the toString method

	/**
	 * This method says how to print a complex number
	 * 
	 * @return A String representing a complex number
	 */
	public String toString() {
		return realPart + " + " + imaginaryPart + "i";
	}

	/**
	 * A method to add a complex number to another complex number
	 * 
	 * @param summand
	 *            A complex number that we will added to another complex number
	 * @return A new complex number which is the sum of other two
	 */
	public Complex add(Complex summand) {
		double realPart = this.realPart + summand.realPart;
		double imaginaryPart = this.imaginaryPart + summand.imaginaryPart;
		return new Complex(realPart, imaginaryPart);
	}

	/**
	 * A method to multiply a complex number to another complex number
	 * 
	 * @param factor
	 *            A complex number that will be multiplied to another complex number
	 * @return
	 */
	public Complex multiply(Complex factor) {
		double realPart = this.realPart * factor.realPart - this.imaginaryPart * factor.imaginaryPart;
		double imaginaryPart = this.realPart * factor.imaginaryPart + factor.realPart * this.imaginaryPart;
		Complex summand = new Complex(realPart, imaginaryPart);
		return summand;
	}

}
