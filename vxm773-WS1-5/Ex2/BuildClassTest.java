import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * 
 * @author Vasileios Manolis
 *
 */
public class BuildClassTest {

	@Test
	public void test1() {

		Var variable1 = new Var("String", "title");
		Var variable2 = new Var("int", "year");
		Var variable3 = new Var("double", "rating");
		ArrayList<Var> fields = new ArrayList<Var>();
		fields.add(variable1);
		fields.add(variable2);
		fields.add(variable3);

		BuildClass buildClass1 = new BuildClass("Film", fields);

		String expected = "public class Film {\n" + "\n" + "	private String title;\n" + "	private int year;\n"
				+ "	private double rating;\n" + "\n" + "	public Film (String title, int year, double rating) {\n"
				+ "		this.title = title;\n" + "		this.year = year;\n" + "		this.rating = rating;\n"
				+ "	}\n" + "\n" + "\n" + "	public String getTitle() {\n" + "		return title;\n" + "	}\n" + "\n"
				+ "	public int getYear() {\n" + "		return year;\n" + "	}\n" + "\n"
				+ "	public double getRating() {\n" + "		return rating;\n" + "	}\n" + "\n" + "\n"
				+ "	public void setTitle() {\n" + "		this.title = title;\n" + "	}\n" + "\n"
				+ "	public void setYear() {\n" + "		this.year = year;\n" + "	}\n" + "\n"
				+ "	public void setRating() {\n" + "		this.rating = rating;\n" + "	}\n" + "}";
		String actual = buildClass1.buildClass();

		assertEquals(expected, actual);
	}

	@Test
	public void test2() {

		Var variable1 = new Var("String", "title");
		Var variable2 = new Var("int", "year");
		Var variable3 = new Var("double", "rating");
		ArrayList<Var> fields = new ArrayList<Var>();
		fields.add(variable1);
		fields.add(variable2);
		fields.add(variable3);

		BuildClass buildClass1 = new BuildClass("Film", fields);

		String expected = "	private String title;\n" + "	private int year;\n" + "	private double rating;" + "\n";
		String actual = buildClass1.makeFields();

		assertEquals(expected, actual);
	}

	@Test
	public void test3() {

		Var variable1 = new Var("String", "title");
		Var variable2 = new Var("int", "year");
		Var variable3 = new Var("double", "rating");
		ArrayList<Var> fields = new ArrayList<Var>();
		fields.add(variable1);
		fields.add(variable2);
		fields.add(variable3);

		BuildClass buildClass1 = new BuildClass("Film", fields);

		String expected = "	public Film (String title, int year, double rating) {\n" + "		this.title = title;\n"
				+ "		this.year = year;\n" + "		this.rating = rating;\n" + "	}";
		String actual = buildClass1.makeConstructor();

		assertEquals(expected, actual);
	}

	@Test
	public void test4() {

		Var variable1 = new Var("String", "title");
		Var variable2 = new Var("int", "year");
		Var variable3 = new Var("double", "rating");
		ArrayList<Var> fields = new ArrayList<Var>();
		fields.add(variable1);
		fields.add(variable2);
		fields.add(variable3);

		BuildClass buildClass1 = new BuildClass("Film", fields);

		String expected = "\n" + "\n" + "	public String getTitle() {\n" + "		return title;\n" + "	}\n" + "\n"
				+ "	public int getYear() {\n" + "		return year;\n" + "	}\n" + "\n"
				+ "	public double getRating() {\n" + "		return rating;\n" + "	}";
		String actual = buildClass1.makeGetters();

		assertEquals(expected, actual);
	}

	@Test
	public void test5() {

		Var variable1 = new Var("String", "title");
		Var variable2 = new Var("int", "year");
		Var variable3 = new Var("double", "rating");
		ArrayList<Var> fields = new ArrayList<Var>();
		fields.add(variable1);
		fields.add(variable2);
		fields.add(variable3);

		BuildClass buildClass1 = new BuildClass("Film", fields);

		String expected = "\n" + "\n" + "	public void setTitle() {\n" + "		this.title = title;\n" + "	}\n" + "\n"
				+ "	public void setYear() {\n" + "		this.year = year;\n" + "	}\n" + "\n"
				+ "	public void setRating() {\n" + "		this.rating = rating;\n" + "	}";
		String actual = buildClass1.makeSetters();

		assertEquals(expected, actual);
	}

}
