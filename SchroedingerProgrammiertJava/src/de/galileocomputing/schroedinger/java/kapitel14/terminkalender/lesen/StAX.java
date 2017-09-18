package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.lesen;

import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WANN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WAS;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
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
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/terminkalender.xml"))) {
			XMLInputFactory fabrik = XMLInputFactory.newInstance();
			XMLEventReader xmlEventLeser = fabrik.createXMLEventReader(eingabe);
			while (xmlEventLeser.hasNext()) {
				XMLEvent event = xmlEventLeser.nextEvent();
				if(event.isStartElement()) {
					StartElement startElement = event.asStartElement();
					aktuellesElement = startElement.getName().getLocalPart();
				}
				if(event.isCharacters()) {
					Characters charakter = event.asCharacters();
					switch (aktuellesElement) {
					case ELEMENT_WAS:
						System.out.println("Was: " + charakter.getData());
						break;
					case ELEMENT_WANN:
						System.out.println("Wann: " + charakter.getData());
						break;
					case ELEMENT_WO:
						System.out.println("Wo: " + charakter.getData());
						break;
					}
				}
				if(event.isEndElement()) {
					aktuellesElement = "";
				}
			}
		} catch (XMLStreamException | IOException e) {
			e.printStackTrace();
		}
	}
}
