package de.galileocomputing.schroedinger.java.kapitel11.io.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		try(InputStream eingabe = new FileInputStream(new File("./resources/kapitel11/keineBinaerDatei.txt"))) {
			int zeichen;
			while((zeichen = eingabe.read()) != -1) {
				System.out.print(zeichen);
			}
		} catch (IOException e) {
		}
		
		
//		bildKopierenLangsam();
		bildKopierenSchnell();
		
		try(OutputStream ausgabe = new FileOutputStream(new File("./resources/kapitel11/keineBinaerDatei2.txt"), true)) {
			ausgabe.write("Hallo Schrödinger\n".getBytes());
		} catch (IOException e) {
		}
		
		try(BufferedReader dateiLeser = new BufferedReader(new FileReader(new File("./resources/kapitel11/keineBinaerDatei.txt")))) {
			String zeile;
			while((zeile = dateiLeser.readLine()) != null) {
				System.out.println(zeile);
			}
		} catch (IOException e) {
		}
		
		try(BufferedWriter dateiSchreiber = new BufferedWriter(new FileWriter(new File("./resources/kapitel11/keineBinaerDatei2.txt"), true))) {
			dateiSchreiber.write("Hallo Schrödinger");
		} catch (IOException e) {
		}
	}

	private static void bildKopierenSchnell() {
		try (BufferedInputStream eingabe = new BufferedInputStream(new FileInputStream(new File("./resources/kapitel11/bild.jpg")));
			BufferedOutputStream ausgabe = new BufferedOutputStream(new FileOutputStream(new File("./resources/kapitel11/bildKopie.jpg")))) {
			byte[] buffer = new byte[1024];
			while (eingabe.read(buffer) != -1) {
				ausgabe.write(buffer);
			}
		} catch (IOException e) {
		}
	}

	@SuppressWarnings("unused")
	private static void bildKopierenLangsam() {
		try(InputStream eingabe = new FileInputStream(new File("./resources/kapitel11/bild.jpg")); 
				OutputStream ausgabe = new FileOutputStream(new File("./resources/kapitel11/bildKopie.jpg"))) {
			int zeichen;
			while((zeichen = eingabe.read()) != -1) {
				ausgabe.write(zeichen);
			}
		} catch (IOException e) {
		}
	}
}
