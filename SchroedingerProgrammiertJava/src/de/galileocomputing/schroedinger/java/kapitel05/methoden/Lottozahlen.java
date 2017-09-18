package de.galileocomputing.schroedinger.java.kapitel05.methoden;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Lottozahlen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int zahl1 = Integer.parseInt(args[0]), 
			zahl2 = Integer.parseInt(args[1]), 
			zahl3 = Integer.parseInt(args[2]), 
			zahl4 = Integer.parseInt(args[3]), 
			zahl5 = Integer.parseInt(args[4]), 
			zahl6 = Integer.parseInt(args[5]), 
			zahl7 = Integer.parseInt(args[6]);
		druckeLottoschein(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7);
	}
	
	private static void druckeLottoschein(int zahl1, int zahl2, int zahl3,
			int zahl4, int zahl5, int zahl6, int zahl7) {
		for(int i=0; i<49; i++) {
			testeUndDruckeNeueZeile(i);
			druckeLottoscheinKaestchen(zahl1, zahl2, zahl3, zahl4, zahl5, zahl6, zahl7, i);
		}
	}

	private static void druckeLottoscheinKaestchen(int zahl1, int zahl2,
			int zahl3, int zahl4, int zahl5, int zahl6, int zahl7, int i) {
		if(i==zahl1 || i==zahl2 || i==zahl3 || i==zahl4 || i==zahl5 || i==zahl6 || i==zahl7) {
			System.out.print("|x|");
		} else {
			System.out.print("|_|");
		}
	}

	private static void testeUndDruckeNeueZeile(int i) {
		if(i%7==0) {
			System.out.println("");
		}
	}

}
