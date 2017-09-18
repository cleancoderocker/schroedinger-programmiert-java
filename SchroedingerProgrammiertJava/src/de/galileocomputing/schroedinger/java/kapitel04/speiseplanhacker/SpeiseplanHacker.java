package de.galileocomputing.schroedinger.java.kapitel04.speiseplanhacker;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class SpeiseplanHacker {
	public static void main(String[] args) {
		 String speise = args[0];
		// String speise =
		// "Heute gibts Hamburger nicht und auch nicht Pommes, sondern was ganz anderes extra für Dich";
		// String speise = "Dinkel mit Salat";
//		String speise = "Dinkelpfannekuchen";
		if (speise != null && speise.startsWith("Dinkel")) {
			if ("Dinkelpfannekuchen".equals(speise)) {
				speise = "Hamburger";
			} else {
				speise = speise.substring("Dinkel".length());
				speise = "Hamburger" + speise;
			}
		}
		if (speise != null && speise.contains("Salat")) {
			speise = speise.replaceAll("Salat", "Pommes");
		}
		System.out.println("Heute gibts " + speise);
	}
}
