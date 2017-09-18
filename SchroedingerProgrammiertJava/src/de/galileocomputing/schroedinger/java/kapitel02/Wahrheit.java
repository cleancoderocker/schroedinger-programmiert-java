package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Wahrheit {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int alter = 18;
		boolean volljaehrig = alter >= 18;

		int uhrzeit = 14;
		boolean mussArbeiten = uhrzeit >= 9 && uhrzeit <= 18;
		
		int geldDabei = 50;
		int schuhpreis = 20;
		boolean mussMeinerFreundinNeueShuheKaufen = geldDabei > schuhpreis;
		
		int anzahlBierImKuehlschrank = 4;
		boolean neuesBierKaufen = anzahlBierImKuehlschrank <= 2;
		
		boolean istFeiertag = true;
		boolean istWochenende = true;
		boolean findsPrima = istFeiertag && !istWochenende;
		findsPrima = istFeiertag ^ istWochenende;
		
		boolean karteDabei = true;
		int kontostand = 200;
		mussMeinerFreundinNeueShuheKaufen = geldDabei > schuhpreis || (karteDabei && kontostand > schuhpreis);
	}
}
