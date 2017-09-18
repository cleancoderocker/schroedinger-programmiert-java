package de.galileocomputing.schroedinger.java.kapitel04.stringpool;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringPool3 {
	public static void main(String[] args) {
		String schachFigur = "Läufer";
		String jemandDerVielLaeuft = "Läufer";
		System.out.println(schachFigur == jemandDerVielLaeuft);
		schachFigur.replace("Läufer", "König");
		System.out.println(schachFigur);
		System.out.println(jemandDerVielLaeuft);
		System.out.println(schachFigur == jemandDerVielLaeuft);
		schachFigur = schachFigur.replace("Läufer", "König");
		System.out.println(schachFigur);
		System.out.println(schachFigur == jemandDerVielLaeuft);
	}
}
