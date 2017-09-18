package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss2;

import java.util.logging.Logger;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	
	private static final Logger log = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		Party party = new BigBossParty();
		Firma kartonBossingen = new Firma("Bossingen Karton");
		Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
		party.setLocation(kartonBossingen);
		try {
			party.teilnehmen(new Person("Frau Schmitz", baeckereiSchmitz, 1400.0));
		} catch (NichtReichGenugException e) {
			log.severe(e.getName() + " verdient nicht genug für diese Big-Boss-Party.");
		} catch (NichtEingeladenerTeilnehmerException | BudeVollException e) {
			log.warning("Anderer Fehler aufgetreten.");
		} finally {
			System.out.println("Waren Sie mit dem Service zufrieden?");
		}
	}
}
