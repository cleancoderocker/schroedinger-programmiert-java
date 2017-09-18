package de.galileocomputing.schroedinger.java.kapitel07.verschachtelteklassen.anonym;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Bank {
	
	private double vermoegen = 40.0;
	
	public Bank() {
		Tresor tresor = new Tresor() {
			@Override
			public double getInhalt() {
				return vermoegen;
			}
		};
		tresor.getInhalt();
	}

}
