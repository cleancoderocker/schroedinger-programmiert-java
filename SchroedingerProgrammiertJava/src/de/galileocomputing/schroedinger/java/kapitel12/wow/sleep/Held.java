package de.galileocomputing.schroedinger.java.kapitel12.wow.sleep;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class Held {
	private String name;
	
	public Held(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void aufInDenKampf(Held held);
}
