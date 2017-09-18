package de.galileocomputing.schroedinger.java.kapitel07.verschachtelteklassen.lokal;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Bank {
	
	private double vermoegen = 40.0;
	
	public Bank() {
		final double zahl = 7;
		class Tresor {
			private double getInhalt() {
				double andereZahl = zahl + vermoegen;
				return andereZahl;
			}
		}
		Tresor tresor = new Tresor();
		tresor.getInhalt();
	}
	
	@SuppressWarnings("unused")
	public double getVermoegen() {
		{
			class Tresor {
				private void getInhalt() {
					 System.out.println(vermoegen);
				}
			}
			Tresor tresor = new Tresor();
			return vermoegen;
		}
	}
}
