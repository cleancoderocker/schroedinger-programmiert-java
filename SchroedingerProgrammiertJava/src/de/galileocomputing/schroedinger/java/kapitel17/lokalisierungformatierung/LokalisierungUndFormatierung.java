package de.galileocomputing.schroedinger.java.kapitel17.lokalisierungformatierung;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class LokalisierungUndFormatierung {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.toString());
		
		Currency waehrung = Currency.getInstance(Locale.US);
		System.out.println(waehrung.getCurrencyCode());
		System.out.println(waehrung.getDisplayName());
		System.out.println(waehrung.getSymbol());
		
		Locale[] locales = new Locale[] {Locale.GERMANY, Locale.US, Locale.CANADA, Locale.ITALY};
		int[] stile = new int[] {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG, DateFormat.FULL};
		for (int i = 0; i < locales.length; i++) {
			System.out.println(locales[i].getCountry() + " *****************************");
			for (int j = 0; j < stile.length; j++) {
				DateFormat datumsFormat = DateFormat.getDateInstance(stile[j], locales[i]);
				System.out.println(datumsFormat.format(new Date()));
			}
		}
		for (int i = 0; i < locales.length; i++) {
			System.out.println(locales[i].getCountry() + " *****************************");
			for (int j = 0; j < stile.length; j++) {
				DateFormat zeitFormat = DateFormat.getTimeInstance(stile[j], locales[i]);
				System.out.println(zeitFormat.format(new Date()));
			}
		}
		for (int i = 0; i < locales.length; i++) {
			NumberFormat waehrungsFormat = NumberFormat.getCurrencyInstance(locales[i]);
			NumberFormat zahlenFormat = NumberFormat.getNumberInstance(locales[i]);
			NumberFormat prozentFormat = NumberFormat.getPercentInstance(locales[i]);
			System.out.println(waehrungsFormat.format(24.0));
			System.out.println(zahlenFormat.format(24.0));
			System.out.println(prozentFormat.format(24.0));
		}
		DecimalFormat dezimalFormat = new DecimalFormat(".000");
		System.out.println(dezimalFormat.format(20));
	}
}
