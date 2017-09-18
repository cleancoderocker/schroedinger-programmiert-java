package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GemeinsamerSubstring {
	public static void main(String[] args) {
		String s1 = "Tischlerei";
		String s2 = "Fische";
		String gemeinsamerSubstring = "";
		for (int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s1.length() - i; j++) {
				String teilString = s1.substring(j, j+i);
				if(s2.contains(teilString)) {
					gemeinsamerSubstring = teilString;
				}
				System.out.println(teilString);
			}
		}
		System.out.println(gemeinsamerSubstring);
	}
}
