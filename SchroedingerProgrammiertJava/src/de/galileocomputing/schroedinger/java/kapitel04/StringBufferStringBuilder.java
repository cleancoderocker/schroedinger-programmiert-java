package de.galileocomputing.schroedinger.java.kapitel04;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StringBufferStringBuilder {
	public static void main(String[] args) {
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("String");
//		stringBuilder.append("-");
//		stringBuilder.append("Bilder");
//		stringBuilder.insert(8, "u");
//		System.out.println(stringBuilder);
		
		int anzahl = 5;
		String s = "Yippie ";
		StringBuilder stringBuilder = new StringBuilder(s.length() * anzahl);
		for(int i=0; i<anzahl; i++) {
			stringBuilder.append(s);
		}
		System.out.println(stringBuilder);
		StringBuilder sb = new StringBuilder("Zu viiel");
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		StringBuilder textMitStringBuilder = new StringBuilder(1377);
		for(int i=1; i<=99; i++) {
		  textMitStringBuilder.append("Luftballon " + i + "\n");
		}
		System.out.println(textMitStringBuilder.toString());

	}
}
