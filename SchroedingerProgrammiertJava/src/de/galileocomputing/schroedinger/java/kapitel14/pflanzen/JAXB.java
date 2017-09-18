package de.galileocomputing.schroedinger.java.kapitel14.pflanzen;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class JAXB {
	public static void main(String[] args) {
		GewaechsHaus gewaechsHaus = new GewaechsHaus();
		gewaechsHaus.setName("Gelbe Pflanzen");
		Pflanze strohblume = new Pflanze();
		strohblume.setName("Strohblume");
		strohblume.setLateinischerName("Helichrysum");
		strohblume.setFarbe("gelb");
		strohblume.setHoehe(30);
		Pflanze johanniskraut = new Pflanze();
		johanniskraut.setName("Johanniskraut");
		johanniskraut.setLateinischerName("Hypericum perforatum");
		johanniskraut.setFarbe("gelb");
		johanniskraut.setHoehe(20);
		gewaechsHaus.getPflanzen().add(strohblume);
		gewaechsHaus.getPflanzen().add(johanniskraut);
		try (OutputStream ausgabe = new FileOutputStream(new File("resources/kapitel14/gewaechshaus.xml"))) {
			JAXBContext jaxbContext = JAXBContext.newInstance(GewaechsHaus.class, Pflanze.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(gewaechsHaus, ausgabe);
			jaxbMarshaller.marshal(gewaechsHaus, System.out);
		} catch (IOException | JAXBException e) {
			e.printStackTrace();
		}
	}
}
