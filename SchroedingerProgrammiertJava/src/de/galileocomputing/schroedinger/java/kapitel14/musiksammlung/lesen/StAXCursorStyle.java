package de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.lesen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class StAXCursorStyle {
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/musiksammlung.xml"))) {
			XMLInputFactory fabrik = XMLInputFactory.newInstance();
			XMLStreamReader xmlStreamLeser = fabrik.createXMLStreamReader(eingabe);
			while (xmlStreamLeser.hasNext()) {
				int eventTyp = xmlStreamLeser.next();
				if(eventTyp == XMLStreamReader.START_ELEMENT){
			        System.out.println(xmlStreamLeser.getLocalName());
			    }
			}
		} catch (XMLStreamException | IOException e) {
			e.printStackTrace();
		}
	}
}
