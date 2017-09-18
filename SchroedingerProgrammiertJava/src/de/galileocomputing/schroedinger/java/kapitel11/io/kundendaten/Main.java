package de.galileocomputing.schroedinger.java.kapitel11.io.kundendaten;

import java.io.File;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		KundenDatenKonvertierer konvertierer = new KundenDatenKonvertiererIO();
//		KundenDatenKonvertierer konvertierer = new KundenDatenKonvertiererNIO();
		konvertierer.konvertiereKundendatenInVerzeichnis(new File("D:\\personal\\schrödinger\\eingabe"), new File("D:\\personal\\bossingen\\ausgabe"));
//		konvertierer.konvertiereKundendaten(new File("./resources/kapitel11/eingabe/kundendaten.txt"), new File("./resources/kapitel11/ausgabe/kundendaten.csv"));
	}
}
