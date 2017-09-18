package de.galileocomputing.schroedinger.java.kapitel12.wow.join;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Nachtelf extends Held {
	public Nachtelf(String name) {
		super(name);
	}

	@Override
	public void aufInDenKampf(Held held) {
		System.out.printf("%s: \"Auf geht's! In den Kampf!\"%n", this.getName());
	}
}
