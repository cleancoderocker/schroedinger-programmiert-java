package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung;

import java.util.ListResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhkartonBundle_fi_FI extends ListResourceBundle {

    private Object[][] inhalte = {
            { "hoehe", Integer.valueOf(20) },
            { "tiefe", Integer.valueOf(20) },
            { "breite", Integer.valueOf(20) },
        };
    
	@Override
	protected Object[][] getContents() {
		return inhalte;
	}

}
