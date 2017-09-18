package de.galileocomputing.schroedinger.java.kapitel07.pralinen;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class BuchDerWeltrekorde {
	public void messen(LaengstePralineDerWelt laengstePralineDerWelt) {
		if(laengstePralineDerWelt.getLaenge() > 8) {
			System.out.println("Boah, lang!");
		}
	}
}
