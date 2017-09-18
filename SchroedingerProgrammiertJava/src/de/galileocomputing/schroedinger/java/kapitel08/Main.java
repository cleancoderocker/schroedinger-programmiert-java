package de.galileocomputing.schroedinger.java.kapitel08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		List<String> monate = new ArrayList<String>();
		List<String> monateDiamond = new ArrayList<>();
		ArrayList soBitteNicht = new ArrayList();
		ArrayList<String> soBitteAuchNicht = new ArrayList<>();
		monate.add("Januar");
		monate.add("Februar");
		monate.add("März");
		monate.add("April");
		System.out.println(monate.size());
		String januar = monate.get(0);
		
		Collection<Integer> allesNurEinmal = new HashSet<>();
		allesNurEinmal.add(2);
		allesNurEinmal.add(2);
		allesNurEinmal.add(2);
		allesNurEinmal.add(2);
		System.out.println(allesNurEinmal.size());
	}
}
