package de.galileocomputing.schroedinger.java.kapitel14.pflanzen;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Philip Ackermann
 *
 */
@XmlType(propOrder = {
		  "name",
		  "lateinischerName",
		  "farbe", 
		  "hoehe"
		})
public class Pflanze {
	private String name;
	private String lateinischerName;
	private String farbe;
	private double hoehe;

	@XmlElement(required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(required = true)
	public String getLateinischerName() {
		return lateinischerName;
	}

	public void setLateinischerName(String lateinischerName) {
		this.lateinischerName = lateinischerName;
	}

	@XmlElement(required = true)
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	@XmlElement(required = true)
	public double getHoehe() {
		return hoehe;
	}

	public void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	
	
}
