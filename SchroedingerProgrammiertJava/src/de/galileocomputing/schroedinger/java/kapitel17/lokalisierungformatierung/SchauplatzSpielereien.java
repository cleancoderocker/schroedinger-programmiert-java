package de.galileocomputing.schroedinger.java.kapitel17.lokalisierungformatierung;

import java.util.Locale;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchauplatzSpielereien {
	public static void main(String[] args) {
		Locale deutsch = new Locale("de");
		Locale franzoesisch = new Locale.Builder().setLanguage("fr").build();
		Locale ialienisch = Locale.ITALIAN;
		Locale spanisch = Locale.forLanguageTag("es");
		System.out.println(deutsch.getDisplayLanguage());
		System.out.println(franzoesisch.getDisplayLanguage());
		System.out.println(ialienisch.getDisplayLanguage());
		System.out.println(spanisch.getDisplayLanguage());
		System.out.println(deutsch.getDisplayLanguage(franzoesisch));
		System.out.println(franzoesisch.getDisplayLanguage(franzoesisch));
		System.out.println(ialienisch.getDisplayLanguage(franzoesisch));
		System.out.println(spanisch.getDisplayLanguage(franzoesisch));
		
		Locale deutschland = new Locale("de", "DE");
		Locale frankreich = new Locale.Builder().setLanguage("fr").setRegion("FR").build();
		Locale italien = Locale.ITALY;
		Locale spanien = Locale.forLanguageTag("es-ES");
		System.out.println(deutschland.getDisplayCountry());
		System.out.println(frankreich.getDisplayCountry());
		System.out.println(italien.getDisplayCountry());
		System.out.println(spanien.getDisplayCountry());
		System.out.println(deutschland.getDisplayCountry(frankreich));
		System.out.println(frankreich.getDisplayCountry(frankreich));
		System.out.println(italien.getDisplayCountry(frankreich));
		System.out.println(spanien.getDisplayCountry(frankreich));
	}
}
