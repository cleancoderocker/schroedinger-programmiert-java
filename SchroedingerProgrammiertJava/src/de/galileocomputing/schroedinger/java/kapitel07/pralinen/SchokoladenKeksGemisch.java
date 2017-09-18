package de.galileocomputing.schroedinger.java.kapitel07.pralinen;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchokoladenKeksGemisch implements SchokoRiegel, LaengstePralineDerWelt {

	@Override
	public double getLaenge() {
		return 20;
	}

	@Override
	public boolean istLecker() {
		return true;
	}

}
