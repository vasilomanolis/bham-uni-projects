import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Vasileios Manolis
 * 
 */

public class RSATest {

	@Test
	public void test1() {
		RSA example = new RSA(61, 53, 17);
		long plainNumber = 65;
		long cipher = example.encrypt(plainNumber);

		long expected = 65;
		assertEquals(expected, example.decrypt(cipher));
	}

	@Test
	public void test2() {
		RSA example = new RSA(61, 53, 17);
		long plainNumber = 65;
		long cipher = example.encrypt(plainNumber);

		long expected = 65;
		assertEquals(expected, example.decrypt(cipher));
	}

	@Test
	public void test3() {
		RSA example = new RSA(61, 53, 17);
		long plainNumber = 65;
		long cipher = example.encrypt(plainNumber);

		long expected = 65;
		assertEquals(expected, example.decrypt(cipher));
	}

	@Test
	public void test4() {
		RSA example = new RSA(7, 19, 5);
		long plainNumber = 65;
		long cipher = example.encrypt(plainNumber);

		long expected = 65;
		assertEquals(expected, example.decrypt(cipher));

	}

}