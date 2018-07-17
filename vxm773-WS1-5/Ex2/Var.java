
/**
 * A class Var for a variable with the two fields private String typeOfVar and
 * private String nameOfVar.
 * 
 * @author Vasileios Manolis
 * @version 27.11.2017
 *
 */
public class Var {

	private String typeOfVar; // the type of the variable
	private String nameOfVar; // the name of the variable

	/**
	 * Constructor for Var
	 * 
	 * @param typeOfVar
	 *            the type of the variable
	 * @param nameOfVar
	 *            the name of the variable
	 */
	public Var(String typeOfVar, String nameOfVar) {
		this.typeOfVar = typeOfVar;
		this.nameOfVar = nameOfVar;
	}

	/**
	 * A getter of the typeOfVar
	 * 
	 * @return the typeOfVar the type of the variable
	 */
	public String getTypeOfVar() {
		return typeOfVar;
	}

	/**
	 * A setter of the typeOfVar
	 * 
	 * @param typeOfVar
	 *            the typeOfVar to set
	 */
	public void setTypeOfVar(String typeOfVar) {
		this.typeOfVar = typeOfVar;
	}

	/**
	 * A getter of the nameOfVar
	 * 
	 * @return the nameOfVar to set
	 */
	public String getNameOfVar() {
		return nameOfVar;
	}

	/**
	 * A setter of the nameOfVar
	 * 
	 * @param nameOfVar
	 *            the nameOfVar to set
	 */
	public void setNameOfVar(String nameOfVar) {
		this.nameOfVar = nameOfVar;
	}

}
