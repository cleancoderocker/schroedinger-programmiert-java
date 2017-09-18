package de.galileocomputing.schroedinger.java.kapitel05.heap;

import java.util.ArrayList;
import java.util.List;

import de.galileocomputing.schroedinger.java.kapitel05.Katze;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class TierschutzVerein {
	private static List<Katze> tierschuetzer = new ArrayList<>();
	
	public static void main(String[] args) {
		for(int i=0; i<14; i++) {
			machKatzen(100000);
			warten(5000);
		}
	}

	private static void machKatzen(int anzahl) {
		for(int i=0; i<anzahl; i++) {
			tierschuetzer.add(new Katze("Katze " + i));	
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
