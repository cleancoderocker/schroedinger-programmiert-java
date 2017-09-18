package de.galileocomputing.schroedinger.java.kapitel11.serialization.notizen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Notiz notiz = new Notiz(new Autor("", "Schrödinger"), "Mein erstes gespeichertes Objekt.");
		System.out.println(notiz.getAutor());
		System.out.println(notiz.getNachricht());
		
		try(
				OutputStream dateiSchreiber = new FileOutputStream("notiz.data");
				ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
		) {
			objektSchreiber.writeObject(notiz);
			objektSchreiber.flush();
		}
		
		try(
				InputStream dateiLeser = new FileInputStream("notiz.data");
				ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
		) {
			Notiz geleseneNotiz = (Notiz) objektLeser.readObject();
			System.out.println(geleseneNotiz.getAutor());
			System.out.println(geleseneNotiz.getNachricht());
		}
	}
}
