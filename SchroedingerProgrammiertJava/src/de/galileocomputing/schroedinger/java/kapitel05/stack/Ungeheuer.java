package de.galileocomputing.schroedinger.java.kapitel05.stack;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Ungeheuer {
	private int anzahlZaehne = 200;
	private String name;
	
	public static void main(String[] args) {
		Ungeheuer ungeheuer = new Ungeheuer("Grarrarrrr");
		ungeheuer.erschrecken();
		ungeheuer.kauen();
		ungeheuer.flirten(new Ungeheuer("Grurrurrrr"));
	}
	
	public Ungeheuer(String name) {
		this.name = name;
	}
	
	public void erschrecken() {
		int lautstaerke = 5;
		String schrei = "Aararaaaarrrararrrr";
		System.out.print(this.name + schrei);
		for (int i = 0; i < lautstaerke; i++) {
			System.out.print("!");
		}
		System.out.println("");
	}
	
	public void kauen() {
		for(int i=0; i<this.anzahlZaehne / 4; i++) {
			System.out.print("Knirsch");
		}
		System.out.println("");
	}
	
	public void flirten(Ungeheuer ungeheuer) {
		this.erschrecken();
		ungeheuer.erschrecken();
	}

}
