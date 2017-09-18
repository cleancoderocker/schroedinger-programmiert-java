package de.galileocomputing.schroedinger.java.kapitel11.serialization.notizen;

import java.io.Serializable;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Notiz implements Serializable {
	
	private static final long serialVersionUID = 6847025911291986221L;
	private Autor autor;
	private String nachricht;
	
	public Notiz(Autor autor, String nachricht) {
		super();
		this.autor = autor;
		this.nachricht = nachricht;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getNachricht() {
		return nachricht;
	}

	public void setNachricht(String nachricht) {
		this.nachricht = nachricht;
	}

}
