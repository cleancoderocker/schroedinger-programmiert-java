package de.galileocomputing.schroedinger.java.kapitel18.cocktails;

import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Zutat;

/**
 * 
 * @author Philip Ackermann
 *
 */
public interface CocktailMixer {
	void hinzufuegen(Zutat zutat);

	Cocktail mixen() throws EkligeZutatenKombinationException;

	int getAnzahlZutaten();

	void entfernen(Zutat zutat);
}
