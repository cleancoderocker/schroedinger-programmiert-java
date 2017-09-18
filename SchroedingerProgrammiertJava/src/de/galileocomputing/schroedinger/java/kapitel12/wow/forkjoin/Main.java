package de.galileocomputing.schroedinger.java.kapitel12.wow.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Feind> feinde = new ArrayList<>();
		for (int i = 1; i <= 4000; i++) {
			feinde.add(new Feind("Feind " + i));
		}
		KampfAktion kaempfen = new KampfAktion(feinde);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(kaempfen);
	}
}
