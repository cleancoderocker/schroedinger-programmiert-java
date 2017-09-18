package de.galileocomputing.schroedinger.java.kapitel12.wow.join;

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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%s: (etwas verspätet): \"Gäääähn, uff, guten Morgen, ich komme, ich komme.\"%n", this.getName());
	}

}
