package de.galileocomputing.schroedinger.java.kapitel11.io.kundendaten;

import java.io.File;

/**
 * 
 * @author Philip Ackermann
 *
 */
public interface KundenDatenKonvertierer {
	void konvertiereKundendaten(File quelle, File ziel);
	
	void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis, File zielVerzeichnis);
}
