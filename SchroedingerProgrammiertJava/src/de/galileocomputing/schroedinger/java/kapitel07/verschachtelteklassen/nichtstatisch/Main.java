package de.galileocomputing.schroedinger.java.kapitel07.verschachtelteklassen.nichtstatisch;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Bank.Tresor tresor = new Bank().new Tresor();
	}
}
