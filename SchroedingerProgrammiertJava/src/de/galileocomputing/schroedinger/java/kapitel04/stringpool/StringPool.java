package de.galileocomputing.schroedinger.java.kapitel04.stringpool;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringPool {
	
	public static void main(String[] args) {
		String schachFigur = "Läufer";
		String teppich = new String("Läufer");
		String jemandDerVielLaeuft = teppich.intern();
		System.out.println(schachFigur == teppich);
		System.out.println(schachFigur == jemandDerVielLaeuft);
		System.out.println(teppich == jemandDerVielLaeuft);	
	}

}
