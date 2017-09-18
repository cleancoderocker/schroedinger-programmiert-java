package de.galileocomputing.schroedinger.java.kapitel09.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class DateiLeser {
	public static void main(String[] args) {
		System.out.println(oldSchoolRessourcenHandling());
		System.out.println(newSchoolRessourcenHandling());
	}

	private static String oldSchoolRessourcenHandling() {
		StringBuilder inhalt = new StringBuilder();
		File datei = new File("resources\\kapitel10\\datei.txt");
		BufferedReader dateiLeser = null;
		try {
			dateiLeser = new BufferedReader(new FileReader(datei));
			String zeile = null;
			while ((zeile = dateiLeser.readLine()) != null) {
				inhalt.append(zeile);
				inhalt.append(System.getProperty("line.separator"));
			}
		} catch (FileNotFoundException e) {
			System.err.println("Datei nicht gefunden!");
		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen!");
		} finally {
			if (dateiLeser != null) {
				try {
					dateiLeser.close();
				} catch (IOException e) {
					System.err.println("Fehler beim Schliessen!");
				}
			}
		}
		return inhalt.toString();
	}

	private static String newSchoolRessourcenHandling() {
		StringBuilder inhalt = new StringBuilder();
		File datei = new File("resources\\kapitel10\\datei.txt");
		try (BufferedReader dateiLeser = new BufferedReader(new FileReader(datei))) {
			String zeile = null;
			while ((zeile = dateiLeser.readLine()) != null) {
				inhalt.append(zeile);
				inhalt.append(System.getProperty("line.separator"));
			}
		} catch (FileNotFoundException e) {
			System.err.println("Datei nicht gefunden!");
		} catch (IOException e) {
			System.err.println("Fehler beim Einlesen!");
		} finally {
			// Hier kannst du vieles machen, wenn du möchtest. Die Ressource schliessen gehört aber ganz bestimmt nicht dazu.
		}
		return inhalt.toString();
	}
}
