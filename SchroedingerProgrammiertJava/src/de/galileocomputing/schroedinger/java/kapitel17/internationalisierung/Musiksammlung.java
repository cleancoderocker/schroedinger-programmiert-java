package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Musiksammlung {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		ResourceBundle meldungen = ResourceBundle.getBundle("musiksammlung", locale);
		String ergebnismeldung = meldungen.getString("musiksammlungstatus");
		MessageFormat meldungsFormat = new MessageFormat(ergebnismeldung, locale);
		String meldung = meldungsFormat.format(new Object[]{20, "Jimi Hendrix", 200});
		System.out.println(meldung);
	}
}
