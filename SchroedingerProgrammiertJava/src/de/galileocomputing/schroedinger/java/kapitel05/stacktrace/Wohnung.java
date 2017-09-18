package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Wohnung {
	
	private Vase vase;
	
	public Wohnung() {
		this.vase = new Vase();
	}

	public void rumLaufen(Katze katze) {
		this.vase.umfallen();
	}

	public void putzen() {
	}
}
