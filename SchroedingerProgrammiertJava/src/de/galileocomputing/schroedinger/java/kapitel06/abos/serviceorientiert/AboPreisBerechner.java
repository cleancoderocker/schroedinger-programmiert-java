package de.galileocomputing.schroedinger.java.kapitel06.abos.serviceorientiert;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class AboPreisBerechner {
	public double berechnePreisInklusiveRabatt(Abo abo) {
		double preis = 0;
		if(abo instanceof SuperPremiumAbo) {
			if(abo.getAbonnent().getAlter() < 18) {
				preis = abo.getPreisProJahr() * 0.5;
			}
		} else if(abo instanceof PremiumAbo) {
			if(abo.getAbonnent().getAlter() < 18) {
				preis = abo.getPreisProJahr() * 0.75;
			}
		} else {
			preis = abo.getPreisProJahr();
		}
		return preis;
	}
}
