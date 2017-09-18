package de.galileocomputing.schroedinger.java.kapitel07.konstanten.sender;

/**
 * 
 * @author Philip Ackermann
 *
 */
public enum Sender {
	ARD(true), ZDF(false), RTL(false), SAT1(true);
	
	private boolean findeIchGut;
	
	Sender(boolean findeIchGut) {
		this.findeIchGut = findeIchGut;
	}
	
	public boolean istGuterSender() {
		return this.findeIchGut;
	}
}
