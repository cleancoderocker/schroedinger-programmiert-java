package de.galileocomputing.schroedinger.java.kapitel11.serialization.krieger2;

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
		ZwergenKrieger krieger = new ZwergenKrieger("Jupp", 20);
		System.out.println(krieger.getName());
		System.out.println(krieger.getErfahrung());
		
		try(
				OutputStream dateiSchreiber = new FileOutputStream("krieger.data");
				ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
		) {
			objektSchreiber.writeObject(krieger);
			objektSchreiber.flush();
		}
		
		try(
				InputStream dateiLeser = new FileInputStream("krieger.data");
				ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
		) {
			ZwergenKrieger gelesenerKrieger = (ZwergenKrieger) objektLeser.readObject();
			System.out.println(gelesenerKrieger.getName());
			System.out.println(gelesenerKrieger.getErfahrung());
		}
	}
}
