package de.galileocomputing.schroedinger.java.kapitel07.verschachtelteklassen.statisch;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Bank {
	
	@SuppressWarnings("unused")
	private double vermoegen = 40.0;
	
	public static class Tresor {
		private void oeffnen() {
			// System.out.println(vermoegen);
		}
	}
	
	public Bank() {
		Tresor tresor = new Tresor();
		tresor.oeffnen();
	}
}
