package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung;

import java.util.regex.Pattern;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class DrinOderNichtDrin {
	private static final String[] ALLE_MUSTER = {"[a-zA-Z]*", 
											"[a-zA-Z&&[^g-k]]*", 
											"[0-9]{2,4}", 
											"[^0-9]"
											};
	
	private static final String[] ALLE_ZEICHENKETTEN = {"abcdefg", 
													"Schrödinger", 
													"Bossingen", 
													"Katze", 
													"4",
													"44"
													};
	
	public static void main(String[] args) {
		for (String musterString : ALLE_MUSTER) {
			Pattern muster = Pattern.compile(musterString);
			for (String string : ALLE_ZEICHENKETTEN) {
				boolean passt = muster.matcher(string).matches();
				System.out.println(musterString + "\t" + string + "\t" + passt);
			}
		}
	}
}
