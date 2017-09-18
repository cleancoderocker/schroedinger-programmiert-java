package de.galileocomputing.schroedinger.java.kapitel17.lokalisierungformatierung;

import java.text.DateFormat;
import java.util.Locale;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class LaenderInDenenEnglischGesprochenWird {
	public static void main(String[] args) {
		Locale locales[] = DateFormat.getAvailableLocales();
        for (Locale locale : locales) {
        	if(Locale.ENGLISH.getLanguage().equals(locale.getLanguage())) {
        		String land = locale.getDisplayCountry(Locale.ITALIAN);
        		if(!land.isEmpty()) {
        			System.out.println(land);
        		}
        	}
        }
	}
}
