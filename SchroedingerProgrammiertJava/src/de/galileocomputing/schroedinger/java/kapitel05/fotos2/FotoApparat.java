package de.galileocomputing.schroedinger.java.kapitel05.fotos2;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class FotoApparat {

	public static String MADE_IN = "Deutschland";

	private String marke;
	
	private int megaPixel;
	
	private double displayGroesse;
	
	private boolean bildStabilisiert;
	
	private Objektiv objektiv;

	FotoApparat() {
		this.bildStabilisiert = true;
		this.displayGroesse = 7.5;
		this.marke = "SoNie";
		this.megaPixel = 18;
	}

	FotoApparat(String marke, int megaPixel, double displayGroesse,
			boolean bildStabilisiert, Objektiv objektiv) {
		super();
		this.marke = marke;
		this.megaPixel = megaPixel;
		this.displayGroesse = displayGroesse;
		this.bildStabilisiert = bildStabilisiert;
		this.objektiv = objektiv;
	}

	void machFoto() {
		System.out.println("Klick!");
	}

	String getMarke() {
		return marke;
	}

	FotoApparat setMarke(String marke) {
		this.marke = marke;
		return this;
	}

	int getMegaPixel() {
		return megaPixel;
	}

	FotoApparat setMegaPixel(int megaPixel) {
		if (megaPixel >= 1 && megaPixel <= 20) {
			this.megaPixel = megaPixel;
		}
		return this;
	}

	double getDisplayGroesse() {
		return displayGroesse;
	}

	FotoApparat setDisplayGroesse(double displayGroesse) {
		this.displayGroesse = displayGroesse;
		return this;
	}

	boolean isBildStabilisiert() {
		return bildStabilisiert;
	}

	FotoApparat setBildStabilisiert(boolean bildStabilisiert) {
		this.bildStabilisiert = bildStabilisiert;
		return this;
	}

	FotoApparat setObjektiv(Objektiv objektiv) {
		this.objektiv = objektiv;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("FotoApparat [marke=").append(marke)
				.append(", megaPixel=").append(megaPixel)
				.append(", displayGroesse=").append(displayGroesse)
				.append(", bildStabilisiert=").append(bildStabilisiert)
				.append(", objektiv=").append(objektiv).append("]");
		return stringBuilder.toString();
	}

}
