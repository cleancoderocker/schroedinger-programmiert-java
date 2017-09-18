package de.galileocomputing.schroedinger.java.kapitel08.sets;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SetSpielereien {
	public static void main(String[] args) {
		Set<Integer> zahlen = new HashSet<>();
		zahlen.add(1);
		zahlen.add(2);
		zahlen.add(3);
		zahlen.add(4);
		System.out.println(zahlen);
		zahlen.add(4);
		System.out.println(zahlen);
	}
}
