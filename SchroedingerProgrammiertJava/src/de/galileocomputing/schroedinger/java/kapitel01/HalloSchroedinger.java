package de.galileocomputing.schroedinger.java.kapitel01;

import java.io.IOException;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class HalloSchroedinger {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Hallo " + args[0]);
		System.out.println("Gib einen Wert ein:");
		int wert = System.in.read();
		System.out.println(wert);
	}

}
	