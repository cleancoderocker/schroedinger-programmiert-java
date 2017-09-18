package de.galileocomputing.schroedinger.java.kapitel03;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Liegestuetzen {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
			System.out.println(". Runde - auf geht's:");
			for (int j = 1; j <= 50; j++) {
				System.out.print(j);
				System.out.println(". Liegestütz");
				for (int k = 01; k <= 10; k++) {
					System.out.println(k);
				}
			}
		}
	}
}
