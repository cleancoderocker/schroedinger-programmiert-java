package de.galileocomputing.schroedinger.java.kapitel10.kopierer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Kopierer<T> {
	
	public static void main(String[] args) {
		List<Buch> buecher = new ArrayList<>();
		List<Buch> buecherKopien = new ArrayList<>();
		Kopierer<Buch> buchKopierer = new Kopierer<>();
		buchKopierer.kopiere(buecher, buecherKopien);
		
		List<CD> cds = new ArrayList<>();
		List<CD> cdKopien = new ArrayList<>();
		Kopierer<CD> cdKopierer = new Kopierer<>();
		cdKopierer.kopiere(cds, cdKopien);
	}
	
	public void kopiere(List<? extends T> quelle, List<? super T> ziel) {
		for (int i = 0; i < quelle.size(); i++)
			ziel.set(i, quelle.get(i));
	}
}
