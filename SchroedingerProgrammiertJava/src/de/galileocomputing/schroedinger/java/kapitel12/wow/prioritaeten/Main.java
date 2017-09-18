package de.galileocomputing.schroedinger.java.kapitel12.wow.prioritaeten;

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
				while(!Thread.currentThread().isInterrupted()) {
					zwerg.trinken();
				}
			}
		}, "ZwergenThread");
		Thread elfenThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(!Thread.currentThread().isInterrupted()) {
					nachtelf.trinken();
				}
			}
		}, "ElfenThread");
		zwergenThread.setPriority(Thread.MAX_PRIORITY);
		elfenThread.setPriority(Thread.MIN_PRIORITY);
		zwergenThread.start();
		elfenThread.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
		}
		zwergenThread.interrupt();
		elfenThread.interrupt();
	}
}
