package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe.refactoring;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Saenger extends Musiker {
	
	public Saenger(String kuenstlerName, String name, String vorname) {
		super(kuenstlerName, name, vorname);
	}

	@Override
	public void musizieren() {
		this.singen();
	}
	
	public void singen() {
		System.out.println("Oh, bäbi, juuuu a mei sannnnscheiiiiin");
	}
	
}
