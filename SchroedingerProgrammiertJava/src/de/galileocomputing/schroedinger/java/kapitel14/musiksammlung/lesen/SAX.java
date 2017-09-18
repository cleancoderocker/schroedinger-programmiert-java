package de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.lesen;

import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ATTRIBUT_ALBUM_TITEL;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_ALBUM;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_KUENSTLER_NAME;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_VEROEFFENTLICHT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class SAX {
	
	private static class MusikSammlungHandler extends DefaultHandler {
		private String aktuellesElement = "";
		private int albenAnzahl;
		
		@Override
		public void startDocument() throws SAXException {
			System.out.println("Musiksammlung");
			this.albenAnzahl = 0;
		}
		
		@Override
		public void startElement(String uri, String localName,
				String qName, Attributes attributes)
				throws SAXException {
			this.aktuellesElement = qName;
			if (ELEMENT_ALBUM.equals(this.aktuellesElement)) {
				System.out.println("Titel: " + attributes.getValue(ATTRIBUT_ALBUM_TITEL));
				this.albenAnzahl++;
			}
		}

		@Override
		public void characters(char[] character, int start, int laenge)
				throws SAXException {
			switch (this.aktuellesElement) {
			case ELEMENT_KUENSTLER_NAME:
				System.out.println("Künstler: " + String.valueOf(character, start, laenge).trim());
				break;
			case ELEMENT_VEROEFFENTLICHT:
				System.out.println("Veröffentlicht: " + String.valueOf(character, start, laenge).trim());
				break;
			}
		}

		@Override
		public void endElement(String uri, String localName,
				String qName) throws SAXException {
			this.aktuellesElement = "";
		}
		
		@Override
		public void endDocument() throws SAXException {
			System.out.println("Alben insgesamt: " + albenAnzahl);
		}
	}
	
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/musiksammlung.xml"))) {
			SAXParserFactory fabrik = SAXParserFactory.newInstance();
			SAXParser saxParser = fabrik.newSAXParser();
			DefaultHandler handler = new MusikSammlungHandler();
			saxParser.parse(eingabe, handler);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
