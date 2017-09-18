package de.galileocomputing.schroedinger.java.kapitel11.pfade;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Path ausgabe = Paths.get("D:\\personal\\bossingen\\ausgabe");
		try {
			ausgabe = Files.createDirectory(ausgabe);
			ausgabe = Files.createDirectories(ausgabe);
			Path datei = Files.createFile(ausgabe.resolve("datei.txt"));
			Path andereDatei = ausgabe.resolve("andereDatei.txt");
			System.out.println(datei.toAbsolutePath());
			List<String> zeilen = Files.readAllLines(datei, StandardCharsets.ISO_8859_1);
			Files.write(andereDatei, zeilen, StandardCharsets.ISO_8859_1);
			for (String zeile : zeilen) {
				Files.write(andereDatei, zeile.getBytes());
			}
			Files.copy(datei, andereDatei);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path schlafzimmer = Paths.get("C:\\schroedinger\\wohnung\\schlafzimmer");
		Path krawatten = Paths.get("kleiderschrank\\obersteSchublade\\krawatten");
		Path woSindDieKrawatten = schlafzimmer.resolve(krawatten);
		System.out.println(woSindDieKrawatten);
		
		Path flur = Paths.get("C:\\schroedinger\\wohnung\\flur");
		Path wohnzimmer = Paths.get("C:\\schroedinger\\wohnung\\wohnzimmer");
		Path wohnzimmerZuFlur = wohnzimmer.relativize(flur);
		System.out.println(wohnzimmerZuFlur);
		
		Path pfad = Paths.get("C:\\schroedinger\\wohnung\\flur");
		Iterator<Path> iterator = pfad.iterator();
		while (iterator.hasNext()) {
			Path pfadKomponente = iterator.next();
			System.out.println(pfadKomponente);
		}
		
		Path datei = Paths.get("..\\..\\workspace\\datei.txt");
		System.out.println(datei.toAbsolutePath());
		try {
			System.out.println(datei.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
