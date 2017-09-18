package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Person {
	
	private Katze katze;
	
	private Wohnung wohnung;
	
	public void setKatze(Katze katze) {
		this.katze = katze;
	}
	
	public void setWohnung(Wohnung wohnung) {
		this.wohnung = wohnung;
	}

	public Wohnung getWohnung() {
		return wohnung;
	}
	
	public void haushaltMachen() {
		this.getWohnung().putzen();
		this.haustierFuettern();
	}
	
	private void haustierFuettern() {
		if(this.katze != null) {
			this.katze.fuettern();
		}
	}
}
