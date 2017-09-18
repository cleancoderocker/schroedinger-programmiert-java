package de.galileocomputing.schroedinger.java.kapitel12.wow.lockobjects;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class Held {
	private String name;
	private Lock lock = new ReentrantLock();
	
	public Held(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean treffenBei(Held held) {
		Boolean ichSageWirTreffenUnsBeiIhm = false;
		Boolean erSagtWirTreffenUnsBeiIhm = false;
		try {
			ichSageWirTreffenUnsBeiIhm = lock.tryLock();
			erSagtWirTreffenUnsBeiIhm = held.getLock().tryLock();
		} finally {
			if(!(ichSageWirTreffenUnsBeiIhm && erSagtWirTreffenUnsBeiIhm)) {
				System.out.println(this.getName() + ": \"Nächstes Mal treffen wir uns dann eben bei ihm.\"");
				if(ichSageWirTreffenUnsBeiIhm) {
					lock.unlock();
				}
				if(erSagtWirTreffenUnsBeiIhm) {
					held.getLock().unlock();
				}
			}
		}
		return ichSageWirTreffenUnsBeiIhm && erSagtWirTreffenUnsBeiIhm;
	}
	
	protected Lock getLock() {
		return lock;
	}
	
    public void besuchen(Held held) {
    	if(this.treffenBei(held)) {
	    	System.out.printf("%s: \"Wir treffen uns bei ihm, dann gehe ich schon mal los.\"%n", this.getName());
        	held.besuchEmpfangen(this);
    	}
    }
    
    public void besuchEmpfangen(Held held) {
    	System.out.printf("%s: \"Wir haben uns bei mir getroffen.\"%n", this.getName());
    }
}

