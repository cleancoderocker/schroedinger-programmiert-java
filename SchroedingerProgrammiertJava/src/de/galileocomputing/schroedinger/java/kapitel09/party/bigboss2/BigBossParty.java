package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss2;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class BigBossParty implements Party {

	private static final Logger log = Logger.getLogger(BigBossParty.class.getName());
	
	private Location location;
	
	static {
		try {
			Handler handler = new FileHandler("BigBossParty.log");
			log.addHandler(handler);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void teilnehmen(Person person) throws NichtEingeladenerTeilnehmerException, BudeVollException {
		log.info("Teilnehmer: " + person.getName());
		if(!person.getArbeitetBei().equals(this.getLocation())) {
			throw new NichtEingeladenerTeilnehmerException(person.getName());
		} else if(person.getGehalt() < 40000.0) {
			log.warning(person.getName() + " verdient nicht genug für diese Big Boss Party.");
			throw new NichtReichGenugException(person.getName());
		}
		log.info("Teilnehmer: " + person.getName());
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

}
