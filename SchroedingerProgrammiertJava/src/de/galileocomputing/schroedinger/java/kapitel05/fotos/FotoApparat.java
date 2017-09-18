package de.galileocomputing.schroedinger.java.kapitel05.fotos;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class FotoApparat {

	public static final int MIN_BRENNWEITE = 10;
	
	public static final int MAX_BRENNWEITE = 270;
	
	private String marke;
	
	private int megaPixel;
	
	private double displayGroesse;
	
	private boolean bildStabilisiert;
	
	private Objektiv objektiv;
	
	private String herstellungsLand;
	
	FotoApparat() {
		this.objektiv = new Objektiv(18, 100);
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

	public void machFoto() {
		System.out.println("Klick!");
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public int getMegaPixel() {
		return megaPixel;
	}

	public void setMegaPixel(int megaPixel) {
		if(megaPixel >= 1 && megaPixel <= 20) {
			this.megaPixel = megaPixel;
		}
	}

	public double getDisplayGroesse() {
		return displayGroesse;
	}

	public void setDisplayGroesse(double displayGroesse) {
		this.displayGroesse = displayGroesse;
	}

	public boolean isBildStabilisiert() {
		return bildStabilisiert;
	}

	public void setBildStabilisiert(boolean bildStabilisiert) {
		this.bildStabilisiert = bildStabilisiert;
	}

	public Objektiv getObjektiv() {
		return objektiv;
	}

	public void setObjektiv(Objektiv objektiv) {
		this.objektiv = objektiv;
	}
	
	public String getHerstellungsLand() {
		return herstellungsLand;
	}

	public void setHerstellungsLand(String herstellungsLand) {
		this.herstellungsLand = herstellungsLand;
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
