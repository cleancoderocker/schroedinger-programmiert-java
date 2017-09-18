package de.galileocomputing.schroedinger.java.kapitel08.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class ListSpielereien {
	public static void main(String[] args) {
		List<String> aufgaben = new ArrayList<>();
		aufgaben.add("Geschirr spülen");
		aufgaben.add("Wohnzimmer aufräumen");
		aufgaben.add("Staub wischen");
		aufgaben.add("Badezimmer putzen");
//		for(int i=0; i<aufgaben.size(); i++) {
//			System.out.println(aufgaben.remove(i));
//		}
//		for(int i=0, groesse = aufgaben.size(); i<groesse; i++) {
//			System.out.println(aufgaben.remove(i));
//		}
//		for(int i=aufgaben.size()-1; i>=0; i--) {
//			System.out.println(aufgaben.remove(i));
//		}
		while(!aufgaben.isEmpty()) {
			System.out.println(aufgaben.remove(0));
		}
	}
}
