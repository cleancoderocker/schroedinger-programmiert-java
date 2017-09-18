package de.galileocomputing.schroedinger.java.kapitel11.io.dateien;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		File eingabe = new File(".\\resources\\kapitel11\\eingabe");
		if(eingabe.isDirectory()) {
			for (File datei : eingabe.listFiles()) {
				System.out.println(datei.getAbsolutePath());
				try {
					System.out.println(datei.getCanonicalPath());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.println(datei.getPath());
		        System.out.println(datei.getParent());
		        System.out.println(datei.getName());
		    }
		}
//		erstelleDateiAuchWennsDieVerzeichnisseNochNichtGibt("D:\\liebesbrief.txt");
//		erstelleDateiAuchWennsDieVerzeichnisseNochNichtGibt("D:\\daten\\schroedinger\\einkaufszettel.txt");
	}
	
	public static void erstelleDateiAuchWennsDieVerzeichnisseNochNichtGibt(String pfadZurDatei) throws IOException {
		File datei = new File(pfadZurDatei);
		if(!datei.exists()) {
			File verzeichnis = datei.getParentFile();
			if(verzeichnis != null) {
				if(!verzeichnis.exists()) {
					verzeichnis.mkdirs();
				}
				datei.createNewFile();
			}
			verzeichnis.delete();
		}
	}
}
