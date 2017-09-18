package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung.telefonnummern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class TelefonnummerValidator {
	
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("0123/123456");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("..../......");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile(".....?/.......?");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile(".{4,5}/.{6,7}");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("[0-9]{4,5}/[0-9]{6,7}");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("\\d{4,5}/\\d{6,7}");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("0\\d{3,4}/\\d{6,7}");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("0\\d{3,4}[/\\s-]\\d{6,7}");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("0\\d{3,4}[/\\-\\s]?\\d{6,7}");
//	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("^0\\d{3,4}[/\\-\\s]?\\d{6,7}$");
	private static final Pattern TELEFONNUMMERN_MUSTER = Pattern.compile("^(0\\d{3,4})[/\\-\\s]?(\\d{6,7})$");
	private static final Pattern TELEFONNUMMERN_MUSTER_VORKOMMEN = Pattern.compile("(0\\d{3,4})[/\\-\\s]?(\\d{6,7})");
	
	public static void main(String[] args) {
		System.out.println(istGueltigeTelefonnummer("0123/123456"));
		System.out.println(istGueltigeTelefonnummer("0228/234567"));
		System.out.println(istGueltigeTelefonnummer("02288/2345678"));
		System.out.println(istGueltigeTelefonnummer("0228 123456"));
		System.out.println(istGueltigeTelefonnummer("0228123456"));
		System.out.println(istGueltigeTelefonnummer("0228-123456"));
		System.out.println(istGueltigeTelefonnummer("022812345634"));
		System.out.println(istGueltigeTelefonnummer("123456/123456"));
		System.out.println(istGueltigeTelefonnummer("abcde/2345678"));
		Telefonnummer telefonnummer = erstelleTelefonnummer("0123/123456");
		System.out.println(telefonnummer.getVorwahl());
		System.out.println(telefonnummer.getHauptnummer());
		Matcher matcher = TELEFONNUMMERN_MUSTER_VORKOMMEN.matcher("Kein Anschluss unter dieser Nummer: 0123/123456 und auch nicht unter 0123/223456.");
		System.out.println(matcher.find());
		System.out.println(matcher.find());
		System.out.println(matcher.find());
	}
	
	public static boolean istGueltigeTelefonnummer(String telefonnummer) {
		Matcher matcher = TELEFONNUMMERN_MUSTER.matcher(telefonnummer);
	    return matcher.matches();
	}
	
	public static Telefonnummer erstelleTelefonnummer(String telefonnummer) {
		Matcher matcher = TELEFONNUMMERN_MUSTER.matcher(telefonnummer);
		matcher.matches();
		String vorwahl = matcher.group(1);
		String hauptnummer = matcher.group(2);
		return new Telefonnummer(vorwahl, hauptnummer);
	}
}
