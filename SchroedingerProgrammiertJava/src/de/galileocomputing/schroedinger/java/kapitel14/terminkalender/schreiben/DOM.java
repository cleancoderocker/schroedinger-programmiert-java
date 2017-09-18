package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.schreiben;


import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ATTRIBUT_TERMINE_NAME;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_BESITZER;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_BESITZER_NAME;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_TERMIN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_TERMINE;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_TERMINKALENDER;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WANN;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WAS;
import static de.galileocomputing.schroedinger.java.kapitel14.terminkalender.Konstanten.ELEMENT_WO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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

/**
 * 
 * @author Philip Ackermann
 *
 */
public class DOM {
	public static void main(String[] args) {
		try (OutputStream ausgabe = new FileOutputStream(new File(
				"resources/kapitel14/terminkalender2.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.newDocument();
			Element terminkalender = dokument.createElement(ELEMENT_TERMINKALENDER);
			terminkalender.setAttribute("xmlns","http://www.galileocomputing.de/schroedinger/terminkalender");
			terminkalender.setAttribute("xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
			dokument.appendChild(terminkalender);
			
			Element besitzer = dokument.createElement(ELEMENT_BESITZER);
			Element name = dokument.createElement(ELEMENT_BESITZER_NAME);
			name.setTextContent("Schrödinger");
			Element termine = dokument.createElement(ELEMENT_TERMINE);
			termine.setAttribute(ATTRIBUT_TERMINE_NAME, "Wichtige Termine");
			Element termin = dokument.createElement(ELEMENT_TERMIN);
			Element was = dokument.createElement(ELEMENT_WAS);
			was.setTextContent("Mit DOM-API Musiksammlung von deiner Freundin als XML-Dokument erstellen.");
			Element wann = dokument.createElement(ELEMENT_WANN);
			wann.setTextContent("Sofort");
			Element wo = dokument.createElement(ELEMENT_WO);
			wo.setTextContent("Werkstatt");
			
			besitzer.appendChild(name);
			terminkalender.appendChild(besitzer);
			termin.appendChild(was);
			termin.appendChild(wann);
			termin.appendChild(wo);
			termine.appendChild(termin);
			terminkalender.appendChild(termine);
			
			TransformerFactory transformerFabrik = TransformerFactory.newInstance();
			Transformer transformer = transformerFabrik.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource quelle = new DOMSource(dokument);
			StreamResult ziel = new StreamResult(ausgabe);
			transformer.transform(quelle, ziel);
		} catch (ParserConfigurationException | IOException | TransformerException e) {
			e.printStackTrace();
		}
	}
}
