package de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.lesen;

import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ATTRIBUT_ALBUM_TITEL;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_ALBUM;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_KUENSTLER_NAME;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_VEROEFFENTLICHT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class StAX {

	public static void main(String[] args) {
		String aktuellesElement = "";
		int albenAnzahl = 0;
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/musiksammlung.xml"))) {
			XMLInputFactory fabrik = XMLInputFactory.newInstance();
			XMLEventReader xmlEventLeser = fabrik.createXMLEventReader(eingabe);
			while (xmlEventLeser.hasNext()) {
				XMLEvent event = xmlEventLeser.nextEvent();
				if(event.isStartDocument()) {
					albenAnzahl = 0;
					System.out.println("Musiksammlung");
				} else if(event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					aktuellesElement = startElement.getName().getLocalPart();
					if(ELEMENT_ALBUM.equals(aktuellesElement)) {
						@SuppressWarnings("unchecked")
						Iterator<Attribute> attribute = startElement.getAttributes();
				        while (attribute.hasNext()) {
				        	Attribute attribut = attribute.next();
			        		if (ATTRIBUT_ALBUM_TITEL.equals(attribut.getName().toString())) {
			        			System.out.println("Titel: " + attribut.getValue());
			        			albenAnzahl++;
			        		}
				        }
					}
				} else if(event.isCharacters()) {
					Characters charakter = event.asCharacters();
					switch (aktuellesElement) {
					case ELEMENT_KUENSTLER_NAME:
						System.out.println("Künstler: " + charakter.getData());
						break;
					case ELEMENT_VEROEFFENTLICHT:
						System.out.println("Veröffentlicht: " + charakter.getData());
						break;
					}
				} else if(event.isEndElement()) {
					aktuellesElement = "";
				} else if(event.isEndDocument()) {
					System.out.println("Alben insgesamt: " + albenAnzahl);
					xmlEventLeser.close();
				}
			}
		} catch (XMLStreamException | IOException e) {
			e.printStackTrace();
		}
	}
}
