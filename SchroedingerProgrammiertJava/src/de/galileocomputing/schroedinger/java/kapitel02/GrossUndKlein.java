package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GrossUndKlein {
	public static void main(String[] args) {
		char zeichen = 'B';
		System.out.println("Buchstabe: " + Character.isLetter(zeichen));
		System.out.println("Großbuchstabe: " + Character.isUpperCase(zeichen));
	}
}
