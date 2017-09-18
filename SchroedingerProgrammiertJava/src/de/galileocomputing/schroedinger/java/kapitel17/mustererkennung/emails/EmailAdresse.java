package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung.emails;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class EmailAdresse {
	private String nutzerName;
	private String domain;
	private String topLevelDomain;

	public EmailAdresse(String nutzerName, String domain, String topLevelDomain) {
		super();
		this.nutzerName = nutzerName;
		this.domain = domain;
		this.topLevelDomain = topLevelDomain;
	}

	@Override
	public String toString() {
		return "EmailAdresse [nutzerName=" + nutzerName + ", domain=" + domain
				+ ", topLevelDomain=" + topLevelDomain + "]";
	}

}
