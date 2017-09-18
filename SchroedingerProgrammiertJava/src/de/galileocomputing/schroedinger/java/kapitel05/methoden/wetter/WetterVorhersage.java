package de.galileocomputing.schroedinger.java.kapitel05.methoden.wetter;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class WetterVorhersage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String wetterVorhersage = sageWetterVoraus(9, "Deutschland");
		System.out.println(wetterVorhersage);
	}

	private static String sageWetterVoraus(int monat, String land) {
		if("Deutschland".equals(land)) {
			return "Absolut nicht vorhersehbar.";
		} else if(monat >= 5 && monat <= 9) {
			return "Wahrscheinlich ganz gut.";
		}
		return "Regen mit Graupel.";
	}
	
	@SuppressWarnings("unused")
	private static String sageWetterVorausNachRefactoring(int monat, String land) {
		String vorhersage = "Regen mit Graupel.";
		if("Deutschland".equals(land)) {
			vorhersage = "Absolut nicht vorhersehbar.";
		} else if(monat >= 5 && monat <= 9) {
			vorhersage = "Wahrscheinlich ganz gut.";
		}
		return vorhersage;
	}

}
