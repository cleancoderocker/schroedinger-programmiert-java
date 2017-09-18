package de.galileocomputing.schroedinger.java.kapitel05.garbagecollection;

import de.galileocomputing.schroedinger.java.kapitel05.Katze;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		for(int i=0; i<100000; i++) {
			Katze katze = new Katze("Katze " + i);	
			katze = null;
		}
		try {
			System.gc();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
