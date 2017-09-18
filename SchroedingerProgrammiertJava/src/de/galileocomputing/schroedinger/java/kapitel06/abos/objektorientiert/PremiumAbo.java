package de.galileocomputing.schroedinger.java.kapitel06.abos.objektorientiert;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class PremiumAbo extends Abo {
	
	public PremiumAbo(Abonnent abonnent) {
		super(abonnent);
		System.out.println("Neues Premium-Abo");
	}
	
	@Override
	public double getPreisProJahr() {
		return super.getPreisProJahr() * 2;
	}
	
	@Override
	public double getPreisInklusiveRabatt() {
		if(this.getAbonnent().getAlter() < 18) {
			return this.getPreisProJahr() * 0.75;
		} else {
			return this.getPreisProJahr();
		}
	}
}
