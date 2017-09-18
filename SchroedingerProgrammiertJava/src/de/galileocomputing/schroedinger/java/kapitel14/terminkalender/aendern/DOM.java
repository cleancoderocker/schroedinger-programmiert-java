package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.aendern;

import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_TERMIN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_TERMINE;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WANN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WAS;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
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
				"resources/kapitel14/terminkalender.xml"));
			OutputStream ausgabe = new FileOutputStream(new File(
				"resources/kapitel14/terminkalender_geaendert.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.parse(eingabe);
			dokument.getDocumentElement().normalize();
			NodeList termine = dokument.getElementsByTagName(ELEMENT_TERMINE);
			if(termine.getLength() > 0) {
				Element neuerTermin = dokument.createElement(ELEMENT_TERMIN);
				Element was = dokument.createElement(ELEMENT_WAS);
				was.setTextContent("Mit DOM-API Musiksammlung von deiner Freundin als XML-Dokument erstellen.");
				Element wann = dokument.createElement(ELEMENT_WANN);
				wann.setTextContent("Sofort");
				Element wo = dokument.createElement(ELEMENT_WO);
				wo.setTextContent("Werkstatt");
				neuerTermin.appendChild(was);
				neuerTermin.appendChild(wann);
				neuerTermin.appendChild(wo);
				termine.item(0).appendChild(neuerTermin);
			}
			TransformerFactory transformerFabrik = TransformerFactory.newInstance();
			Transformer transformer = transformerFabrik.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource quelle = new DOMSource(dokument);
			StreamResult ziel = new StreamResult(ausgabe);
			transformer.transform(quelle, ziel);
		} catch (ParserConfigurationException | SAXException | IOException | TransformerException e) {
			e.printStackTrace();
		}
	}
}
