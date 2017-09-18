package de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.schreiben;

import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ATTRIBUT_ALBUM_TITEL;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_ALBEN;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_ALBUM;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_KUENSTLER;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_KUENSTLER_NAME;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_MUSIKSAMMLUNG;
import static de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.Konstanten.ELEMENT_VEROEFFENTLICHT;

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
				"resources/kapitel14/musiksammlung_freundin.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.newDocument();
			
			Element musiksammlung = dokument.createElement(ELEMENT_MUSIKSAMMLUNG);
			musiksammlung.setAttributeNS("http://www.w3.org/2000/xmlns/","xmlns","http://www.galileocomputing.de/schroedinger/musiksammlung");
			musiksammlung.setAttributeNS("http://www.w3.org/2000/xmlns/","xmlns:xsi","http://www.w3.org/2001/XMLSchema-instance");
			dokument.appendChild(musiksammlung);
			Element kuenstler = dokument.createElement(ELEMENT_KUENSTLER);
			Element name = dokument.createElement(ELEMENT_KUENSTLER_NAME);
			name.setTextContent("V/A");
			Element alben = dokument.createElement(ELEMENT_ALBEN);
			Element album = dokument.createElement(ELEMENT_ALBUM);
			album.setAttribute(ATTRIBUT_ALBUM_TITEL, "Kuschelrock 24");
			Element erscheinungsjahr = dokument.createElement(ELEMENT_VEROEFFENTLICHT);
			erscheinungsjahr.setTextContent("2010");
			
			kuenstler.appendChild(name);
			musiksammlung.appendChild(kuenstler);
			album.appendChild(erscheinungsjahr);
			alben.appendChild(album);
			kuenstler.appendChild(alben);
			musiksammlung.appendChild(kuenstler);
			
			TransformerFactory transformerFabrik = TransformerFactory.newInstance();
			Transformer transformer = transformerFabrik.newTransformer();
			DOMSource quelle = new DOMSource(dokument);
			StreamResult ziel = new StreamResult(ausgabe);
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			transformer.transform(quelle, ziel);
		} catch (ParserConfigurationException | IOException | TransformerException e) {
			e.printStackTrace();
		}
	}
}
