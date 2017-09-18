package de.galileocomputing.schroedinger.java.kapitel06.blumen;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Blume blume = new RoteRose();
		blume.dranRiechen();
		Blume nochEineBlume = new Tulpe();
		nochEineBlume.dranRiechen();
	}
}
