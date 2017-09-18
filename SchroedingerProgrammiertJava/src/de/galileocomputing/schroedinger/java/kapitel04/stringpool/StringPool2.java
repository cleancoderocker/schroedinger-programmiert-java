package de.galileocomputing.schroedinger.java.kapitel04.stringpool;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringPool2 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String schachFigur = new String("Läufer");
		String teppich = "Läufer";
		String jemandDerVielLaeuft = schachFigur.intern();
		System.out.println(schachFigur == jemandDerVielLaeuft);
		schachFigur = schachFigur.replace("Läufer", "König").intern();
		System.out.println(schachFigur == jemandDerVielLaeuft);
		String herrscher = "König";
		System.out.println(schachFigur == herrscher);
	}

}
