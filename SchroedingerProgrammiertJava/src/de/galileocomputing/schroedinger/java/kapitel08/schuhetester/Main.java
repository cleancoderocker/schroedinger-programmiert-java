package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
//		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitArray();
		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new ArrayList<SchuhPaar>());
//		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new HashSet<SchuhPaar>());
//		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new TreeSet<SchuhPaar>());
//		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitMap(new HashMap<SchuhPaar, Integer>());
//		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new LinkedList<SchuhPaar>());
//		SolcheSchuheHastDuSchonTester tester = new SchuhTesterMitCollection(new Stack<SchuhPaar>());
		SchuhPaar schuhPaar = new SchuhPaar(39, "schwarz", true);
		SchuhPaar schuhPaar2 = new SchuhPaar(39, "lila", false);
		SchuhPaar schuhPaar3 = new SchuhPaar(39, "gelb", true);
		SchuhPaar schuhPaar4 = new SchuhPaar(39, "blau", false);
		tester.addSchuhPaar(schuhPaar);
		tester.addSchuhPaar(schuhPaar2);
		tester.addSchuhPaar(schuhPaar3);
		tester.addSchuhPaar(schuhPaar4);
		for (SchuhPaar schuheAusKollektion : tester.getSchuhKollektion()) {
			System.out.println(schuheAusKollektion);
		}
		tester.addSchuhPaar(new SchuhPaar(38, "blau", true));
		tester.addSchuhPaar(new SchuhPaar(38, "gelb", true));
		tester.addSchuhPaar(new SchuhPaar(38, "gelb", false));
		tester.addSchuhPaar(new SchuhPaar(38, "gelb", true));
		tester.addSchuhPaar(new SchuhPaar(38, "blau", true));
		tester.addSchuhPaar(new SchuhPaar(38, "grün", true));
		tester.addSchuhPaar(new SchuhPaar(38, "grün", false));
		tester.addSchuhPaar(new SchuhPaar(40, "blau", true));
		tester.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
		tester.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
		tester.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
		tester.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
		SchuhPaar gleichesSchuhPaar = new SchuhPaar(39, "schwarz", true);
		List<SchuhPaar> sortierteSchuhKollektion = new ArrayList<SchuhPaar>(tester.getSchuhKollektion());
		for (SchuhPaar schuheAusKollektion : sortierteSchuhKollektion) {
			System.out.println(schuheAusKollektion);
		}
        SovieleSchuheHastDuSchonTester testerMitAnzahl = new SchuhTesterMitMap(new ArrayList<SchuhPaar>(), new HashMap<SchuhPaar, Integer>());
        testerMitAnzahl.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
        testerMitAnzahl.addSchuhPaar(new SchuhPaar(39, "schwarz", true));
        StringBuilder meldung = new StringBuilder();
        meldung.append(testerMitAnzahl.hastDuSchon(gleichesSchuhPaar) ? gleichesSchuhPaar + " hast du schon" : gleichesSchuhPaar + " hast du noch nicht");
        meldung.append(", und zwar schon " + testerMitAnzahl.soVieleHastDuSchon(new SchuhPaar(39, "schwarz", true)) + " Stück");
        System.out.println(meldung.toString());
	}
}
