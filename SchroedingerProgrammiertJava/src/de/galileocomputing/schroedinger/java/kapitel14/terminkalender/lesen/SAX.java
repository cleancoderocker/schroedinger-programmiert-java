package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.lesen;

import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WANN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WAS;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WO;

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
		
		@Override
		public void startElement(String uri, String localName,
				String qName, Attributes attributes)
				throws SAXException {
			this.aktuellesElement = qName;
		}

		@Override
		public void characters(char[] character, int start, int laenge)
				throws SAXException {
			switch (this.aktuellesElement) {
			case ELEMENT_WAS:
				System.out.println("Was: " + String.valueOf(character, start, laenge).trim());
				break;
			case ELEMENT_WANN:
				System.out.println("Wann: " + String.valueOf(character, start, laenge).trim());
				break;
			case ELEMENT_WO:
				System.out.println("Wo: " + String.valueOf(character, start, laenge).trim());
				break;
			}
		}

		@Override
		public void endElement(String uri, String localName,
				String qName) throws SAXException {
			this.aktuellesElement = "";
		}
	}
	
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/terminkalender.xml"))) {
			SAXParserFactory fabrik = SAXParserFactory.newInstance();
			SAXParser saxParser = fabrik.newSAXParser();
			DefaultHandler handler = new MusikSammlungHandler();
			saxParser.parse(eingabe, handler);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
