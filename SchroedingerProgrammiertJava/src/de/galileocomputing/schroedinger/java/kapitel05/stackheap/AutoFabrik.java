package de.galileocomputing.schroedinger.java.kapitel05.stackheap;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class AutoFabrik {

	@SuppressWarnings("unused")
	private int anzahlMitarbeiter = 500;
	@SuppressWarnings("unused")
	private Person leiter = new Person();

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AutoFabrik autoFabrik = new AutoFabrik();
		Auto auto = autoFabrik.erstelleAuto("blau");
	}

	public Auto erstelleAuto(String farbe) {
		int id = 4711;
		Auto auto = new Auto(id);
		this.maleAutoAn(auto, farbe);
		return auto;
	}

	private void maleAutoAn(Auto auto, String farbe) {
		this.mischeFarbeAn(farbe);
		auto.setFarbe(farbe);
	}

	private void mischeFarbeAn(String farbe) {
		this.bereiteDenMischEimerVor();
	}

	@SuppressWarnings("unused")
	private void bereiteDenMischEimerVor() {
		int mischEimerGroesse = 5;
	}

}
