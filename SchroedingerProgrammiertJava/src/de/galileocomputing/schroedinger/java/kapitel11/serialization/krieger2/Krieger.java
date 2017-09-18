package de.galileocomputing.schroedinger.java.kapitel11.serialization.krieger2;

import java.io.Serializable;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Krieger implements Serializable {

	private static final long serialVersionUID = -445651316822157992L;

	private String name;
	
	private int erfahrung;

	public Krieger(String name, int erfahrung) {
		super();
		this.name = name;
		this.erfahrung = erfahrung;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getErfahrung() {
		return erfahrung;
	}

	public void setErfahrung(int erfahrung) {
		this.erfahrung = erfahrung;
	}
	
	
}
