//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.12 at 02:18:08 PM CEST 
//


package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for termin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="termin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="was" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wann" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
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
    protected String was;
    @XmlElement(required = true)
    protected String wann;
    @XmlElement(required = true)
    protected String wo;

    /**
     * Gets the value of the was property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWas() {
        return was;
    }

    /**
     * Sets the value of the was property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWas(String value) {
        this.was = value;
    }

    /**
     * Gets the value of the wann property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWann() {
        return wann;
    }

    /**
     * Sets the value of the wann property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWann(String value) {
        this.wann = value;
    }

    /**
     * Gets the value of the wo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWo() {
        return wo;
    }

    /**
     * Sets the value of the wo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWo(String value) {
        this.wo = value;
    }

}
