package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe.refactoring;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Musiker extends Kuenstler {

	public Musiker(String kuenstlerName, String name, String vorname) {
		super(kuenstlerName, name, vorname);
	}

	private Band band;

	public void musizieren() {
		System.out.println("OO Mmmmmmmmh, OO Mmmmmmmmh");
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}
}
