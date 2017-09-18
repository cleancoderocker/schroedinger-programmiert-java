package de.galileocomputing.schroedinger.java.kapitel09.errors;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StackOverflow {
	public static void main(String[] args) {
		try {
			rekursionOhneEnde();
		} catch(StackOverflowError error) {
			System.out.println("Kein guter Stil.");
		}
	}

	private static void rekursionOhneEnde() {
		rekursionOhneEnde();
	}
}
