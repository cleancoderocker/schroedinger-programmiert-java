package de.galileocomputing.schroedinger.java.kapitel14.pflanzen;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Philip Ackermann
 *
 */
@XmlRootElement
public class GewaechsHaus {
	
	private String name;
	
	private List<Pflanze> pflanzen;
	
	public GewaechsHaus() {
		this.pflanzen = new ArrayList<>();
	}
	
	@XmlAttribute(name = "gewaechsHausName", required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElementWrapper(name = "pflanzen")
	@XmlElement(name = "pflanze")
	public List<Pflanze> getPflanzen() {
		return pflanzen;
	}

	public void setPflanzen(List<Pflanze> pflanzen) {
		this.pflanzen = pflanzen;
	}
	
}
