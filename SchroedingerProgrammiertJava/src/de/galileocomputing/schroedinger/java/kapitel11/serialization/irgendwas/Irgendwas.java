package de.galileocomputing.schroedinger.java.kapitel11.serialization.irgendwas;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Irgendwas implements Externalizable {
	private String irgendwer;
	
	private boolean irgendwie;

	public Irgendwas() {
		
	}
	
	public Irgendwas(String irgendwer, boolean irgendwie) {
		super();
		this.irgendwer = irgendwer;
		this.irgendwie = irgendwie;
	}
	
	public String getIrgendwer() {
		return irgendwer;
	}

	public void setIrgendwer(String irgendwer) {
		this.irgendwer = irgendwer;
	}

	public boolean isIrgendwie() {
		return irgendwie;
	}

	public void setIrgendwie(boolean irgendwie) {
		this.irgendwie = irgendwie;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.getIrgendwer());
		out.writeBoolean(this.isIrgendwie());
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.setIrgendwer((String) in.readObject());
	    this.setIrgendwie(in.readBoolean());
	}
	
	
}
