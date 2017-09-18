package de.galileocomputing.schroedinger.java.kapitel11.serialization.notizen;

import java.io.Serializable;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Autor implements Serializable {

	private static final long serialVersionUID = 2655816823397736440L;

	private String vorname;
	
	private String name;
	
	public Autor(String vorname, String name) {
		this.vorname = vorname;
		this.name = name;
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

	@Override
	public String toString() {
		return "Autor [vorname=" + vorname + ", name=" + name + "]";
	}
	
}
