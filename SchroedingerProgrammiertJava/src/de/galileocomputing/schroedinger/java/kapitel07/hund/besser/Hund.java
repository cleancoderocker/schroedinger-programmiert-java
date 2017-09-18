package de.galileocomputing.schroedinger.java.kapitel07.hund.besser;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Hund implements KannBellen {

	private String farbe;
	
	private String name;
	
	@Override
	public void bellen() {
		System.out.println("wuffwuff");
	}
	
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
