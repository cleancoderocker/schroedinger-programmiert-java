package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class CharSpielereien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Default Encoding = " + System.getProperty("file.encoding"));
		char s1 = 0x0053;
		char s2 = 83;
		char s3 = 'S';
		char s4 = '\u0053';
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
