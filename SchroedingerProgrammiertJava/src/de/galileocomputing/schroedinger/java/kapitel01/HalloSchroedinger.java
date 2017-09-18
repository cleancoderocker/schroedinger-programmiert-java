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
		System.out.println("Wie alt bist Du?");
		int alter = System.in.read();
		System.out.println(alter);
	}

}
	