/**
 * A class that prints information about the name, the date of birth, the
 * registration number and the membership type of a club's members
 *
 * @author Vasileios Manolis
 * @version 14.10.2017
 *
 */

public class ClubMember {
	private String name;
	private String dateOfBirth;
	private String registrationNumber;
	private String membershipType;

	/**
	 * Constructor
	 * @param name
	 *            the name of the members (e.g. "John Snow")
	 * @param dateOfBirth
	 *            the date of birth of the member (e.g. "5 October 1993")
	 * @param registrationNumber
	 *            the registration number of a member (e.g. "C473737")
	 * @param membershipType
	 *            the membership type of a members (e.g. "Gold")
	 */
	public ClubMember(String name, String dateOfBirth, String registrationNumber, String membershipType) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.registrationNumber = registrationNumber;
		this.membershipType = membershipType;
	}

	// Writing the Getters

	/**
	 * @return the name of the member
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the date of birth of the member
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the registration number the member
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	/**
	 * @return the membership type of the member
	 */
	public String getMembershipType() {
		return membershipType;
	}

	// Printing to the user

	/**
	 * @return A String to print the name, date of birth, registration number and
	 *         the membership type of a member
	 */
	public String toString() {
		return "[" + name + ", " + dateOfBirth + ", ID: " + registrationNumber + ", " + membershipType + "]";
	}

}