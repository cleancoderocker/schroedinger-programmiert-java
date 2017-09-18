package de.galileocomputing.schroedinger.java.kapitel17.lokalisierungformatierung;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringFormatierung {
	public static void main(String[] args) {
		System.out.println(String.format("Hallo %s und viel Spaß mit Kapitel %d", "Schrödinger", 17));
		
		for(int i=1; i<=10; i++) {
			System.out.println(String.format("%02d ", i));
		}
		
		for(int i=1; i<=2000; i++) {
			System.out.print(String.format("%04d ", i));
			if(i%100==0) {
				System.out.println();
			}
		}
		System.out.println(String.format("%d", 4));
		System.out.println(String.format("%04d", 4));
	}
}
