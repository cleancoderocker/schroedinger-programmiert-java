package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Musiker {
	private String name;

	private int alter;

	private Band band;

	public void musizieren() {
		System.out.println("OO Mmmmmmmmh, OO Mmmmmmmmh");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Band getBand() {
		return band;
	}

	public void setBand(Band band) {
		this.band = band;
	}
}
