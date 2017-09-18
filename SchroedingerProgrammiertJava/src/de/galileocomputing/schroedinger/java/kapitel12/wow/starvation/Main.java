package de.galileocomputing.schroedinger.java.kapitel12.wow.starvation;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class Main {
	public static void main(String[] args) {
		final Zwerg zwerg = new Zwerg("Zwerg");
		final Nachtelf nachtelf = new Nachtelf("Nachtelf");
		final Toilette toilette = new Toilette();
		final Thread zwergenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (toilette) {
					try {
						System.out.println("Zwerg wartet ...");
						toilette.wait();
					} catch (InterruptedException e) {
					}
				}
				zwerg.malGehen(toilette);
			}
		}, "ZwergenThread");
		Thread elfenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (toilette) {
					try {
						System.out.println("Nachtelf wartet ...");
						toilette.wait();
					} catch (InterruptedException e) {
					}
				}
				nachtelf.malGehen(toilette);
			}
		}, "ElfenThread");
		zwergenThread.start();
		elfenThread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		synchronized (toilette) {
			System.out.println("Zauberer: \"Ah das tat gut. So der nächste kann.\"");
			toilette.notifyAll();
		}
	}
}
