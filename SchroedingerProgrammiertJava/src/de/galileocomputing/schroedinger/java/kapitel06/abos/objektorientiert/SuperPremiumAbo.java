package de.galileocomputing.schroedinger.java.kapitel06.abos.objektorientiert;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SuperPremiumAbo extends PremiumAbo {
	
	public SuperPremiumAbo(Abonnent abonnent) {
		super(abonnent);
		System.out.println("Neues Super Premium-Abo");
	}
	
	@Override
	public double getPreisProJahr() {
		return super.getPreisProJahr() * 2;
	}
	
	@Override
	public double getPreisInklusiveRabatt() {
		if(this.getAbonnent().getAlter() < 18) {
			return this.getPreisProJahr() * 0.5;
		} else {
			return this.getPreisProJahr();
		}
	}
}
