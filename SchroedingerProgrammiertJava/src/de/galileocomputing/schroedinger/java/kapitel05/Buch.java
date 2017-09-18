package de.galileocomputing.schroedinger.java.kapitel05;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Buch {
	private static final int MAX_SEITENZAHL = 50560;
	private static final int MIN_SEITENZAHL = 49;
	private String autor;
	private String titel;
	private int seitenAnzahl;
	private boolean gebunden;

	public Buch() {
	}
	
	public Buch(String autor, String titel, int seitenAnzahl, boolean gebunden) {
		super();
		this.autor = autor;
		this.titel = titel;
		this.setSeitenAnzahl(seitenAnzahl);
		this.gebunden = gebunden;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getSeitenAnzahl() {
		return seitenAnzahl;
	}

	public void setSeitenAnzahl(int seitenAnzahl) {
		if (seitenAnzahl >= MIN_SEITENZAHL && seitenAnzahl <= MAX_SEITENZAHL) {
			this.seitenAnzahl = seitenAnzahl;
		}
	}

	public boolean isGebunden() {
		return gebunden;
	}

	public void setGebunden(boolean gebunden) {
		this.gebunden = gebunden;
	}

	public void lesen() {
		System.out.println(this.getTitel() + " von " + this.getAutor() + " wollte ich schon lange mal lesen. Los geht's.");
	}

}
