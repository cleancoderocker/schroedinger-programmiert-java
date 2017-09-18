package de.galileocomputing.schroedinger.java.kapitel03.notenspiegel;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class NotenSpiegel {
	public static void main(String[] args) {
		String note = "Sehr gut";
		switch(note.toLowerCase()) {
			case "sehr gut": System.out.println(1); break; 
			case "gut": System.out.println(2); break; 
			case "befriedigend": System.out.println(3); break; 
			case "ausreichend": System.out.println(4); break; 
			case "mangelhaft": System.out.println(5); break; 
			case "ungenügend": System.out.println(6); break; 
			default: System.out.println("Ungültiger Wert");
		}
	}
}
