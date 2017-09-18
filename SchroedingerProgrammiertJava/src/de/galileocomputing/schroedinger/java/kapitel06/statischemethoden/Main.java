package de.galileocomputing.schroedinger.java.kapitel06.statischemethoden;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Unterklasse klasse = new Unterklasse();
		klasse.objektMethode();
		klasse.klassenMethode();
		Oberklasse klasse2 = new Unterklasse();
		klasse2.objektMethode();
		klasse2.klassenMethode();
		((Oberklasse)klasse).klassenMethode();
		Unterklasse.klassenMethode();
		Oberklasse.klassenMethode();
		System.out.println(klasse.klassenFeld);
		System.out.println(klasse2.klassenFeld);
		System.out.println(klasse.objektFeld);
		System.out.println(klasse2.objektFeld);
	}
}
