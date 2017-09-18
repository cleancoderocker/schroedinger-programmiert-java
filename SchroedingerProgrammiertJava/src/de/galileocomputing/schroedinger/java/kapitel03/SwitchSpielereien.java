package de.galileocomputing.schroedinger.java.kapitel03;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class SwitchSpielereien {
	public static void main(String[] args) {
		int s = 5;
		switch (s) {
		case 1: case 3: case 5: case 11: case 13: case 17: System.out.println("Primzahl");
		}
		
		final int HUND = 0;
		final int KATZE = 1;
		final int VOGEL = 2;
		final int PFERD = 3;
		final int FISCH = 4;
		
		int eingabe = 256;
		final byte einKleinesByte = 2;
		final char einKleinerCharacter = 'c';
		final short einKleinesShort = 500;
		
		switch(eingabe) {
			case einKleinesByte:
			case einKleinerCharacter:
			case einKleinesShort:
		}
		
		int tierTyp = HUND;
		switch(tierTyp) {
		case HUND:
			System.out.println("Hund");
			break;
		case KATZE:
			System.out.println("Katze");
			break;
		case VOGEL:
			System.out.println("Vogel");
			break;
		case PFERD:
			System.out.println("Pferd");
			break;
		case FISCH:
			System.out.println("Fisch");
			break;
		}
	}
}
