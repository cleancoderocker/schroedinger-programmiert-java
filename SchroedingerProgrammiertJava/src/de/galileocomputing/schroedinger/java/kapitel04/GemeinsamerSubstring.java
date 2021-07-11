package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GemeinsamerSubstring {
	public static void main(String[] args) {
		String s1 = "Tischlerei";
		String s2 = "Fische";
		String gemeinsamerSubstring = "";
		
		// Hier wird i für die Intervalle (Ausschnittgröße) verwendet
		// j und j+i+1 (j+i) sind dann die Koordinaten des Ausschnitts
		for (int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s1.length() - i; j++) {
				String teilString = s1.substring(j, j+i);
				if(s2.contains(teilString)) {
					gemeinsamerSubstring = teilString;
				}
				System.out.println(teilString);
			}
		}
		System.out.println(gemeinsamerSubstring);
		
		// Eine Variante des Programms, die eventuell besser für die Anfänger 
		// zu verstehen ist, wenn wir i für den Anfang des Ausschnitts und j für das Ende des 
		// Ausschnittes verwenden
		// der Nachteil: die Ausschnitte sind mal größer mal kleiner, s.d. wir den bisher größten gemeinsamen Substring
		// zwischenspeichern müssen
		gemeinsamerSubstring = "";
        	for (int i = 0; i < s1.length(); i++) {
            		for (int j = i; j < s1.length(); j++) {
				String teilString = s1.substring(i, j+1);
				if (s2.contains(teilString)) {
				    // wenn der aktuelle  Substring länger als die bisherigen ist
				    if(teilString.length() > gemeinsamerSubstring.length()) {
					gemeinsamerSubstring = teilString;
				    }
				}
            		}
        	}
                System.out.println(gemeinsamerSubstring);
	}
}


