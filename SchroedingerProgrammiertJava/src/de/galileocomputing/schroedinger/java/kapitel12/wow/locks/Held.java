package de.galileocomputing.schroedinger.java.kapitel12.wow.locks;


/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class Held {
	private String name;
	private Object lock;
	
	public Held(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
    public void besuchen(Held held) {
    	synchronized(this.getLock()) {
	    	try {
				Thread.sleep(50);
			} catch (InterruptedException exception) {
			}
	    	System.out.printf("%s: \"Wir treffen uns bei ihm, dann gehe ich schon mal los.\"%n", this.getName());
	        held.besuchEmpfangen(this);
    	}
    }
    
    public Object getLock() {
		return this.lock;
	}
    
    public void setLock(Object lock) {
		this.lock = lock;
	}

	public void besuchEmpfangen(Held held) {
    	synchronized(this.getLock()) {
    		System.out.printf("%s: \"Wir haben uns bei mir getroffen.\"%n", this.getName());			
		}
    }
}
