package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Pattern muster = Pattern.compile("Sch......er");
		Matcher sucher = muster.matcher("Schrödinger");
//		Matcher sucher = muster.matcher("Schlaumeier");
//		Matcher sucher = muster.matcher("Schrohmeier");
//		Matcher sucher = muster.matcher("Schinkeneier");
		boolean gefunden = sucher.matches();;
		System.out.println(gefunden);
		while (sucher.find()) {
			  System.out.println(sucher.start());
			  System.out.println(sucher.group());
			  System.out.println(sucher.end());
			}

	}
}
