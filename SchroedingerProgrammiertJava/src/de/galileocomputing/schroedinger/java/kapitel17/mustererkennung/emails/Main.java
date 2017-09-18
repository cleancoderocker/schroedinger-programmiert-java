package de.galileocomputing.schroedinger.java.kapitel17.mustererkennung.emails;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		EmailAdresse emailAdresse = EmailAdressenFabrik.erstelleEmailAdresse("schroedinger@galileocomputing.de");
		EmailAdresse emailAdresse2 = EmailAdressenFabrik.erstelleEmailAdresse("schroedinger.java@galileocomputing.de");
		System.out.println(emailAdresse);
		System.out.println(emailAdresse2);
	}
}
