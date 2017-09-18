package de.galileocomputing.schroedinger.java.kapitel10.tierkoerbe;

/**
 * 
 * @author Philip Ackermann
 *
 * @param <Tier>
 */
public class Korb<E> {
	private E bewohner;

	public E getBewohner() {
		return bewohner;
	}

	public void setBewohner(E bewohner) {
		this.bewohner = bewohner;
	}
	
	
}
