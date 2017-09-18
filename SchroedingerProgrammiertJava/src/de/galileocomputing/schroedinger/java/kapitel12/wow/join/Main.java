package de.galileocomputing.schroedinger.java.kapitel12.wow.join;

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
				zwerg.aufInDenKampf(nachtelf);
			}
		});
		final Thread elfenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					zwergenThread.join();
				} catch (InterruptedException exception) {
				}	
				nachtelf.aufInDenKampf(zwerg);
			}
		});
		zwergenThread.start();
		elfenThread.start();
	}
}
