package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class DigitalesMusikAbspielGeraet extends MusikAbspielGeraet {
	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Lass mich raten, das soll " + tontraeger.getTitel() + " sein. Ist aber ziemlich stark komprimiert, oder?");
	}
}
