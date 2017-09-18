package de.galileocomputing.schroedinger.java.kapitel03.primzahlen;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class PrimzahlenBerechnerOptimiert {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) { 			
			boolean istPrimzahl = true;
			for(int j=2; j*j<i; j++) {
				if(i%j == 0) {
					istPrimzahl = false;
					break;
				}
			}
			if(istPrimzahl) {
				System.out.println("--> " + i + " ist eine Primzahl");
			}
		}
	}
}
