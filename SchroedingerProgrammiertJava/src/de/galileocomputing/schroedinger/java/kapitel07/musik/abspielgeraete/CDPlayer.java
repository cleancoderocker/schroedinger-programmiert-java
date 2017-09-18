package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.CD;
import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class CDPlayer extends DigitalesMusikAbspielGeraet {

	@Override
	protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof CD;
	}

	@Override
	public void einlegen(Tontraeger tontraeger) {
		System.out.println("Aufmachen. Einlegen. Zumach... Ah... Falsch eingelegt. Schnell nochmal auf. Richtig einlegen. Zumachen.");
	}
	
	@Override
	public CD auswerfen() {
		return (CD) super.auswerfen();
	}

}
