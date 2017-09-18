package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.schreiben;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.generiert.Besitzer;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.generiert.ObjectFactory;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.generiert.Termin;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.generiert.Termine;
import de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb.generiert.Terminkalender;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class JAXBMitGeneriertenKlassen {
	public static void main(String[] args) {
		ObjectFactory objektFabrik = new ObjectFactory();
		Terminkalender terminkalender = objektFabrik.createTerminkalender();
		Besitzer besitzer = objektFabrik.createBesitzer();
		besitzer.setName("Schrödinger");
		Termine termine = objektFabrik.createTermine();
		termine.setName("Neue Termine");
		Termin termin = objektFabrik.createTermin();
		termin.setWann("20:15");
		termin.setWas("DSDS gucken");
		termin.setWo("Wohnzimmer");
		termine.getTermin().add(termin);
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
