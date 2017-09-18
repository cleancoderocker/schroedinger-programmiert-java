package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class WoerterRaetsel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String eingabe = "Iss";
		System.out.println(eingabe);
		eingabe = "E".concat(eingabe.substring(0,2).toLowerCase());
		System.out.println(eingabe);
		eingabe = "H" + eingabe.toLowerCase() + "s";
		System.out.println(eingabe);
		eingabe = eingabe + "er";
		System.out.println(eingabe);
		eingabe = "Hosensc" + eingabe.toLowerCase().replaceAll("s", "*");
		System.out.println(eingabe);
		eingabe = eingabe.substring(0, 8) + "litz";
		System.out.println(eingabe);
		eingabe = eingabe.replace("o", "a").replace("nschl", " Fr");
		System.out.println(eingabe);
	}

}
