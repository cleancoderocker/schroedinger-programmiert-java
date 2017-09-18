package de.galileocomputing.schroedinger.java.kapitel05.stacktrace;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Vase {
	public void umfallen() {
		Thread.dumpStack();
	}
}
