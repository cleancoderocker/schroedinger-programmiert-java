package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Katze {

	private Person herrchen;
	
	public Katze(Person herrchen) {
		herrchen.setKatze(this);
		this.herrchen = herrchen;
	}

	protected Person getHerrchen() {
		return herrchen;
	}
	
	public void fuettern() {
		Wohnung wohnung = this.getHerrchen().getWohnung();
		if(wohnung != null) {
			wohnung.rumLaufen(this);
		}
	}

}
