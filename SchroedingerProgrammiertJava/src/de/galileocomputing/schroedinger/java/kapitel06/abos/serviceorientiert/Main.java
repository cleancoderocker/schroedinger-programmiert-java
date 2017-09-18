package de.galileocomputing.schroedinger.java.kapitel06.abos.serviceorientiert;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Abonnent person = new Abonnent(22);
		Abo abo = new SuperPremiumAbo(person);
		AboPreisBerechner aboPreisBerechner = new AboPreisBerechner();
		System.out.println(aboPreisBerechner.berechnePreisInklusiveRabatt(abo));
	}
	

}
