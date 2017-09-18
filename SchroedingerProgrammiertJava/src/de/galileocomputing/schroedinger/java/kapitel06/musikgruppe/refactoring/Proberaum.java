package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe.refactoring;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Proberaum {
	public static void main(String[] args) {
		Musiker saenger = new Saenger("","","");
		Musiker gitarrist = new Gitarrist("","","");
		Musiker bassist = new Bassist("","","");
		Musiker trompeter = new Trompeter("","","");
		Musiker backgroundSaengerin = new BackgroundSaengerin("","","");
		saenger.musizieren();
		gitarrist.musizieren();
		bassist.musizieren();
		trompeter.musizieren();
		backgroundSaengerin.musizieren();
	}
}
