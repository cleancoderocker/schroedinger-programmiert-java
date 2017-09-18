package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class ZahlenSpielereienMitWrapperKlassen {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer zahl = new Integer(5);
		zahl = Integer.valueOf(5);
		zahl = Integer.valueOf("5");
		zahl = 5;
		int andereZahl = zahl;
		andereZahl = zahl.intValue();
		andereZahl = Integer.parseInt("5");
		System.out.println(zahl);
		Byte b = new Byte((byte) -128);
		Byte b2 = new Byte((byte) 128); // Hier wird 128 auf ein byte gecastet, da 128 aber nicht in den byte-Wertebereich passt, wird durch den Cast etwas von dem Wert abgeschnitten.
		Short s = new Short((short) 6000);
		Integer i = new Integer(23456);
//		Long l = new Long(23456782345678);
		Long l = new Long(23456782345678L);
		Double d = new Double(4.0);
		Float f = new Float(4.0);
		Float f2 = new Float(4.0F);
		Double d2 = new Double(4.0D);
		Integer keinWert;
	}
}
