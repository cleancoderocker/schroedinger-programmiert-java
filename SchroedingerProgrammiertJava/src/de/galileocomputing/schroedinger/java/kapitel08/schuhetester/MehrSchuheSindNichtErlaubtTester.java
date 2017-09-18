package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class MehrSchuheSindNichtErlaubtTester extends SchuhTesterMitMap {

	private int maximum;
	
	public MehrSchuheSindNichtErlaubtTester(Collection<SchuhPaar> schuhKollektion, 
			Map<SchuhPaar, Integer> schuhMappe, int maximum) {
		super(schuhKollektion, schuhMappe);
		this.maximum = maximum;
	}

	@Override
	public void addSchuhPaar(SchuhPaar schuhe) {
		if(super.soVieleHastDuSchon(schuhe) < this.maximum) {
			super.addSchuhPaar(schuhe);			
		} else {
			System.err.println("Du hast schon " + this.maximum + " solcher Schuhe.");
		}
	}

}
