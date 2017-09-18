package de.galileocomputing.schroedinger.java.kapitel05;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Katze {
	
	private String name;
	
	public Katze(String name) {
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + ": Miau");
	}
}
