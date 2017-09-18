package de.galileocomputing.schroedinger.java.kapitel12.wow.starvation;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Nachtelf extends Held {
	public Nachtelf(String name) {
		super(name);
	}
	
	@Override
	protected boolean isFertig() {
		return true;
	}
}
