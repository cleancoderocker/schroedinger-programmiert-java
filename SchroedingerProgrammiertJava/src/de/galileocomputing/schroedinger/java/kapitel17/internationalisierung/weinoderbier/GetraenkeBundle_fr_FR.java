package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung.weinoderbier;

import java.util.ListResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GetraenkeBundle_fr_FR extends ListResourceBundle {

	private Object[][] inhalte = {
            { "lieblingsgetraenk", new Wein() },
        };
	
	@Override
	protected Object[][] getContents() {
		return inhalte;
	}

}
