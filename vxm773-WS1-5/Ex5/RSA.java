
/**
 * 
 * A simple implementation as described on the Wikipedia page of the RSA
 * encryption algorithm without the BigInteger. Link: https://en.wikipedia.org/wiki/RSA_(cryptosystem)
 *
 * @author Vasileios Manolis
 * @version 26.11.2017
 */
public class RSA {
	private static long leastCommonMultiple;
	private long lambda;
	private long p;
	private long q;
	private long e;
	private long n;

	/**
	 * 
	 * A method to getRSA where as parameters we hae three prime numbers (two random
	 * prime number and one more that does not divide lambda)
	 * 
	 * @param p
	 *            a prime numbers of type long
	 * @param q
	 *            a prime numbers of type long
	 * @param e
	 *            a third prime number e so that e does not divide lambda
	 */
	public RSA(long p, long q, long e) {
		this.p = p;
		this.q = q;
		this.e = e;
		this.n = p * q;
		this.lambda = leastCommonMultiple((this.p - 1), (this.q - 1));

	}

	/**
	 * A method to encrypt the number
	 * 
	 * @param plainNumber
	 *            the number that will be sent for encryption (and the sender takes
	 *            it to the power e modulo n)
	 * @return encrypted the encrypted number
	 */
	public long encrypt(long plainNumber) {
		long encrypted = power(plainNumber, e, n);
		return encrypted;
	}

	/**
	 * A method to decrypt the number
	 * 
	 * @param numberToBeDecrypted
	 *            the number to be decrypted
	 * @return decrypted the decrypted number
	 */
	public long decrypt(long numberToBeDecrypted) {

		long d = inverse(this.e, lambda);
		long decrypted = power(numberToBeDecrypted, d, n);

		return decrypted;

	}

	/**
	 * 
	 * A method to calculate the encryptedNumber to the power d modulo n. In order
	 * to encrypt now a number plainNumber the sender takes it to the power e modulo
	 * n. The so calculated number encryptedNumber can then be sent in plain to the
	 * recipient. Only the recipient would know the secret decryption number d.
	 * 
	 * @param a
	 *            the number to be raised
	 * @param x
	 *            the times to be raised
	 * @param modulus
	 *            the modulus
	 * @return
	 */

	public static long power(long a, long x, long modulus) {
		long result;
		if (x == 0) {
			result = 1;
		} else if (x == 1)
			result = a;
		else {
			long temp = power(a, x / 2, modulus);
			if (x % 2 == 0)
				result = (temp * temp) % modulus;
			else
				result = ((temp * temp) % modulus) * a % modulus;
		}
		return result;
	}

	/**
	 * A method to calculate the number d which is the inverse of e with respect to
	 * lambda. Pseudocode to compute the inverse can be found on
	 * https://en.wikipedia. org/wiki/Extended_Euclidean_algorithm.
	 * 
	 * @param a
	 *            the input
	 * @param n
	 *            the input
	 * @return the inverted number
	 */

	public static long inverse(long a, long n) {
		long t = 0;
		long newt = 1;
		long r = n;
		long newr = a;
		long temp, aux1, aux2;

		while (!(newr == 0)) {
			temp = r / newr;

			aux1 = t;
			t = newt;
			newt = aux1 - temp * newt;

			aux2 = r;
			r = newr;
			newr = aux2 - temp * newr;
		}
		if (r > 1)
			throw new IllegalArgumentException("not invertable");

		if (t < 0)
			t += n;
		return t;
	}

	/**
	 * A method to calculate the least Common Multiple
	 * 
	 * @param a
	 *            the input
	 * @param b
	 *            the input
	 * @return least Common Multiple
	 */
	public static long leastCommonMultiple(long a, long b) {
		long gcd = 1;

		for (long i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
			leastCommonMultiple = (a * b) / gcd;
		}
		return leastCommonMultiple;
	}

	// Four Examples
	public static void main(String[] args) {
		RSA example1 = new RSA(61, 53, 17);
		long plainNumber1 = 65;
		long cipher1 = example1.encrypt(plainNumber1);
		long res1 = example1.decrypt(cipher1);
		System.out.println("Plain message: " + plainNumber1);
		System.out.println("Decrypted message: " + res1);
		System.out.println("Encrypted message: " + cipher1);

		RSA example2 = new RSA(293, 317, 97);
		long plainNumber2 = 65;
		long cipher2 = example2.encrypt(plainNumber2);
		long res2 = example2.decrypt(cipher2);
		System.out.println("Plain message: " + plainNumber2);
		System.out.println("Decrypted message: " + res2);
		System.out.println("Encrypted message: " + cipher2);

		RSA example3 = new RSA(99991, 8999, 14983);
		long plainNumber3 = 65;
		long cipher3 = example3.encrypt(plainNumber3);
		long res3 = example3.decrypt(cipher3);
		System.out.println("Plain message: " + plainNumber3);
		System.out.println("Decrypted message: " + res3);
		System.out.println("Encrypted message: " + cipher3);

		RSA example4 = new RSA(7, 19, 5);
		long plainNumber4 = 65;
		long cipher4 = example4.encrypt(plainNumber4);
		long res4 = example4.decrypt(cipher4);
		System.out.println("Plain message: " + plainNumber4);
		System.out.println("Decrypted message: " + res4);
		System.out.println("Encrypted message: " + cipher4);

	}

}