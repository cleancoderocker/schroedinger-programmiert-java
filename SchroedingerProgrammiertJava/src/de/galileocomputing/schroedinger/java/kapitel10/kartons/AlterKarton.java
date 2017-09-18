package de.galileocomputing.schroedinger.java.kapitel10.kartons;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class AlterKarton {
	private Object inhalt;
	
	public AlterKarton(Object inhalt) {
		this.inhalt = inhalt;
	}

	public Object getInhalt() {
		return inhalt;
	}

	public void setInhalt(Object inhalt) {
		this.inhalt = inhalt;
	}
	
}
