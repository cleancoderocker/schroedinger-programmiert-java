package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * @author Philip Ackermann
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "besitzer",
    "termine"
})
@XmlRootElement(name = "terminkalender")
public class Terminkalender {

    @XmlElement(required = true)
    private Besitzer besitzer;
    @XmlElement(required = true)
    private Termine termine;

    public Besitzer getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Besitzer value) {
        this.besitzer = value;
    }

	public Termine getTermine() {
		return termine;
	}

	public void setTermine(Termine termine) {
		this.termine = termine;
	}

}
