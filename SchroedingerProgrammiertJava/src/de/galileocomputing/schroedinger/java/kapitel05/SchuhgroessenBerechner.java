package de.galileocomputing.schroedinger.java.kapitel05;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class SchuhgroessenBerechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double schuhgroesse = berechneSchuhgroesse(22.5);
		System.out.println(schuhgroesse);
	}

	public static double berechneSchuhgroesse(double fusslaenge) {
		return (fusslaenge + 1.5) / 0.666;
	}

}
