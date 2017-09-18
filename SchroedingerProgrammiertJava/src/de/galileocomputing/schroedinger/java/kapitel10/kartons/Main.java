package de.galileocomputing.schroedinger.java.kapitel10.kartons;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		SchuhPaar schuhe = new SchuhPaar(38, "Schwarz", true);
		AlterKarton alterKarton = new AlterKarton(schuhe);
		Object inhalt = alterKarton.getInhalt();
		if(inhalt instanceof SchuhPaar) {
			SchuhPaar schuheAusKarton = (SchuhPaar) inhalt;
			System.out.println(schuheAusKarton.getFarbe());
		}
		Karton<SchuhPaar> karton = new Karton<>(schuhe);
		System.out.println(karton.getInhalt().getFarbe());
	}
}
