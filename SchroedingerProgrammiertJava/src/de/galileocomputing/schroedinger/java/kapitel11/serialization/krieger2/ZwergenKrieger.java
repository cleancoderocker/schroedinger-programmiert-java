package de.galileocomputing.schroedinger.java.kapitel11.serialization.krieger2;

import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class ZwergenKrieger extends Krieger {

	private static final long serialVersionUID = 8890627396502774290L;

	public ZwergenKrieger(String name, int erfahrung) {
		super(name, erfahrung);
	}
	
    private void writeObject(ObjectOutputStream out) throws IOException {
    	throw new NotSerializableException();
    }

    private void readObject(ObjectInputStream in) 
	throws IOException, ClassNotFoundException {
    	throw new NotSerializableException();
    }

}
