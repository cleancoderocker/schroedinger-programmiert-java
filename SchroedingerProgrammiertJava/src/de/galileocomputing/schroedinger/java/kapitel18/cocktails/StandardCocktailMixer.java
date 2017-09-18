package de.galileocomputing.schroedinger.java.kapitel18.cocktails;

import java.util.ArrayList;
import java.util.Collection;

import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Apfelsaft;
import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Banane;
import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Zutat;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StandardCocktailMixer implements CocktailMixer {
	
	private Collection<Zutat> zutaten;
	
	public StandardCocktailMixer() {
		this.zutaten = new ArrayList<>();
	}
	
	@Override
	public void hinzufuegen(Zutat zutat) {
		this.zutaten.add(zutat);
	}

	@Override
	public Cocktail mixen() throws EkligeZutatenKombinationException {
		if(enthaelt(this.zutaten, Banane.class) && enthaelt(this.zutaten, Apfelsaft.class)) {
			throw new EkligeZutatenKombinationException();
		}
		Collection<Zutat> zutaten = new ArrayList<>(this.zutaten);
		this.zutaten.clear();
		return new Cocktail(zutaten);
	}

	@Override
	public int getAnzahlZutaten() {
		return this.zutaten.size();
	}
	
	public static <T> boolean enthaelt(Collection<?> collection, Class<T> klasse) {
	    for(Object o : collection) {
	        if (o != null && o.getClass() == klasse)  {
	            return true;
	        }
	    }
	    return false;    
	}

	@Override
	public void entfernen(Zutat zutat) {
		this.zutaten.remove(zutat);
	}
	
}
