package de.galileocomputing.schroedinger.java.kapitel08.queuesstacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import de.galileocomputing.schroedinger.java.kapitel08.schuhetester.SchuhPaar;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class QueuesUndStackSpielereien {
	public static void main(String[] args) {
		Queue<Person> warteSchlange = new LinkedList<>();
		warteSchlange.offer(new Person("Herr Schrödinger"));
		warteSchlange.offer(new Person("Frau Fransen"));
		warteSchlange.offer(new Person("Herr Müller"));
		while(warteSchlange.peek() != null) {
			System.out.println("Der Nächste bitte! Ah, guten Tag " + warteSchlange.poll() + "!");
		}
		
		Stack<SchuhPaar> schuhStapel = new Stack<SchuhPaar>();
		schuhStapel.push(new SchuhPaar(39, "schwarz", true));
		schuhStapel.push(new SchuhPaar(39, "gelb", false));
		schuhStapel.push(new SchuhPaar(39, "blau", true));
		schuhStapel.push(new SchuhPaar(39, "grün", false));
		while(!schuhStapel.empty()) {
			System.out.println("Uff, jetzt noch ein Paar " + schuhStapel.pop());
		}
	}
	
	static class Person {
		private String name;
		
		public Person(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
	}
}
