package de.galileocomputing.schroedinger.java.kapitel07.pralinen;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchokoladenSuechtiger {
	public void essen(SchokoRiegel schokoRiegel) {
		if(schokoRiegel.istLecker()) {
			System.out.println("Boah, lecker!");
		}
	}
}
