package de.galileocomputing.schroedinger.java.kapitel03.notenspiegel;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Lehrer {
	public static void main(String[] args) {
		int note = 1;
		switch(note) {
			case 1: System.out.println("sehr gut"); break; 
			case 2: System.out.println("gut"); break; 
			case 3: System.out.println("befriedigend"); break; 
			case 4: System.out.println("ausreichend"); break; 
			case 5: System.out.println("mangelhaft"); break; 
			case 6: System.out.println("ungenügend"); break; 
			default: System.out.println("ungültiger Wert");
		}
		
		if(note >= 1 && note <= 6) {
			switch(note) {
				case 1: System.out.println("sehr gut"); break; 
				case 2: System.out.println("gut"); break; 
				case 3: System.out.println("befriedigend"); break; 
				case 4: System.out.println("ausreichend"); break; 
				case 5: System.out.println("mangelhaft"); break; 
				case 6: System.out.println("ungenügend"); break; 
				default: System.out.println("Ungültiger Wert");
			}
		} else {
			System.out.println("Ungültiger Wert");
		}
	}
}