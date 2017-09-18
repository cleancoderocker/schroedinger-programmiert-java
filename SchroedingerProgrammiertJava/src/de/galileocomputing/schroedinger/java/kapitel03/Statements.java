package de.galileocomputing.schroedinger.java.kapitel03;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Statements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int suchZahl = 5;
		for (int i = 0; i < args.length; i++) {
			int zahl = Integer.parseInt(args[i]);
			if(zahl == suchZahl) {
				System.out.println(suchZahl + " gefunden an Stelle " + (i+1));
				break;
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			int zahl = Integer.parseInt(args[i]);
			if(zahl % suchZahl != 0) {
				System.out.println(zahl + " nicht teilbar durch " + suchZahl);
				continue;
			} else if(zahl == suchZahl) {
				System.out.println(suchZahl + " gefunden an Stelle " + (i+1));
				break;
			}
		}
		
		aussen:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
				if(i==5) {
					continue;
				} else {
					continue aussen;
				}
			}
		}
	}

}
