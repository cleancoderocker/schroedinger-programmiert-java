package de.galileocomputing.schroedinger.java.kapitel05.heap;

import de.galileocomputing.schroedinger.java.kapitel05.Katze;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class Katzenwahnsinn {
	public static void main(String[] args) {
		for(int i=0; i<4; i++) {
			machKatzen(100000);
			warten(5000);
		}
	}

	@SuppressWarnings("unused")
	private static void machKatzen(int anzahl) {
		for(int i=0; i<anzahl; i++) {
			Katze katze = new Katze("Katze " + i);	
		}
	}

	private static void warten(long millisekunden) {
		try {
			Thread.sleep(millisekunden);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
