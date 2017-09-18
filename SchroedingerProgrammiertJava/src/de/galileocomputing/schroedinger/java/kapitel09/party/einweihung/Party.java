package de.galileocomputing.schroedinger.java.kapitel09.party.einweihung;

/**
 * 
 * @author Philip Ackermann
 *
 */
public interface Party {
	
	void setLocation(Location location);
	
	void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException;
}
