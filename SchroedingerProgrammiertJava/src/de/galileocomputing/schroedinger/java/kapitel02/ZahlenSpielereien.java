package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class ZahlenSpielereien {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b = -128;
//		byte b2 = 128;
		short s = 6000;
		int i = 23456;
//		int i = 23456782345678; // Compiler-Fehler, weil ints so große Zahlen nicht darstellen können
//		long l = 23456782345678; // Compiler-Fehler, weil ohne 'l' oder 'L' ist das ein int, und ints können nicht so große Zahlen darstellen
		long l = 23456782345678L;
		System.out.println(20000); // das hier ist ein int
		System.out.println(20000L); // das hier ist ein long
		double d = 4.0;
//		float f = 4.0; // Compiler-Fehler, weil ohne 'f' oder 'F' ist das ein double
		float f = 4.0F;
		float s2 = 4.2424_4234_3242F;
		s2--;
		System.out.println(s2);
		double d2 = 4.0D;
		long nummerOhneUnterstriche = 2345234523452345L;
		long nummerMitUnterstrichen = 2345_2345_2345_2345L;
		double f2 = 2.2;
		
//		short einShort = 2343434;
//		long einLong = 1234_5678_5678;
		int einInt = 2244_________2424;
		double einDouble = 2D;
//		double nochEinDouble = 2.0_0_D;
		float einFloat = 2.00000000F;
		float nochEinFloat = 02.0F;
		
		int oktalZahl = 0555;
		int binaerZahl = 0B101101101;
		int dezimalZahl = 365;
		int hexZahl = 0X16D;
		System.out.println(oktalZahl);
		System.out.println(binaerZahl);
		System.out.println(dezimalZahl);
		System.out.println(hexZahl);
		
		int a1 = 0b10110011100100101111;
		int a2 = 02634457;
		int a3 = 735535;
		int a4 = 0xB392F;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println(030);
		System.out.println(0B00011000);
		System.out.println(24);
		System.out.println(0X18);
	}
}
