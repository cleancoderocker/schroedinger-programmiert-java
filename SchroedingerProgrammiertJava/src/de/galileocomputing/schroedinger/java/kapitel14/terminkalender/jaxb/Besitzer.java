package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * @author Philip Ackermann
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "besitzer", propOrder = {
    "name"
})
public class Besitzer {

    @XmlElement(required = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
