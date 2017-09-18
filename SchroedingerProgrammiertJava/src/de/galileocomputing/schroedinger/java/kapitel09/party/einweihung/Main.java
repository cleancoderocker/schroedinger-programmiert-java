package de.galileocomputing.schroedinger.java.kapitel09.party.einweihung;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Party party = new BossingensEinweihungsParty();
		Firma kartonBossingen = new Firma("Bossingen Karton");
		Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
		party.setLocation(kartonBossingen);
		try {
			party.teilnehmen(new Person(baeckereiSchmitz));
		} catch (NichtEingeladenerTeilnehmerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
