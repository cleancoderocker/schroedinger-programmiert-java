package de.galileocomputing.schroedinger.java.kapitel06.abos.objektorientiert;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Abo {
	
	private Abonnent abonnent;
	
	public Abo(Abonnent abonnent) {
		System.out.println("Neues Abo");
		this.abonnent = abonnent;
	}
	
	public double getPreisProJahr() {
		return 20.0;
	}

	public Abonnent getAbonnent() {
		return abonnent;
	}

	public double getPreisInklusiveRabatt() {
		return this.getPreisProJahr();
	}
}
