package de.galileocomputing.schroedinger.java.kapitel05.fotos;

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
		FotoApparat fotoApparat = new FotoApparat();
		fotoApparat.setObjektiv(new Objektiv(18, 100));
		fotoApparat.setBildStabilisiert(true);
		fotoApparat.setDisplayGroesse(7.5);
		fotoApparat.setMarke("SoNie");
		fotoApparat.setMegaPixel(10);
		
		FotoApparat fotoApparat2 = new FotoApparat();
		fotoApparat2.setObjektiv(new Objektiv(50, 270));
		fotoApparat2.setBildStabilisiert(true);
		fotoApparat2.setDisplayGroesse(9.5);
		fotoApparat2.setMarke("SoNie");
		fotoApparat2.setMegaPixel(18);
		
		System.out.println(fotoApparat.toString());
		System.out.println(fotoApparat2.toString());
		
		Objektiv objektiv = fotoApparat.getObjektiv();
		fotoApparat.setObjektiv(fotoApparat2.getObjektiv());
		fotoApparat2.setObjektiv(objektiv);
		
		System.out.println(fotoApparat.toString());
		System.out.println(fotoApparat2.toString());
	}

}
