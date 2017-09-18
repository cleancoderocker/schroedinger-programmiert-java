package de.galileocomputing.schroedinger.java.kapitel16.javafx.binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Binding {
	public static void main(String[] args) {
	       IntegerProperty gehaltBossingen = new SimpleIntegerProperty(20000);
	       IntegerProperty gehaltSchroedinger = new SimpleIntegerProperty(2000);
	       System.out.println(gehaltBossingen.getValue());
	       System.out.println(gehaltSchroedinger.getValue());
	       gehaltSchroedinger.bindBidirectional(gehaltBossingen);
	       System.out.println(gehaltBossingen.getValue());
	       System.out.println(gehaltSchroedinger.getValue());
	       gehaltSchroedinger.set(2005);
	       System.out.println(gehaltBossingen.getValue());
	       System.out.println(gehaltSchroedinger.getValue());
	}
}
