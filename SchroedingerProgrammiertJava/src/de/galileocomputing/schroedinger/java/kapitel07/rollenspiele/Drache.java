package de.galileocomputing.schroedinger.java.kapitel07.rollenspiele;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public abstract class Drache extends RollenspielCharakter implements Monster {
	public abstract void spucken();

	public void fliegen() {
		// Fliegen
	}
	
	@Override
	public void bruellen() {
		
	}
}
