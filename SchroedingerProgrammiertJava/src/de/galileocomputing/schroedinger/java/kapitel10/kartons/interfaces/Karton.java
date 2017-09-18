package de.galileocomputing.schroedinger.java.kapitel10.kartons.interfaces;

/**
 * 
 * @author Philip Ackermann
 *
 * @param <E>
 */
public class Karton<E> implements Behaelter<E> {

	private E inhalt;

	@Override
	public void setInhalt(E inhalt) {
		this.inhalt = inhalt;
	}

	@Override
	public E getInhalt() {
		return inhalt;
	}

}
