package de.galileocomputing.schroedinger.java.kapitel12.wow.deadlock;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Main {
	public static void main(String[] args) {
		final Zwerg zwerg = new Zwerg("Zwerg");
		final Nachtelf nachtelf = new Nachtelf("Nachtelf");
		final Thread zwergenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				zwerg.besuchen(nachtelf);
			}
		}, "ZwergenThread");
		Thread elfenThread = new Thread(new Runnable() {
			@Override
			public void run() {	
				nachtelf.besuchen(zwerg);
			}
		}, "ElfenThread");
		zwergenThread.start();
		elfenThread.start();
	}
}
