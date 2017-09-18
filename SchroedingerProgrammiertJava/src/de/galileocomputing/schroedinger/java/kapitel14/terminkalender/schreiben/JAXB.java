package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.schreiben;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Besitzer;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Termin;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Termine;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.Terminkalender;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class JAXB {
	public static void main(String[] args) {
		Terminkalender terminkalender = new Terminkalender();
		Besitzer besitzer = new Besitzer();
		besitzer.setName("Schrödinger");
		Termine termine = new Termine();
		termine.setName("Neue Termine");
		Termin termin = new Termin();
		termin.setWann("20:15");
		termin.setWas("DSDS gucken");
		termin.setWo("Wohnzimmer");
		termine.getTermine().add(termin);
		terminkalender.setTermine(termine);
		terminkalender.setBesitzer(besitzer);
		
		try (OutputStream ausgabe = new FileOutputStream(new File("resources/kapitel14/terminkalender3.xml"))) {
			JAXBContext jaxbContext = JAXBContext.newInstance(Terminkalender.class, Termine.class, Termin.class, Besitzer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(terminkalender, ausgabe);
			jaxbMarshaller.marshal(terminkalender, System.out);
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}
	}
}
