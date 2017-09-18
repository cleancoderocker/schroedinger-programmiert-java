package de.galileocomputing.schroedinger.java.kapitel12.wow.livelock;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public abstract class Held {
	private String name;
	
	private boolean isDurstig;

	public Held(String name) {
		this.name = name;
		this.isDurstig = true;
	}

	public String getName() {
		return name;
	}

	public boolean isDurstig() {
		return isDurstig;
	}

	public void trinken(Bier bier, Held trinkPartner) {
		while (this.isDurstig()) {
			if (bier.getBesitzer() != this) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
				}
			} else if (trinkPartner.isDurstig()) {
				System.out.printf("%s: \"Trink du mal zuerst, mein Freund!\"%n", name);
				bier.setBesitzer(trinkPartner);
			} else {
				bier.trinken();
				this.isDurstig = false;
				System.out.printf("%s: \"Das war lecker!\"%n", name);
				bier.setBesitzer(trinkPartner);
			}
		}
	}
}
