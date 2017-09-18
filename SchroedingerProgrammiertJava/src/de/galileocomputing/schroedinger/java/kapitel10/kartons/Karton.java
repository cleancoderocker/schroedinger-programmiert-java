package de.galileocomputing.schroedinger.java.kapitel10.kartons;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Karton<E> {
	private E inhalt;
	
	public Karton(E inhalt) {
		this.inhalt = inhalt;
	}

	public E getInhalt() {
		return inhalt;
	}

	public void setInhalt(E inhalt) {
		this.inhalt = inhalt;
	}
}
