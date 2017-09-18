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
@XmlType(name = "termin", propOrder = {
    "was",
    "wann",
    "wo"
})
public class Termin {

    @XmlElement(required = true)
    private String was;
    @XmlElement(required = true)
    private String wann;
    @XmlElement(required = true)
    private String wo;

    public String getWas() {
        return was;
    }

    public void setWas(String was) {
        this.was = was;
    }

    public String getWann() {
        return wann;
    }

    public void setWann(String wann) {
        this.wann = wann;
    }

    public String getWo() {
        return wo;
    }

    public void setWo(String wo) {
        this.wo = wo;
    }

}
