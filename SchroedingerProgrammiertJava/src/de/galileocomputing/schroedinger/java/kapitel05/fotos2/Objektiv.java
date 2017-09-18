package de.galileocomputing.schroedinger.java.kapitel05.fotos2;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Objektiv {

	private int brennweiteMin;
	private int brennweiteMax;

	public Objektiv(int brennweiteMin, int brennweiteMax) {
		this.setBrennweiten(brennweiteMin, brennweiteMax);
	}
	
	int getBrennweiteMin() {
		return brennweiteMin;
	}

	int getBrennweiteMax() {
		return brennweiteMax;
	}

	void setBrennweiten(int brennweiteMin, int brennweiteMax) {
		if (brennweiteMin < brennweiteMax) {
			this.brennweiteMin = brennweiteMin;
			this.brennweiteMax = brennweiteMax;
		} else {
			System.err
					.println("Die maximale Brennweite muss größer als die minimale Brennweite sein.");
		}
	}
}
