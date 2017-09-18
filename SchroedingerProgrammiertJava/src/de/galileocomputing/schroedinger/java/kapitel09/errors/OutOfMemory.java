package de.galileocomputing.schroedinger.java.kapitel09.errors;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class OutOfMemory {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			long[] gaaaaaaanzLangesArray = new long[20000000];
		} catch(OutOfMemoryError outOfMemoryError) {
			System.err.println("Nicht genug Speicher");
		}
	}
}
