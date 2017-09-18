package de.galileocomputing.schroedinger.java.kapitel12.wow.sleep;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Main {
	public static void main(String[] args) {
		final Zwerg zwerg = new Zwerg("Zwerg");
		final Nachtelf nachtelf = new Nachtelf("Nachtelf");
		new Thread(new Runnable() {
			@Override
			public void run() {
				zwerg.aufInDenKampf(nachtelf);
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {	
				nachtelf.aufInDenKampf(zwerg);
			}
		}).start();
	}
}
