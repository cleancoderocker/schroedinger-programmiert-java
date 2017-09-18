package de.galileocomputing.schroedinger.java.kapitel11.io.kundendaten;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class KundenDatenKonvertiererIO implements KundenDatenKonvertierer {

	private static final int ANZAHL_WERTE = 4;
	
	@Override
	public void konvertiereKundendaten(File quelle, File ziel) {
		try(BufferedWriter dateiSchreiber = new BufferedWriter(new FileWriter(ziel));
				BufferedReader dateiLeser = new BufferedReader(new FileReader(quelle));) {
		    int zeilenNummer = 0;
		    String eingabeZeile;
		    while((eingabeZeile = dateiLeser.readLine()) != null) {
		    	if(!eingabeZeile.isEmpty()) {
		    		String ausgabe = eingabeZeile.split(":")[1].trim();
		    		if(zeilenNummer % ANZAHL_WERTE != 3) {
		    			ausgabe = ausgabe + ", ";
		    		}
		    		if(zeilenNummer > 0 && zeilenNummer % ANZAHL_WERTE == 0) {
		    			dateiSchreiber.newLine();
		    		}
			    	dateiSchreiber.write(ausgabe);
			    	zeilenNummer++;
		    	}
		    }
		} catch (IOException e) {
		}
	}

	@Override
	public void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis,
			File zielVerzeichnis) {
		FilenameFilter textDateienFilter = new FilenameFilter() {
			@Override
			public boolean accept(File verzeichnis, String dateiName) {
				return dateiName.endsWith(".txt");
			}
		};
		if(zielVerzeichnis != null) {
			if(!zielVerzeichnis.exists()) {
				zielVerzeichnis.mkdirs();
			}
			for (File datei : quellVerzeichnis.listFiles(textDateienFilter)) {
				String zielPfad = zielVerzeichnis.getPath() + File.separator + datei.getName().replace(".txt", ".csv");
				this.konvertiereKundendaten(datei, new File(zielPfad));
			}
		}
	}


}
