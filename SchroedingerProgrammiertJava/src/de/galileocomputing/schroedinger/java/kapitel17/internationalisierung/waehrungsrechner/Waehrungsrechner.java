package de.galileocomputing.schroedinger.java.kapitel17.internationalisierung.waehrungsrechner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Waehrungsrechner {
	
	private static final BigDecimal UMRECHNUNGS_FAKTOR = new BigDecimal(1.2996);
	private static final NumberFormat WAEHRUNGS_FORMAT_DEUTSCHLAND = NumberFormat.getCurrencyInstance(Locale.GERMANY);
	private static final NumberFormat WAEHRUNGS_FORMAT_USA = NumberFormat.getCurrencyInstance(Locale.US);
	
	public static void main(String[] args) {
		double euro = 27.0;
		double dollar = euroZuUSDollar(new BigDecimal(euro)).doubleValue();
		String meldung = generiereMeldung(euro, dollar);
		System.out.println(meldung);
	}
	
	public static BigDecimal euroZuUSDollar(BigDecimal euro) {
		BigDecimal dollar = euro.multiply(UMRECHNUNGS_FAKTOR);
		dollar = dollar.setScale(4, RoundingMode.HALF_DOWN);
		return dollar;
	}
	
//	private static String generiereMeldung(double euro, double dollar) {
//		Locale locale = Locale.getDefault();
//		ResourceBundle meldungen = ResourceBundle.getBundle("waehrungsrechner", locale);
//		StringBuilder meldung = new StringBuilder();
//		meldung.append(meldungen.getString("ergebnis"));
//		meldung.append(" ");
//		meldung.append(WAEHRUNGS_FORMAT_DEUTSCHLAND.format(euro));
//		meldung.append(" ");
//		meldung.append(meldungen.getString("sind"));
//		meldung.append(" ");
//		meldung.append(WAEHRUNGS_FORMAT_USA.format(dollar));
//		return meldung.toString();
//	}
	
	private static String generiereMeldung(double euro, double dollar) {
		Locale locale = Locale.getDefault();
		ResourceBundle meldungen = ResourceBundle.getBundle("waehrungsrechner", locale);
		String ergebnismeldung = meldungen.getString("ergebnismeldung");
		MessageFormat nachrichtenFormat = new MessageFormat(ergebnismeldung, locale);
		return nachrichtenFormat.format(new Object[]{WAEHRUNGS_FORMAT_DEUTSCHLAND.format(euro), WAEHRUNGS_FORMAT_USA.format(dollar)});
	}
}
