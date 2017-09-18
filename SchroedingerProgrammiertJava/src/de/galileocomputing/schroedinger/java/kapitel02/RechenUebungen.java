package de.galileocomputing.schroedinger.java.kapitel02;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class RechenUebungen {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int ergebnis  = a + b;
		System.out.println(ergebnis);
		ergebnis  = a + b * b;
		System.out.println(ergebnis);
		ergebnis  = (a + b) * b;
		System.out.println(ergebnis);
		
		int ganzzahl = 5;
		ergebnis = ganzzahl/2;
		System.out.println(ergebnis);
		
		double fließkommazahl = 5;
		ergebnis = 5/2;
		System.out.println(ergebnis);

		int zahl = 7;
		System.out.println(++zahl);
		System.out.println(zahl++);
		
		double d = 10.0/3.0;
		System.out.println(d);
		
		BigDecimal zehn = new BigDecimal(10);
		BigDecimal drei = new BigDecimal(3);
		BigDecimal ergebnis2 = zehn.divide(drei, 16, RoundingMode.HALF_UP);
		System.out.println(ergebnis2);
	}
}
