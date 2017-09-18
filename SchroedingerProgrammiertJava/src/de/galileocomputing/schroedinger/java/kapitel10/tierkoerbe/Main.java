package de.galileocomputing.schroedinger.java.kapitel10.tierkoerbe;


/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Korb<Katze> katzenKorb = new Korb<>();
		katzenKorb.setBewohner(new Katze());
		Korb<Hund> hundeKorb = new Korb<>();
		hundeKorb.setBewohner(new Hund());
		KatzenKorb katzenKorb2 = new KatzenKorb();
		katzenKorb2.setBewohner(new Katze());
		HundeKorb hundeKorb2 = new HundeKorb();
		hundeKorb2.setBewohner(new Hund());
	}
	
}
