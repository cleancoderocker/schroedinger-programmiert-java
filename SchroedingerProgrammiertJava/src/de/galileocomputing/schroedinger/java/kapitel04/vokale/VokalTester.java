package de.galileocomputing.schroedinger.java.kapitel04.vokale;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class VokalTester {
	public static void main(String[] args) {
		String zeichenkette = "Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu";
		System.out.println(zeichenkette);
		zeichenkette = zeichenkette.toLowerCase();
		for (int i = 0; i < zeichenkette.length(); i++) {
			char zeichen = zeichenkette.charAt(i);
			switch(zeichen) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				System.out.print("-");
				break;
			default:
				System.out.print(".");
			}
		}
	}
}
