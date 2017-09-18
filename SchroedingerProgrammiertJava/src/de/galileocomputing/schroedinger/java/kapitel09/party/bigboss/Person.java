package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Person {
	private String name;
	private Firma arbeitetBei;
	private double gehalt;

	public Person(String name, Firma arbeitetBei, double gehalt) {
		super();
		this.name = name;
		this.arbeitetBei = arbeitetBei;
		this.gehalt = gehalt;
	}
	
	public String getName() {
		return this.name;
	}

	public Firma getArbeitetBei() {
		return this.arbeitetBei;
	}

	public double getGehalt() {
		return this.gehalt;
	}
	
	
}
