package de.galileocomputing.schroedinger.java.kapitel12.wow.starvation;

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
		System.out.printf("%s: \"Mach schon, mach schon!\"%n", this.getName());
		synchronized (toilette) {
			System.out.printf("%s: \"Aaaaaaaahhhh, das wurde auch Zeit!\"%n", this.getName());
			while (!this.isFertig()) {
				try {
					Thread.sleep(500);
					System.out.printf("%s: \"Zzzzzzzz!\"%n", this.getName());
				} catch (InterruptedException exception) {
				}
			}
		}
	}
	protected boolean isFertig() {
		return false;
	}
}
