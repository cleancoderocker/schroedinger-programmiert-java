package de.galileocomputing.schroedinger.java.kapitel10.kopierer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class KopiererMitMethode {
	
	public static void main(String[] args) {
		List<Buch> buecher = new ArrayList<>();
		List<Buch> buecherKopien = new ArrayList<>();
		KopiererMitMethode kopierer = new KopiererMitMethode();
		kopierer.<Buch>kopiere(buecher, buecherKopien);
		
		List<CD> cds = new ArrayList<>();
		List<CD> cdKopien = new ArrayList<>();
		kopierer.<CD>kopiere(cds, cdKopien);
	}
	
	public <T> void kopiere(List<? extends T> quelle, List<? super T> ziel) {
		for (int i = 0; i < quelle.size(); i++) {
			ziel.set(i, quelle.get(i));
		}
	}
}
