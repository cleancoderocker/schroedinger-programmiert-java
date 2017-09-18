package de.galileocomputing.schroedinger.java.kapitel05.fotos2;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class FotoShooting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Objektiv objektiv = new Objektiv(17, 200);
		FotoApparat fotoApparat = new FotoApparat();
		fotoApparat.setObjektiv(objektiv)
					.setBildStabilisiert(true)
					.setDisplayGroesse(7.5)
					.setMarke("SoNie")
					.setMegaPixel(18)
					.machFoto();
	}

}
