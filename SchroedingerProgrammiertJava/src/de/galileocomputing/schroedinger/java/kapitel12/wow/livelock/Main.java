package de.galileocomputing.schroedinger.java.kapitel12.wow.livelock;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Main {
	public static void main(String[] args) {
		final Zwerg zwerg = new Zwerg("Zwerg");
		final Nachtelf nachtelf = new Nachtelf("Nachtelf");
		final Bier bier = new Bier(zwerg);
		final Thread zwergenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				zwerg.trinken(bier, nachtelf);
			}
		}, "ZwergenThread");
		Thread elfenThread = new Thread(new Runnable() {
			@Override
			public void run() {	
				nachtelf.trinken(bier, zwerg);
			}
		}, "ElfenThread");
		zwergenThread.start();
		elfenThread.start();
	}
}
