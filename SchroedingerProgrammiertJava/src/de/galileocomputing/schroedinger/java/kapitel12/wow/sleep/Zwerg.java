package de.galileocomputing.schroedinger.java.kapitel12.wow.sleep;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Zwerg extends Held {

	public Zwerg(String name) {
		super(name);
	}

	@Override
	public void aufInDenKampf(Held held) {
		System.out.printf("%s: \"Auuuuufstääääähnnnn!!!!\"%n", held.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException exception) {
		}
		System.out.printf("%s (etwas verspätet): \"Gäääähn, uff, guten Morgen, jaja ich komme schon.\"%n", this.getName());
	}

}
