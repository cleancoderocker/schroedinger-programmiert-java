package de.galileocomputing.schroedinger.java.kapitel11.io.kundendaten;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class KundenDatenKonvertiererNIO implements KundenDatenKonvertierer {

	@Override
	public void konvertiereKundendaten(File quelle, File ziel) {
	    Path quellPfad = quelle.toPath();
	    Path zielPfad = ziel.toPath();
	    try {
	    	if(Files.exists(zielPfad)) {
	    		Files.delete(zielPfad);
	    	}
	    	Path zielDatei = Files.createFile(zielPfad);
	    	List<String> zeilen = Files.readAllLines(quellPfad, StandardCharsets.ISO_8859_1);
	    	for(int i=0; i<zeilen.size(); i++) {
	    		String eingabeZeile = zeilen.get(i);
	    		if(!eingabeZeile.isEmpty()) {
	    			String ausgabe = eingabeZeile.split(":")[1].trim();
	    			if(i%5 < 3) {
		    			ausgabe = ausgabe + ", ";
		    		}
		    		if(i>0 && i%5==0) {
		    			Files.write(zielDatei, System.getProperty("line.separator").getBytes(), StandardOpenOption.APPEND);
		    		}
		    		Files.write(zielDatei, ausgabe.getBytes(), StandardOpenOption.APPEND);
	    		}
	    	}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void konvertiereKundendatenInVerzeichnis(File quellVerzeichnis,
			File zielVerzeichnis) {
		try (DirectoryStream<Path> verzeichnisStream = Files.newDirectoryStream(quellVerzeichnis.toPath(), "*.txt")) {
			Files.createDirectories(zielVerzeichnis.toPath());
			for (Path pfad : verzeichnisStream) {
				Path zielPfad = Paths.get(zielVerzeichnis.getPath() + FileSystems.getDefault().getSeparator() + pfad.getFileName().toString().replace(".txt", ".csv"));
				this.konvertiereKundendaten(pfad.toFile(), zielPfad.toFile());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
