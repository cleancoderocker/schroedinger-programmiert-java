package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringVergleiche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Urinstinkt".endsWith("instinkt"));
		System.out.println("Tischlerei".startsWith("Tischler"));
		System.out.println("Pfannekuchen".regionMatches(2, "Badewanne", 5, 4));
	}

}
