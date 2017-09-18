package de.galileocomputing.schroedinger.java.kapitel11.serialization.krieger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Krieger {
	private String name;
	
	private int erfahrung;

	public Krieger() {
	}
	
	public Krieger(String name, int erfahrung) {
		super();
		this.name = name;
		this.erfahrung = erfahrung;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getErfahrung() {
		return erfahrung;
	}

	public void setErfahrung(int erfahrung) {
		this.erfahrung = erfahrung;
	}
	
	
}
