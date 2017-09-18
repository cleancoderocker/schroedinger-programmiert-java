package de.galileocomputing.schroedinger.java.kapitel09.exceptions;


/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Main {
	public static void main(String[] args) {
		if(args.length >= 2) {
			try {
				Integer zahl1 = Integer.parseInt(args[0]);
				Integer zahl2 = Integer.parseInt(args[1]);
				System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
			} catch (NumberFormatException exception) {
				System.err.println("Zahlen bitte.");				
			}
		} else {
			System.err.println("Ohne gute Argumente kommst du bei mir nicht weiter.");
		}
	}
}
