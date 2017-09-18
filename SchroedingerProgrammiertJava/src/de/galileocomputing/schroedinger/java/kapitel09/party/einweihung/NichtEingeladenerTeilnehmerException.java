package de.galileocomputing.schroedinger.java.kapitel09.party.einweihung;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class NichtEingeladenerTeilnehmerException extends Exception {

	private static final long serialVersionUID = -2327640370463076096L;

	public NichtEingeladenerTeilnehmerException() {
		super("Teilnehmer nicht eingeladen");
	}
}
