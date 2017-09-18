package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Kassette;
import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class KassettenRekorder extends AnalogesMusikAbspielGeraet {

	@Override
	protected boolean unterstuetztTontraeger(Tontraeger tontraeger) {
		return tontraeger instanceof Kassette;
	}
	
	@Override
	public void einlegen(Tontraeger tontraeger) {
		System.out.println("Aufmachen. Einlegen. Zumachen.");
	}
	
	@Override
	public void abspielen(Tontraeger tontraeger) {
		super.abspielen(tontraeger);
		System.out.println("Och nö, Werbung, Driss Radiomitschnitte!");
	}
	
	@Override
	public Kassette auswerfen() {
		return (Kassette) super.auswerfen();
	}

}
