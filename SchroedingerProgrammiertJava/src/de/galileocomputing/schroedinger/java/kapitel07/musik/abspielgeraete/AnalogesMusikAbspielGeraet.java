package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class AnalogesMusikAbspielGeraet extends MusikAbspielGeraet {
	@Override
	public void abspielen(Tontraeger tontraeger) {
		System.out.println("Oh, " + tontraeger.getTitel() + ", und dann auch noch analog, das klingt gut!");
	}
}
