package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss;

import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class NichtEingeladeneTeilnehmerException extends Exception {
	private static final long serialVersionUID = -9147043827916533588L;

	private List<String> namen;
	
	public NichtEingeladeneTeilnehmerException(List<String> namen) {
		this.namen = namen;
	}
	
	public List<String> getNamen() {
		return this.namen;
	}
}
