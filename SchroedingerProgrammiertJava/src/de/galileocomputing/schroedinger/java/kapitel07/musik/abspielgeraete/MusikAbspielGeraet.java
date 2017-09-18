package de.galileocomputing.schroedinger.java.kapitel07.musik.abspielgeraete;

import de.galileocomputing.schroedinger.java.kapitel07.musik.tontraeger.Tontraeger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class MusikAbspielGeraet {
	
	private Tontraeger tontraeger;
	
	protected abstract boolean unterstuetztTontraeger(Tontraeger tontraeger);
	
	protected abstract void einlegen(Tontraeger tontraeger);
	
	protected abstract void abspielen(Tontraeger tontraeger);
	
	public final void hoeren(Tontraeger tontraeger) {
		if(this.unterstuetztTontraeger(tontraeger)) {
			this.tontraeger = tontraeger;
			this.einlegen(this.tontraeger);
			this.abspielen(this.tontraeger);
		} else {
			System.err.println(this.getClass().getSimpleName() + " unterstützt " + tontraeger.getClass().getSimpleName() + " nicht.");
		}
	}
	
	public Tontraeger auswerfen() {
		Tontraeger tontraeger = this.tontraeger;
		this.tontraeger = null;
		return tontraeger;
	}
	
}
