package de.galileocomputing.schroedinger.java.kapitel08.sets.schmuck;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Goldschmuck {
	public static void main(String[] args) {
		String herrMueller = "Herr Müller";
		String frauMueller = "Frau Müller";
		String herrMaier = "Herr Maier";
		String frauMaier = "Frau Maier";
		String derGaertner = "Der Gärtner";
		String diePutzfrau = "Die Putzfrau";
		String dieDiebischeElster = "Die diebische Elster";
		
		Set<String> verdaechtige = new TreeSet<>();
		verdaechtige.add(herrMueller);
		verdaechtige.add(frauMueller);
		verdaechtige.add(herrMaier);
		verdaechtige.add(frauMaier);
		verdaechtige.add(derGaertner);
		verdaechtige.add(diePutzfrau);
		verdaechtige.add(dieDiebischeElster);
		
		Set<String> hatAlibi = new TreeSet<>();
		hatAlibi.add(frauMueller);
		hatAlibi.add(derGaertner);
		
		Set<String> liebenGold = new TreeSet<>();
		liebenGold.add(frauMueller);
		liebenGold.add(herrMaier);
		liebenGold.add(derGaertner);
		liebenGold.add(diePutzfrau);
		liebenGold.add(dieDiebischeElster);
		
		Set<String> zugangZumSafe = new TreeSet<>();
		zugangZumSafe.add(herrMueller);
		zugangZumSafe.add(herrMaier);
		zugangZumSafe.add(derGaertner);
		zugangZumSafe.add(diePutzfrau);
		
		Set<String> zugangZumSafeSchluessel = new TreeSet<>();
		zugangZumSafeSchluessel.add(herrMueller);
		zugangZumSafeSchluessel.add(frauMueller);
		zugangZumSafeSchluessel.add(herrMaier);
		zugangZumSafeSchluessel.add(frauMaier);
		zugangZumSafeSchluessel.add(dieDiebischeElster);
		
		System.out.println(verdaechtige);
		verdaechtige.removeAll(hatAlibi);
		System.out.println(verdaechtige);
		verdaechtige.retainAll(liebenGold);
		System.out.println(verdaechtige);
		verdaechtige.retainAll(zugangZumSafe);
		System.out.println(verdaechtige);
		verdaechtige.retainAll(zugangZumSafeSchluessel);
		System.out.println(verdaechtige);
	}
}
