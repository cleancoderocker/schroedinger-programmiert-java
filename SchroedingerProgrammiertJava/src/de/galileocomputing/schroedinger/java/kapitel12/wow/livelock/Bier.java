package de.galileocomputing.schroedinger.java.kapitel12.wow.livelock;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Bier {
	private Held besitzer;

	public Bier(Held held) {
		this.besitzer = held;
	}

	public synchronized Held getBesitzer() {
		return besitzer;
	}

	public synchronized void setBesitzer(Held held) {
		this.besitzer = held;
	}

	public synchronized void trinken() {
		System.out.printf("%s hat getrunken!", besitzer.getName());
	}
}
