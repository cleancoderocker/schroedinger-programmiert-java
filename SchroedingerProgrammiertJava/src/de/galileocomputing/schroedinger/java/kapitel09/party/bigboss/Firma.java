package de.galileocomputing.schroedinger.java.kapitel09.party.bigboss;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Firma implements Location {

	private String name;
	
	public Firma(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object object) {
		if(object instanceof Firma) {
			Firma firma2 = (Firma) object;
			return this.getName().equals(firma2.getName());
		}
		return false;
	}

	public String getName() {
		return name;
	}
	
	
}
