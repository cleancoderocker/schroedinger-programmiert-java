package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class BigBossParty implements Party {

	private Location location;
	
	@Override
	public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException {
		if(!person.getArbeitetBei().equals(this.getLocation())) {
			throw new NichtEingeladenerTeilnehmerException(person.getName());
		} else if(person.getGehalt() < 40000.0) {
			throw new NichtReichGenugException(person.getName());
		} else {
			System.out.println("Willkommen " + person.getName());
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
