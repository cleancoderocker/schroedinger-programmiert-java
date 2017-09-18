package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung.emails;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class EmailAdressenFabrik {
	private static String EMAIL_MUSTER_STRING = "^([a-z0-9_\\.\\-]+)@([a-z0-9_\\.\\-]+)\\.([a-z\\.]{2,6})$";
	private static Pattern EMAIL_MUSTER = Pattern.compile(EMAIL_MUSTER_STRING);

	public static EmailAdresse erstelleEmailAdresse(String eingabe) {
		EmailAdresse emailAdresse = null;
		Matcher matcher = EMAIL_MUSTER.matcher(eingabe);
		if (matcher.matches()) {
			String nutzerName = matcher.group(1);
			String domain = matcher.group(2);
			String topLevelDomain = matcher.group(3);
			emailAdresse = new EmailAdresse(nutzerName, domain, topLevelDomain);
		} else {
			// Exception werfen
		}
		return emailAdresse;
	}
}
