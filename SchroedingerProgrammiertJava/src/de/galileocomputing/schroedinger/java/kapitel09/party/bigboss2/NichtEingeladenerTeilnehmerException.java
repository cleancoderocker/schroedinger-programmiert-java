package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss2;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class NichtEingeladenerTeilnehmerException extends Exception {
	private static final long serialVersionUID = -7404615627478049304L;

	private String name;
	
	public NichtEingeladenerTeilnehmerException(String name) {
		super("Teilnehmer nicht eingeladen");
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
