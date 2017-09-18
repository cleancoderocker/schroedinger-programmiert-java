package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung;

import java.util.ListResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhkartonBundle_de_DE extends ListResourceBundle {

    private Object[][] inhalte = {
            { "hoehe", Integer.valueOf(10) },
            { "tiefe", Integer.valueOf(34) },
            { "breite", Integer.valueOf(20) },
        };
    
	@Override
	protected Object[][] getContents() {
		return inhalte;
	}

}
