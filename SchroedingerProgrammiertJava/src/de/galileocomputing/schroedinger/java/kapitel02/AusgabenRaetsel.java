package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class AusgabenRaetsel {
	public static void main(String[] args) {
		int zahl = 7;
		System.out.println(++zahl); // 3
		System.out.println(zahl++); // 2
		System.out.println(zahl*zahl); // 1
		System.out.println(zahl=zahl*zahl); // 4
		System.out.println(zahl=(zahl-9)/8); // 7
		System.out.println(zahl--); // 6
		System.out.println(--zahl); // 5
		System.out.println(zahl); // 8
	}
}
