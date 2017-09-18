package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe.refactoring;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Kuenstler extends Person {

	private String kuenstlerName;
	
	public Kuenstler(String name, String vorname) {
		super(name, vorname);
	}
	
	public Kuenstler(String kuenstlerName, String name, String vorname) {
		this(name, vorname);
		this.kuenstlerName = kuenstlerName;
	}
	
	public String getKuenstlerName() {
		return kuenstlerName;
	}

	public void setKuenstlerName(String kuenstlerName) {
		this.kuenstlerName = kuenstlerName;
	}
	
	
}
