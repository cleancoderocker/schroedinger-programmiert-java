package de.galileocomputing.schroedinger.java.kapitel12.wow.deadlock;


/**
 * 
 * @author Philip Ackermann
 *
 */
public abstract class Held {
	private String name;
	
	public Held(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
    public void besuchen(Held held) {
    	synchronized(this) {
	    	try {
				Thread.sleep(50);
			} catch (InterruptedException exception) {
			}
	    	System.out.printf("%s: \"Wir treffen uns bei ihm, dann gehe ich schon mal los.\"%n", this.getName());
	        held.besuchEmpfangen(this);
    	}
    }
    
    public void besuchEmpfangen(Held held) {
    	synchronized (this) {
    		System.out.printf("%s: \"Wir haben uns bei mir getroffen.\"%n", this.getName());			
		}
    }
}
