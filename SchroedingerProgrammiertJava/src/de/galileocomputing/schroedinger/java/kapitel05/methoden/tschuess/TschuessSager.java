package de.galileocomputing.schroedinger.java.kapitel05.methoden.tschuess;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class TschuessSager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sagTschuess("Schrödinger");
		sagTschuess("Bossingen");
	}

	public static void sagTschuess(String name) {
		if(name != null && name.startsWith("Boss")) {
			System.out.println("Auf Wiedersehen, Herr " + name);
		} else {
			System.out.println("Tschüss " + name);
		}
	}

}
