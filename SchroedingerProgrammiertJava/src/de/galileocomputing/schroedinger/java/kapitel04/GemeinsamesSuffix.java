package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GemeinsamesSuffix {
	public static void main(String[] args) {
		String s1 = "Tischlerei";
		String s2 = "Fischerei";
		String gemeinsamesSuffix = "";
		for (int i = s1.length()-1; i >= 0; i--) {
			String teilString = s1.substring(i);
			if(s2.endsWith(teilString)) {
				gemeinsamesSuffix = teilString;
			} else {
				break;
			}
		}
		System.out.println(gemeinsamesSuffix);
	}
}
