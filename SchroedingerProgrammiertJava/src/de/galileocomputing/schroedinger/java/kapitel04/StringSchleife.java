package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringSchleife {
	public static void main(String[] args) {
		String text = "";
		for(int i=1; i<=99; i++) {
			text += "Luftballon " + i + "\n";
		}
		System.out.println(text);
		
		StringBuilder textMitStringBuilder = new StringBuilder(800);
		for(int i=1; i<=99; i++) {
			textMitStringBuilder.append("Luftballon " + i + "\n");
		}
		System.out.println(textMitStringBuilder);
	}
}
