package de.galileocomputing.schroedinger.java.kapitel12.wow.wait;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public abstract class Held {
	private String name;

	public Held(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void malGehen(Toilette toilette) {
		System.out.printf("%s: \"Ich als Erster, ich als Erster!\"%n", this.getName());
		synchronized (toilette) {
			System.out.printf("%s: \"Aaaaaaaahhhh, das wurde auch Zeit!\"%n", this.getName());
		}
	}
	protected boolean isFertig() {
		return false;
	}
}
