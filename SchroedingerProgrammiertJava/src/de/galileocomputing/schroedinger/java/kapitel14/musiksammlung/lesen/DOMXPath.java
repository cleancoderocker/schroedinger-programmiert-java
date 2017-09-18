package de.galileocomputing.schroedinger.java.kapitel14.musiksammlung.lesen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class DOMXPath {
	public static void main(String[] args) {
		try (InputStream eingabe = new FileInputStream(new File(
				"resources/kapitel14/musiksammlung.xml"))) {
			DocumentBuilderFactory fabrik = DocumentBuilderFactory.newInstance();
			fabrik.setNamespaceAware(true);
			DocumentBuilder documentBauer = fabrik.newDocumentBuilder();
			Document dokument = documentBauer.parse(eingabe);
			dokument.getDocumentElement().normalize();
			XPathFactory xPathFabrik = XPathFactory.newInstance();
			XPath xPath = xPathFabrik.newXPath();
			xPath.setNamespaceContext(new NamespaceContext() {
				
				@SuppressWarnings("rawtypes")
				@Override
				public Iterator getPrefixes(String namespaceURI) {
					return null;
				}
				
				@Override
				public String getPrefix(String namespaceURI) {
					return null;
				}
				
				@Override
				public String getNamespaceURI(String prefix) {
					if("ms".equals(prefix)) {
						return "http://www.galileocomputing.de/schroedinger/musiksammlung";
					}
		            return null;
				}
			});
			XPathExpression xPathAusdruck = xPath.compile("//*/ms:veroeffentlicht/text()");
			Object result = xPathAusdruck.evaluate(dokument, XPathConstants.NODESET);
			NodeList nodes = (NodeList) result;
			for (int i = 0; i < nodes.getLength(); i++) {
			    System.out.println(nodes.item(i).getNodeValue()); 
			}
		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
			e.printStackTrace();
		}
	}
}
