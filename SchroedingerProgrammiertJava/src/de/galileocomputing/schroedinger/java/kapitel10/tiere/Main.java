package de.galileocomputing.schroedinger.java.kapitel10.tiere;

import java.util.ArrayList;
import java.util.List;

import de.galileocomputing.schroedinger.java.kapitel10.kartons.Karton;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		List<Tier> katzen = new ArrayList<>();
		katzen.add(new Katze("Schnuckel"));
		katzen.add(new Katze("Lisa"));
		druckeNamen(katzen);
		vermehrtEuch(katzen);
		List<Tier> hunde = new ArrayList<>();
		hunde.add(new Hund("Wuffelknuffel"));
		hunde.add(new Hund("Wiffelkniffel"));
		druckeNamen(hunde);
		vermehrtEuch(hunde);
		List tiere = new ArrayList<>();
		tiere.add(new Tier("Unbekannt"));
		Object tier = tiere.get(0);
		
		List<?> tiere2 = new ArrayList<>();
		tiere2.add(null);
		Object tier2 = tiere2.get(0);
		
		List<? extends Tier> tiere3 = new ArrayList<>();
		tiere3.add(null);
		Tier tier3 = tiere3.get(0);
		
		List<? super Tier> tiere4 = new ArrayList<>();
		tiere4.add(new Tier("Unbekannt"));
		tiere4.add(new Katze("Lisa"));
		tiere4.add(new Hund("Wuffel"));
		Object tier4 = tiere4.get(0);
		
		List<Tier> tiere5 = new ArrayList<>();
		tiere5.add(new Tier("Unbekannt"));
		tiere5.add(new Katze("Lisa"));
		tiere5.add(new Hund("Wuffel"));
		Tier tier5 = tiere5.get(0);
		
		Katze katze = new Katze("Lisa");
		Karton kartonMitKatze = new Karton<>(katze);
		Main.<Katze>machWas(kartonMitKatze);
	}
	
	public static <T> void machWas(Karton<? extends T> karton) {
		
	}
	
	public static void druckeNamen(List<? extends Tier> tiere) {
		for (Tier tier : tiere) {
			System.out.println(tier.getName());
		}
	}
	
	public static void vermehrtEuch(List<? super Tier> tiere) {
		tiere.add(new Katze("Mimi"));
		tiere.add(new Hund("Wuschel"));
	}
}
