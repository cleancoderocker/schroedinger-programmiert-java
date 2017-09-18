package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung.telefonnummern;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Telefonnummer {
	private String vorwahl;
	private String hauptnummer;
	public Telefonnummer(String vorwahl, String hauptnummer) {
		super();
		this.vorwahl = vorwahl;
		this.hauptnummer = hauptnummer;
	}
	public String getVorwahl() {
		return vorwahl;
	}
	public void setVorwahl(String vorwahl) {
		this.vorwahl = vorwahl;
	}
	public String getHauptnummer() {
		return hauptnummer;
	}
	public void setHauptwahl(String hauptnummer) {
		this.hauptnummer = hauptnummer;
	}
	
	
}
