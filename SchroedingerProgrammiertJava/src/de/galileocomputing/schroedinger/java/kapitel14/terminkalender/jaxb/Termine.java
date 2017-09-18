package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * 
 * @author Philip Ackermann
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Termine {
	@XmlAttribute
	private String name;
	
	private List<Termin> termine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Termin> getTermine() {
		if(termine == null) {
			termine = new ArrayList<>();
		}
		return termine;
	}

	public void setTermine(List<Termin> termine) {
		this.termine = termine;
	}
	
	
}
