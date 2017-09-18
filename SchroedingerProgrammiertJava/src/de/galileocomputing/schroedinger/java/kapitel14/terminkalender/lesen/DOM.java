package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.lesen;

import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_TERMIN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WANN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WAS;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class DOM {
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/terminkalender.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.parse(eingabe);
			dokument.getDocumentElement().normalize();
			NodeList termine = dokument.getElementsByTagName(ELEMENT_TERMIN);
			for (int i = 0; i < termine.getLength(); i++) {
				Node knoten = termine.item(i);
				if (knoten.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) knoten;
					Element was = (Element) element.getElementsByTagName(ELEMENT_WAS).item(0);
					Element wann = (Element) element.getElementsByTagName(ELEMENT_WANN).item(0);
					Element wo = (Element) element.getElementsByTagName(ELEMENT_WO).item(0);
					System.out.println("Was : " + was.getTextContent());
					System.out.println("Wann : " + wann.getTextContent());
					System.out.println("Wo : " + wo.getTextContent());
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
}
