package de.galileocomputing.schroedinger.java.kapitel05;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class BuchMesse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Buch buch = new Buch();
		buch.setTitel("Romeo und Julia");
		buch.setAutor("William Shakespeare");
		buch.setSeitenAnzahl(400);
		buch.setGebunden(false);
		buch.lesen();
	}

}
