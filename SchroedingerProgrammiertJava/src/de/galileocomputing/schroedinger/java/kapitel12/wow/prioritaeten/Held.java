package de.galileocomputing.schroedinger.java.kapitel12.wow.prioritaeten;


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
	
    public void trinken() {
    	System.out.printf("%s: \"Noch ein Bier, lecker.\"%n", this.getName());
    }
}
