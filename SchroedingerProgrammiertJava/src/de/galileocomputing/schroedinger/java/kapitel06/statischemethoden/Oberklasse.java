package de.galileocomputing.schroedinger.java.kapitel06.statischemethoden;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Oberklasse {
	
	public static String klassenFeld = "Klassenfeld in Oberklasse";
	
	public static String objektFeld = "Objektfeld in Oberklasse";
	
	public static void klassenMethode() {
		System.out.println("Klassenmethode der Oberklasse");
	}
	
	public void objektMethode() {
		System.out.println("Objektmethode der Oberklasse");
	}
}
