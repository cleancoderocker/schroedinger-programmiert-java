package de.galileocomputing.schroedinger.java.kapitel02;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class NarrowingWidening {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte kleinsterTyp = 5;
		short kleinerTyp = kleinsterTyp;
		int grosserTyp = kleinerTyp;
		long groessterTyp = grosserTyp;
//		grosserTyp = groessterTyp;
		grosserTyp = (int) groessterTyp;
		kleinerTyp = (short) grosserTyp;
		kleinsterTyp = (byte) kleinerTyp;
		
		short zahl = 129;
		byte kleinesByte = (byte) zahl;
		System.out.println(kleinesByte);
	}

}
