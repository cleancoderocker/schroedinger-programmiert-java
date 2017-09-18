package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung.weinoderbier;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class WeinOderBier {
	public static void main(String[] args) {
		ResourceBundle getrankeBundle = ResourceBundle.getBundle("de.galileocomputing.schroedinger.java.kapitel17.internationalisierung.weinoderbier.GetraenkeBundle", Locale.FRANCE);
		Getraenk lieblingsgetraenk = (Getraenk) getrankeBundle.getObject("lieblingsgetraenk");
		System.out.println(lieblingsgetraenk.getClass().getSimpleName());
	}
}
