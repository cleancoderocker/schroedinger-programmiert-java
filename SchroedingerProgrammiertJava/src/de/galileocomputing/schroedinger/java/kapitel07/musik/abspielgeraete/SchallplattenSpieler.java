package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Schallplatte;
import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchallplattenSpieler extends AnalogesMusikAbspielGeraet {

	@Override
	protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof Schallplatte;
	}
	
	@Override
	public void einlegen(Tontraeger tontraeger) {
		System.out.println("Tee zubereiten, ganz gemütlich die Schallplatte aus der Hülle nehmen, laaaangsam auflegen und vorsichtig mit dem Tonabnehmer sein.");
	}

	@Override
	public Schallplatte auswerfen() {
		return (Schallplatte) super.auswerfen();
	}

}
