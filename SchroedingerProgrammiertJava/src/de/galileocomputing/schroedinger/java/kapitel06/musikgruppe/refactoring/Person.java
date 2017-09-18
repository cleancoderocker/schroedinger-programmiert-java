package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe.refactoring;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Person extends Object {
	private String name;
	
	private String vorname;

	private int alter;
	
	public Person(String name, String vorname) {
		super();
		this.name = name;
		this.vorname = vorname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
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
}
