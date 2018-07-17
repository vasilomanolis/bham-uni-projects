import java.util.ArrayList;

/**
 * 
 * 
 * A class BuildClass with the two fields private String className and private
 * ArrayList<Var> fields. The class BuildClass has following methods: public
 * String makeFields() which generates a String corresponding to the field
 * variable declarations at the start of the corresponding class file, public
 * String makeConstructor() which generates a String corresponding to a standard
 * constructor (as displayed, e.g., by Eclipse), public String makeGetters()
 * which generates a String corresponding to all getters, public String
 * makeSetters() which generates a String corresponding to all setters and
 * public String buildClass() which combines all the methods, writes in addition
 * the header of the class ("public class ClassName{") and also adds the final
 * closing "}".
 * 
 * @author Vasileios Manolis
 * @version 27.11.2017
 */
public class BuildClass {

	private String className; // the name of the class
	private ArrayList<Var> fields; // the fields of the class

	/**
	 * A constructor for the BuildClass
	 * 
	 * @param className
	 *            the name of the class
	 * @param fields
	 *            the fields of the class
	 */
	public BuildClass(String className, ArrayList<Var> fields) {
		this.className = className;
		this.fields = fields;
	}

	/**
	 * A method which generates a String corresponding to the field variable
	 * declarations at the start of the corresponding class file
	 * 
	 * @returns stringMakeFields which is a String corresponding to the field
	 *          variable declarations at the start of the corresponding class file
	 */
	public String makeFields() {
		String stringMakeFields = "";
		for (Var Variable : fields) {
			stringMakeFields = stringMakeFields + "\t" + "private " + Variable.getTypeOfVar() + " "
					+ Variable.getNameOfVar() + ";\n";
		}

		return stringMakeFields;
	}

	/**
	 * A method which generates a String corresponding to a standard constructor (as
	 * displayed, e.g., by Eclipse)
	 * 
	 * @return makeConstructor which is a String corresponding to a standard
	 *         constructor (as displayed, e.g., by Eclipse)
	 */
	public String makeConstructor() {
		String makeConstructor = "\tpublic " + className + " (";

		for (Var Variable : fields) {
			makeConstructor = makeConstructor + Variable.getTypeOfVar() + " " + Variable.getNameOfVar() + ", ";
		}

		makeConstructor = makeConstructor.substring(0, makeConstructor.length() - 2); 

		makeConstructor = makeConstructor + ") {\n";

		for (Var Variable : fields) {
			makeConstructor = makeConstructor + "\t\tthis." + Variable.getNameOfVar() + " = " + Variable.getNameOfVar()
					+ ";\n";
		}

		makeConstructor = makeConstructor + "\t}";

		return makeConstructor;
	}

	/**
	 * A method which generates a String corresponding to all getters
	 * 
	 * @return makeGettersForAllVariables which is a String corresponding to all
	 *         getters
	 */
	public String makeGetters() {

		String makeGettersForOneVariable = "";
		String makeGettersForAllVariables = "";

		for (Var Variable : fields) {

			String capitalName = "";
			capitalName = Variable.getNameOfVar();
			capitalName = capitalName.substring(0, 1).toUpperCase() + capitalName.substring(1);

			makeGettersForOneVariable = "\tpublic " + Variable.getTypeOfVar() + " get" + capitalName + "() {"
					+ "\n\t\treturn " + Variable.getNameOfVar() + ";\n\t}";

			makeGettersForAllVariables = makeGettersForAllVariables + "\n\n" + makeGettersForOneVariable;
		}

		return makeGettersForAllVariables;
	}

	/**
	 * A method which generates a String corresponding to all setters
	 * 
	 * @return makeSettersForAllVariables which is a String corresponding to all
	 *         setters
	 */
	public String makeSetters() {

		String makeSettersForOneVariable = "";
		String makeSettersForAllVariables = "";

		for (Var Variable : fields) {
			String capitalName = "";
			capitalName = Variable.getNameOfVar();
			capitalName = capitalName.substring(0, 1).toUpperCase() + capitalName.substring(1);

			makeSettersForOneVariable = "\tpublic void set" + capitalName + "() {" + "\n\t\tthis."
					+ Variable.getNameOfVar() + " = " + Variable.getNameOfVar() + ";\n\t}";

			makeSettersForAllVariables = makeSettersForAllVariables + "\n\n" + makeSettersForOneVariable;

		}

		return makeSettersForAllVariables;
	}

	/**
	 * A method which combines all the methods, writes in addition the header of the
	 * class ("public class ClassName{") and also adds the final closing "}".
	 * 
	 * @return buildClass which is a string that combines all the methods, writes in
	 *         addition the header of the class ("public class ClassName{") and also
	 *         adds the final closing "}".
	 */
	public String buildClass() {
		String buildClass = "";

		buildClass = "public class " + className + " {\n";

		buildClass = buildClass + "\n" + makeFields() + "\n" + makeConstructor() + "\n" + makeGetters() + "\n"
				+ makeSetters() + "\n}";

		return buildClass;
	}

	/**
	 * An example
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Var variable1 = new Var("String", "title");
		Var variable2 = new Var("int", "year");
		Var variable3 = new Var("double", "rating");

		ArrayList<Var> Var1 = new ArrayList<Var>();
		Var1.add(variable1);
		Var1.add(variable2);
		Var1.add(variable3);

		BuildClass Film = new BuildClass("Film", Var1);

		// System.out.println(Film.makeFields());
		// System.out.println(Film.makeConstructor());
		// System.out.println(Film.makeGetters());
		// System.out.println(Film.makeSetters());
		System.out.println(Film.buildClass());

	}
}
