package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Saenger extends Musiker {
	
	@Override
	public void musizieren() {
		this.singen();
	}
	
	public void singen() {
		System.out.println("Oh, bäbi, juuuu a mei sannnnscheiiiiin");
	}
	
}
