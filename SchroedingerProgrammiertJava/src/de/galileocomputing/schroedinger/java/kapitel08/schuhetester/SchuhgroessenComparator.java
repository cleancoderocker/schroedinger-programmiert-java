package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

import java.util.Comparator;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhgroessenComparator implements Comparator<SchuhPaar> {

	@Override
	public int compare(SchuhPaar schuhe, SchuhPaar schuhe2) {
		int result = 0;
		if(schuhe == null || schuhe2 == null) {
			return result;
		}
    	int groessenVergleich = Integer.valueOf(schuhe.getGroesse()).compareTo(schuhe2.getGroesse());
    	int farbenVergleich = schuhe.getFarbe().compareTo(schuhe2.getFarbe());
    	int stoeckelVergleich = Boolean.valueOf(schuhe.isMitStoeckeln()).compareTo(schuhe2.isMitStoeckeln());
    	if(groessenVergleich != 0) {
    		result = groessenVergleich;
    	} else if(farbenVergleich != 0) {
    		result = farbenVergleich;
    	} else if(stoeckelVergleich != 0) {
    		result = stoeckelVergleich;
    	}
    	return result;
	}

}
