package de.galileocomputing.schroedinger.java.kapitel07.konstanten.sender;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		Sender sender = Sender.ARD;
		System.out.println(sender.ordinal());
		switch (sender) {
		case ARD:
			System.out.println("Tatort");
			break;
		case ZDF:
			System.out.println("Traumschiff");
			break;
		case RTL:
			System.out.println("Dschungelcamp");
			break;
		case SAT1:
			System.out.println("Glücksrad");
			break;
		default:
			break;
		}
	}
}
