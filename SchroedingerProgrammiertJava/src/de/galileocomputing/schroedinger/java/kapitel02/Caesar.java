package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Caesar {
	public static void main(String[] args) {
		char buchstabe = 'V';
		int rotation = 6;
		int alphabetStart = 'A';
		System.out.println(alphabetStart);
		buchstabe -= alphabetStart;
		System.out.println((int)buchstabe);
		buchstabe += rotation;
		System.out.println((int)buchstabe);
		buchstabe %= 26;
		System.out.println((int)buchstabe);
		buchstabe += alphabetStart;
		System.out.println((int)buchstabe);
		System.out.println(buchstabe);
	}
}
