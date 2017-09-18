package de.galileocomputing.schroedinger.java.kapitel08.arrays;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Arrays {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Katze[] katzen = {new Katze(),new Katze(),new Katze(),new Katze()};
		machWasMitKatzen(new Katze[]{new Katze(),new Katze(),new Katze(),new Katze()});
		int[] zahlen = new int[4];
		zahlen[0] = 4;
		int zahl = zahlen[0];
		System.out.println(zahl);
		int nochMehrZahlen[] = new int[4];
		int vieleZahlen[] = {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < vieleZahlen.length; i++) {
			System.out.println(vieleZahlen[i]);
		}
		for (int zahl2 : vieleZahlen) {
			System.out.println(zahl2);
		}
		int[] garkeineZahlen = {};
		String[] zeichen = new String[24];
		int[][] jahr = new int[12][31];
		int[] januar = new int[31];
		int[] februar = new int[28];
		int[] maerz = new int[31];
		int[] april = new int[30];
		jahr[0] = januar;
		jahr[1] = februar;
		jahr[2] = maerz;
		jahr[3] = april;
		for (int i = 0; i < jahr.length; i++) {
			int[] monat = jahr[i];
			for (int j = 0; j < monat.length; j++) {
				System.out.println("Monat " + (i+1) + ", Tag " + (j+1));
			}
		}
		int[][] jahr2 = {new int[31], new int[28], new int[31], new int[30]};
		int[][] vierMalVier = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
		double[][][] dreiD = {{{5},{2},{4}},{{3},{4},{5}},{{2},{3},{4}},{{5},{6},{3}}};
		Object[] allesDarfRein = new Object[4];
		allesDarfRein[0] = 2;
		allesDarfRein[0] = true;
		allesDarfRein[0] = "String";
		allesDarfRein[0] = 2.0;
		Tier[] tiere = new Tier[5];
		tiere[0] = new Hund();
		tiere[1] = new Katze();
		tiere[1] = null;
		System.out.println(tiere.length);
		machWasMitZahlen(new int[]{1,2,3,4});
		int vierZahlen[] = {1,2,3,4};
		for(int i=0; i<=vierZahlen.length; i++) {
//			System.out.println(vierZahlen[i]*vierZahlen[i]);
		}
		Tier[] hunde = new Hund[5];
		hunde[0] = new Hund();
//		hunde[1] = new Katze(); // java.lang.ArrayStoreException
		
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		System.out.println(alphabet[25]);
		
		String[] monate = {
				  "Januar", "Februar", "März", "April", "Mai", "Juni", 
				  "Juli", "August", "September", "Oktober", "November", "Dezember"
				};
	}
	
	private static void machWasMitKatzen(Katze[] katzes) {
		
	}

	public static void machWasMitZahlen(int[] array) {
		
	}
	
	static class Tier {
		
	}
	
	static class Hund extends Tier {
		
	}
	
	static class Katze extends Tier {
		
	}
}
