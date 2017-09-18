package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		try {
			partyStarten();
		} catch (NichtEingeladeneTeilnehmerException e) {
			System.out.println(e.getNamen());
		}
//		partyStarten2();
	}

	private static void partyStarten() throws NichtEingeladeneTeilnehmerException {
		Party party = new BigBossParty();
		Firma kartonBossingen = new Firma("Bossingen Karton");
		Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
		Firma firmaReichenhausen = new Firma("Reichenhausen");
		party.setLocation(kartonBossingen);
		List<Person> personen = new ArrayList<>();
		personen.add(new Person("Frau Schmitz", baeckereiSchmitz, 1400.0));
		personen.add(new Person("Herr von Reichenhausen", firmaReichenhausen, 50000.0));
		List<String> namen = new ArrayList<>();
		for (Person person : personen) {
			try {
				party.teilnehmen(person);
			} catch (NichtEingeladenerTeilnehmerException e) {
				namen.add(person.getName());
			}
		}
		if(!namen.isEmpty()) {
			throw new NichtEingeladeneTeilnehmerException(namen);
		}
	}
	
	@SuppressWarnings("unused")
	private static void partyStarten2() {
		Party party = new BigBossParty();
		Firma kartonBossingen = new Firma("Bossingen Karton");
		Firma baeckereiSchmitz = new Firma("Bäckerei Schmitz");
		Firma firmaReichenhausen = new Firma("Reichenhausen");
		party.setLocation(kartonBossingen);
		List<Person> personen = new ArrayList<>();
		personen.add(new Person("Frau Schmitz", baeckereiSchmitz, 1400.0));
		personen.add(new Person("Herr von Reichenhausen", firmaReichenhausen, 50000.0));
		for (Person person : personen) {
			try {
				party.teilnehmen(person);
			} catch (NichtEingeladenerTeilnehmerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
