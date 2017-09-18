package de.galileocomputing.schroedinger.java.kapitel10.tiere;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Raetsel {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		List tiere = new ArrayList<>();
		List<?> tiere2 = new ArrayList<>();
		List<? extends Tier> tiere3 = new ArrayList<>();
		List<? super Tier> tiere4 = new ArrayList<>();
		List<Tier> tiere5 = new ArrayList<>();
		List katzen = new ArrayList<>();
		List<?> katzen2 = new ArrayList<>();
		List<? extends Katze> katzen3 = new ArrayList<>();
		List<? super Katze> katzen4 = new ArrayList<>();
		List<Katze> katzen5 = new ArrayList<>();
		List hunde = new ArrayList<>();
		List<?> hunde2 = new ArrayList<>();
		List<? extends Hund> hunde3 = new ArrayList<>();
		List<? super Hund> hunde4 = new ArrayList<>();
		List<Hund> hunde5 = new ArrayList<>();
		tiere = tiere2;
		tiere = tiere3;
		tiere = tiere4;
		tiere = tiere5;
	}
}
