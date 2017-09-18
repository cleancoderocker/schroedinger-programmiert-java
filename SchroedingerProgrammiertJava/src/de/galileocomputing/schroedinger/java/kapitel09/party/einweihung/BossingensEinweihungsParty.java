package de.galileocomputing.schroedinger.java.kapitel09.party.einweihung;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class BossingensEinweihungsParty implements Party {

	private Location location;
	
	@Override
	public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException {
		if(!person.getArbeitetBei().equals(this.getLocation())) {
			throw new NichtEingeladenerTeilnehmerException();
		}
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

}
