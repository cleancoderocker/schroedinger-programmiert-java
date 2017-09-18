package de.galileocomputing.schroedinger.java.kapitel10.kartons.interfaces;

/**
 * 
 * @author Philip Ackermann
 *
 * @param <E>
 */
public interface Behaelter<E> {
	void setInhalt(E inhalt);
	
	E getInhalt();
}
