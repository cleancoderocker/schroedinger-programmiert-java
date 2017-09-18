package de.galileocomputing.schroedinger.java.kapitel07.rollenspiele;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class FotoService {
	
	public static void main(String[] args) {
		heldenFotoMachen(new Zauberer());
		heldenFotoMachen(new Superman());
	}
	
	public static void heldenFotoMachen(Held held) {
		held.heldenhaftPosieren();
	}
}
