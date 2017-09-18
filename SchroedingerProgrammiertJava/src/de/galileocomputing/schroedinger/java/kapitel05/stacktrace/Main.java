package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person schroedinger = new Person();
		Person schroedingersFreundin = new Person();
		schroedingersFreundin.setWohnung(new Wohnung());
		Katze katze = new Katze(schroedingersFreundin);
		schroedingersFreundin.haushaltMachen();
	}
}
