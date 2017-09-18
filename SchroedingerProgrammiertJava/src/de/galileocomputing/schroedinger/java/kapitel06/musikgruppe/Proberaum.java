package de.galileocomputing.schroedinger.java.kapitel06.musikgruppe;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class Proberaum {
	public static void main(String[] args) {
		Musiker saenger = new Saenger();
		Musiker gitarrist = new Gitarrist();
		Musiker bassist = new Bassist();
		Musiker trompeter = new Trompeter();
		Musiker backgroundSaengerin = new BackgroundSaengerin();
		machtMusik(saenger, gitarrist, bassist, trompeter, backgroundSaengerin);
	}
	
	public static void machtMusik(Musiker... gruppe) {
	    for(Musiker musiker : gruppe) {
	      musiker.musizieren();
	    }
	  }

}
