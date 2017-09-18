package de.galileocomputing.schroedinger.java.kapitel09.exceptions;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Taschenrechner {
	public static void main(String[] args) {
		Taschenrechner taschenrechner = new Taschenrechner();
		System.out.println(taschenrechner.division(8, 0));
		System.out.println(taschenrechner.minus(4, 8));
	}
	
	public int division(int dividend, int divisor) {
		int ergebnis = 0;
		try {
			ergebnis = dividend / divisor;
		} catch(ArithmeticException exception) {
			System.err.println("Ups, das war wohl nichts. Einer der Operanden ist nicht gültig.");
		}
		return ergebnis;
	}
	
	public int minus(int zahl1, int zahl2) {
		int ergebnis = 0;
		if(zahl2 < zahl1) {
			ergebnis = zahl1 - zahl2;
		}
		assert ergebnis >= 0;
		return ergebnis;
	}
}
