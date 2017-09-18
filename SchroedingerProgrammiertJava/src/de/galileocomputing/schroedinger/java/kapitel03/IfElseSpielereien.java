package de.galileocomputing.schroedinger.java.kapitel03;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class IfElseSpielereien {
	public static void main(String[] args) {
		int fuellhoeheInML = 125;
		if (fuellhoeheInML == 250) {
			System.out.println("Das Glas ist voll.");
		} else if (fuellhoeheInML == 125) {
			System.out.println("Das Glas ist halb voll.");
		} else if (fuellhoeheInML < 250) {
			System.out.println("Das Glas ist nicht mehr voll.");
		}
		
		fuellhoeheInML = 250;
		if(fuellhoeheInML > 0 && fuellhoeheInML <= 250)
			if(fuellhoeheInML == 125)
				System.out.println("Das Glas ist halb voll.");
		else
			System.out.println("Ist nichts drin im Glas.");
		
		System.out.println(fuellhoeheInML == 125 ? "Das Glas ist halb voll." : "Das Glas ist nicht halb voll.");
	}
}
