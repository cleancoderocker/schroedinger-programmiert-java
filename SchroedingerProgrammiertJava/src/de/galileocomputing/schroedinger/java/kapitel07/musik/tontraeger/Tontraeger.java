package de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class Tontraeger {
	private String titel;

	public Tontraeger(String titel) {
		super();
		this.titel = titel;
	}

	public String getTitel() {
		return titel;
	}
	
}
