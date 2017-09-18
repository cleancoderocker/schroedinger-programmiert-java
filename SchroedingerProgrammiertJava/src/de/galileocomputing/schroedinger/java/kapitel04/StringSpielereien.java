package de.galileocomputing.schroedinger.java.kapitel04;

import java.util.Arrays;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringSpielereien {
	public static void main(String[] args) {
		String beispiel = new String("Beispiel");
		String nochEinBeispiel = "Beispiel";
		char[] buchstaben = {'B', 'e', 'i', 's', 'p', 'i', 'e', 'l'};
		String nochEinAnderesBeispiel = new String(buchstaben);
		String undNochEinAnderesBeispiel = "Bei" + "spiel";
		String lautesBeispiel = "BEISPIEL";
		System.out.println(nochEinBeispiel == beispiel); // false
		System.out.println(nochEinBeispiel == nochEinAnderesBeispiel); // false
		System.out.println(nochEinBeispiel == undNochEinAnderesBeispiel); // true
		System.out.println(nochEinBeispiel == lautesBeispiel); // false
		System.out.println(nochEinAnderesBeispiel == undNochEinAnderesBeispiel); // false
		System.out.println(nochEinBeispiel.equals(beispiel)); // true
		System.out.println(nochEinBeispiel.equals(nochEinAnderesBeispiel)); // true
		System.out.println(nochEinBeispiel.equals(undNochEinAnderesBeispiel)); // true
		System.out.println(nochEinBeispiel.equals(lautesBeispiel)); // false
		System.out.println(nochEinBeispiel.equalsIgnoreCase(lautesBeispiel)); // true
		System.out.println(nochEinAnderesBeispiel.equals(undNochEinAnderesBeispiel)); // true
		
		System.out.println(12 + "12"); // 1212
		System.out.println("12" + 12); // 1212
		System.out.println(12 + (12 + "12")); // 121212
		System.out.println(12 + 12 + "12"); // 2412
		System.out.println("12" + 12 + 12 + "12"); // 12121212
//		System.out.println("0" + 7 - 7 + "7"); // Compiler Fehler
		System.out.println("0" + (7 - 7) + "7"); // 007
		
		System.out.println("Hexen".concat("meister"));
		System.out.println("Käsekuchen".indexOf('e'));
		System.out.println("Käsekuchen".indexOf("kuchen"));
		System.out.println("Käsekuchen".indexOf('e', 4));
		System.out.println("Käsekuchen".lastIndexOf('e'));
		System.out.println("Käsekuchen".lastIndexOf("kuchen"));
		System.out.println("Käsekuchen".lastIndexOf('e', 4));
		System.out.println("Käsekuchen".contains("kuchen"));
		System.out.println("Käsekuchen".contains("kalorien"));
		
		String speise = "Dinkelpfannekuchen";
		System.out.println(speise.charAt(0));
		System.out.println(speise.substring(6, 12));
		System.out.println(speise.substring(12));
		
		String name = "Schleimiger Riesenschneckendrachen";
		System.out.println(name.substring(18));
		System.out.println(name.substring(18, 26));
		String frucht = "Ananas";
		String[] scheibchen = frucht.split("a");
		System.out.println(Arrays.toString(scheibchen));
		
		int flaschenImKasten = 20;
		int flaschenImBauch = 5;
		System.out.println(flaschenImKasten + "-" + flaschenImBauch + " ist " + (flaschenImKasten - flaschenImBauch));
	}
}