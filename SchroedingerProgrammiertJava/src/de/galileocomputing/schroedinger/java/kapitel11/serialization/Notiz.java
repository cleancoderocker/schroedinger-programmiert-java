package de.galileocomputing.schroedinger.java.kapitel11.serialization;

import java.io.Serializable;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Notiz implements Serializable {
	
	private static final long serialVersionUID = -5260698528552357657L;
	private String autor;
	private String nachricht;

	public Notiz(String autor, String nachricht) {
		super();
		this.autor = autor;
		this.nachricht = nachricht;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNachricht() {
		return nachricht;
	}

	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}

}
