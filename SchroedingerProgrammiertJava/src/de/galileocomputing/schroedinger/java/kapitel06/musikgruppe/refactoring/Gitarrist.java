package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe.refactoring;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Gitarrist extends Musiker {

	public Gitarrist(String kuenstlerName, String name, String vorname) {
		super(kuenstlerName, name, vorname);
	}

	public void musizieren() {
		System.out.println("Tschiiiiiingzäääängggggg");
	}

}
