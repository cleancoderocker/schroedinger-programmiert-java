package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung.weinoderbier;

import java.util.ListResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GetraenkeBundle_de_DE extends ListResourceBundle {

	private Object[][] inhalte = {
            { "lieblingsgetraenk", new Bier() },
        };
	
	@Override
	protected Object[][] getContents() {
		return inhalte;
	}
}
