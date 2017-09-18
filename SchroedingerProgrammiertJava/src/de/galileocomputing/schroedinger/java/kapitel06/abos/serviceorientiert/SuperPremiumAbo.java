package de.galileocomputing.schroedinger.java.kapitel06.abos.serviceorientiert;

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
}
