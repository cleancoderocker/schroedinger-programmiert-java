package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class FindVsMatches {
	public static void main(String[] args) throws ParseException {
	    Pattern muster = Pattern.compile("0\\d{3,4}[/\\-\\s]?\\d{6,7}");
	    Matcher matcher = muster.matcher("Kein Anschluss unter dieser Nummer: \n0123/123456");
	    System.out.println(matcher.find());
	    System.out.println(matcher.matches());

	    muster = Pattern.compile("^0\\d{3,4}[/\\-\\s]?\\d{6,7}$");
	    matcher = muster.matcher("Kein Anschluss unter dieser Nummer: 0123/123456");
	    System.out.println(matcher.find());
	    System.out.println(matcher.matches());
	}
}
