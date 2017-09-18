package de.galileocomputing.schroedinger.java.kapitel11.serialization.krieger;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class ZwergenKrieger extends Krieger implements Serializable {

	private static final long serialVersionUID = 1129788795256789713L;
	
	private double groesse;
	
	public ZwergenKrieger(String name, int erfahrung, double groesse) {
		super(name, erfahrung);
		this.groesse = groesse;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		out.writeObject(this.getName());
		out.writeInt(this.getErfahrung());
	}

	private void readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		in.defaultReadObject();
		this.setName((String) in.readObject());
	    this.setErfahrung(in.readInt());
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

}
