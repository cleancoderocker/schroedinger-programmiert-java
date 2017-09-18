package de.galileocomputing.schroedinger.java.kapitel12.zahlenspiele;

/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class AbstractZahlenDrucker implements Runnable, Zahlendrucker {

	private int grenze;
	
	public AbstractZahlenDrucker(int grenze) {
		this.grenze = grenze;
	}
	
	@Override
	public void run() {
		synchronized (AbstractZahlenDrucker.class) {
			for(int i=0; i<=this.grenze; i++) {
				if(this.akzeptiereZahl(i)) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName());
					this.druckeZahl(i);
				}
			}
		}
	}
	
	protected abstract boolean akzeptiereZahl(int zahl);

	@Override
	public void druckeZahl(int zahl) {
		System.out.println(zahl);
	}
}
