package de.galileocomputing.schroedinger.java.kapitel07.pralinen;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchokoladenSpiele {
	public static void main(String[] args) {
		SchokoladenKeksGemisch schokoladenKeksGemisch = new SchokoladenKeksGemisch();
		SchokoladenSuechtiger schokoladenSuechtiger = new SchokoladenSuechtiger();
		BuchDerWeltrekorde buchDerWeltrekorde = new BuchDerWeltrekorde();
		schokoladenSuechtiger.essen(schokoladenKeksGemisch);
		buchDerWeltrekorde.messen(schokoladenKeksGemisch);
	}
}
