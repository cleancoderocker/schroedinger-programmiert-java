package de.galileocomputing.schroedinger.java.kapitel12.synchronisierung;

import de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete.MusikAbspielGeraet;
import de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete.SchallplattenSpieler;
import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.LP;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	
	public static void main(String[] args) {
		final MusikAbspielGeraet plattenSpieler = new SchallplattenSpieler();
		(new Thread(new Runnable() {
			@Override
			public void run() {
				plattenSpieler.hoeren(new LP("The Doors"));
			}
		}, "Hörer")).start();
		(new Thread(new Runnable() {
			@Override
			public void run() {
				plattenSpieler.auswerfen();
			}
		}, "Auswerfer")).start();
	}
}
