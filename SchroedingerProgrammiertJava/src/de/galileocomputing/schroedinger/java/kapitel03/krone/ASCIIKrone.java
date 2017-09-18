package de.galileocomputing.schroedinger.java.kapitel03.krone;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class ASCIIKrone {
	public static void main(String[] args) {
		final int breite = 25; // nur ungerade Zahlen sind erlaubt
		final int haelfteBreite = (breite-1)/2;
		final int hoehe = haelfteBreite;
		final int letzteReihe = hoehe-1;
		for (int i = 0; i < hoehe; i++) {
			for (int j = 0; j < breite; j++) {
				switch(i) {
				case 0: 
//					if(j==0 || (j==haelfteBreite) || j==breite-1) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
					System.out.print((j==0 || (j==haelfteBreite) || j==breite-1) ? "*" : " ");
					break;
				case letzteReihe:
					System.out.print(8);
					break;
				default:
//					if(j<i || (j>haelfteBreite-i && j<haelfteBreite+i) || j>=breite-i) {
//						System.out.print(0);
//					} else {
//						System.out.print(" ");
//					}
					System.out.print((j<i || (j>haelfteBreite-i && j<haelfteBreite+i) || j>=breite-i) ? 0 : " ");
				}
			}
			System.out.println();
		}
	}
}
