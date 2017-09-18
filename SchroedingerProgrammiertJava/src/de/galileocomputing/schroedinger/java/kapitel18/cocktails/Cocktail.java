package de.galileocomputing.schroedinger.java.kapitel18.cocktails;

import java.util.Collection;

import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Zutat;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class Cocktail {

	private Collection<Zutat> zutaten;

	public Cocktail(Collection<Zutat> zutaten) {
		this.zutaten = zutaten;
	}
	
	public int getAnzahlZutaten() {
		return this.zutaten.size();
	}
}
