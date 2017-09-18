package de.galileocomputing.schroedinger.java.kapitel08.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class CollectionSpielereien {
	public static void main(String[] args) {
		List<Integer> zahlenDurcheinander = Arrays.asList(2,4,3,4,5,6,7,4,3,5,3,4,5);
		Collections.sort(zahlenDurcheinander);
		Collections.sort(zahlenDurcheinander, new ZahlenUmgekehrtComparator());
		System.out.println(zahlenDurcheinander);
	}
	
	static class ZahlenUmgekehrtComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer zahl1, Integer zahl2) {
			return zahl2.compareTo(zahl1);
		}
		
	}
}
