package de.galileocomputing.schroedinger.java.kapitel11.serialization.irgendwas;

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
		Irgendwas irgendwas = new Irgendwas("das", true);
		System.out.println(irgendwas.getIrgendwer());
		System.out.println(irgendwas.isIrgendwie());
		
		try(
				OutputStream dateiSchreiber = new FileOutputStream("irgendwas.data");
				ObjectOutputStream objektSchreiber = new ObjectOutputStream(dateiSchreiber)
		) {
			objektSchreiber.writeObject(irgendwas);
			objektSchreiber.flush();
		}
		
		try(
				InputStream dateiLeser = new FileInputStream("irgendwas.data");
				ObjectInputStream objektLeser = new ObjectInputStream(dateiLeser)
		) {
			Irgendwas gelesenesIrgendwas = (Irgendwas) objektLeser.readObject();
			System.out.println(gelesenesIrgendwas.getIrgendwer());
			System.out.println(gelesenesIrgendwas.isIrgendwie());
		}
	}
}
