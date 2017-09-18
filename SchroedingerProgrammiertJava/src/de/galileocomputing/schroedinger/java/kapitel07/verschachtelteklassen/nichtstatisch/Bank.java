package de.galileocomputing.schroedinger.java.kapitel07.verschachtelteklassen.nichtstatisch;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Bank {
	
	@SuppressWarnings("unused")
	private double vermoegen = 40.0;
	
	public class Tresor {
		private void getInhalt() {
			// System.out.println(vermoegen);
		}
	}
	
	public Bank() {
		Tresor tresor = new Tresor();
		tresor.getInhalt();
	}
}
