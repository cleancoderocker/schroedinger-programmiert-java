package de.galileocomputing.schroedinger.java.kapitel03.kalender;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Kalender {
	public static void main(String[] args) {
		int monat = 6;
		int startTag = 2;
		// wenn Eingabe ein erlaubter Monat ist und der Starttag ein erlaubter Starttag ist
		if(monat >= 0 && monat <= 11 && startTag >= 0 && startTag <= 6) {
			// bestimme die Anzahl der Tage in diesem Monat
			int tage;
			switch(monat) {
			// Ist es ein Monat mit 31 Tagen?
			case 0: case 2: case 4: case 6: case 7: case 8: case 11:
				tage = 31;
				break;
			// Ist es der Februar?
			case 1: 
				tage = 28;
				break;
			// Ist es ein Monat mit 30 Tagen?
			default: 
				tage = 30;
			}
			System.out.println("|MO|DI|MI|DO|FR|SA|SO|");
			int wochen = (tage + startTag) > 35 ? 6 : 5;
			// für alle Wochen
			for(int woche=1; woche<=wochen; woche++) {
				// gebe die Woche aus
				// für alle Tage
				for(int tag=1; tag<=7; tag++) {
					// gebe den Tag aus
					int datum = tag+(woche-1)*7-startTag;
					if(datum > 0 && datum <= tage) {
						System.out.print("|" + ((datum < 10) ? " " : "") + datum);
					} else {
						System.out.print("|  ");
					}
				}
				System.out.println("|");
			}
		}
	}
}
