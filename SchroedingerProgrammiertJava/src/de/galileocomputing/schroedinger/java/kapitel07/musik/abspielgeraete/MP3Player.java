package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.MP3;
import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class MP3Player extends DigitalesMusikAbspielGeraet {

	@Override
	protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof MP3;
	}

	@Override
	public void einlegen(Tontraeger tontraeger) {
		
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Was soll das heißen, \"Kann Datei '" + tontraeger.getTitel() + ".mp3' nicht finden\"?");
	}
	
	@Override
	public MP3 auswerfen() {
		return (MP3) super.auswerfen();
	}

}
