package de.galileocomputing.schroedinger.java.kapitel13.stereoanlage;

/**
 * Eine Klasse, die das Verhalten einer Stereoanlage implementiert. 
 * 
 * @author Philip Ackermann
 *
 */
public class StereoAnlage {
	
	private int lautstaerke;
	
	/**
	 * Startet die Stereoanlage.
	 */
	public void musikHoeren() {
		System.out.println("La, la, la, la, Listen to my heart");
	}
	
	/**
	 * Setzt die Lautstärke
	 * 
	 * @param lautstaerke	Die Lautstärke.
	 */
	public void setLautstaerke(int lautstaerke) {
		this.lautstaerke = lautstaerke;
	}

	/**
	 * Gibt die Lautstärke zurück.
	 * 
	 * @return Lautstärke
	 */
	public int getLautstaerke() {
		return lautstaerke;
	}
	
	
}
