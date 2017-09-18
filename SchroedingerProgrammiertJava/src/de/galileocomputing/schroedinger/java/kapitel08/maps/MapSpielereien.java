package de.galileocomputing.schroedinger.java.kapitel08.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class MapSpielereien {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Map<String, Integer> anzahlTageInMonaten = new HashMap<String, Integer>();
		anzahlTageInMonaten.put("Januar", 31);
		anzahlTageInMonaten.put("Februar", 28);
		anzahlTageInMonaten.put("März", 31);
		anzahlTageInMonaten.put("April", 30);
		Set<String> alleSchluessel = anzahlTageInMonaten.keySet();
		for (String schluessel : alleSchluessel) {
			System.out.println("Der " + schluessel + " hat " + anzahlTageInMonaten.get(schluessel) + " Tage.");
		}
		Collection<Integer> werte = anzahlTageInMonaten.values();
	}
}
