package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Internationalisierung {
	public static void main(String[] args) {
		Locale locale = Locale.forLanguageTag("fi");
		ResourceBundle meldungen = ResourceBundle.getBundle("meldungen", locale);
		System.out.println(meldungen.getClass());
		System.out.println(meldungen.getString("hoehe"));
		System.out.println(meldungen.getString("tiefe"));
		System.out.println(meldungen.getString("breite"));
		System.out.println(meldungen.getString("ergebnis"));
		
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.US).getString("gruss"));
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("gruss"));
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.CANADA).getString("gruss"));
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.ENGLISH).getString("gruss"));
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("gruss"));
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("ausgabe"));
		System.out.println(ResourceBundle.getBundle("meldungen", Locale.UK).getString("text"));
		
		ResourceBundle schuhkartonBundle = ResourceBundle.getBundle("de.galileocomputing.schroedinger.java.kapitel17.internationalisierung.SchuhkartonBundle", new Locale("fi", "FI"));
		System.out.println(schuhkartonBundle.getClass());
		System.out.println(schuhkartonBundle.getObject("hoehe"));
		System.out.println(schuhkartonBundle.getObject("tiefe"));
		System.out.println(schuhkartonBundle.getObject("breite"));
	}
}
