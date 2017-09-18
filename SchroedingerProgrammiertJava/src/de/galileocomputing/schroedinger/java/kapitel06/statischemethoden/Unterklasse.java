package de.galileocomputing.schroedinger.java.kapitel06.statischemethoden;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Unterklasse extends Oberklasse {
	
	public static String klassenFeld = "Klassenfeld in Unterklasse";
	
	public static String objektFeld = "Objektfeld in Unterklasse";
	
	public static void klassenMethode() {
		System.out.println("Klassenmethode der Unterklasse");
	}
	
	@Override
	public void objektMethode() {
		System.out.println("Objektmethode der Unterklasse");
	}
}
