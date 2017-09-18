package de.galileocomputing.schroedinger.java.kapitel07.hund.antipattern;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class HundImpl implements Hund {

	private String farbe;
	
	private String name;
	
	@Override
	public void bellen() {
		System.out.println("wuffwuff");
	}

	@Override
	public String getFarbe() {
		return farbe;
	}

	@Override
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	
}
