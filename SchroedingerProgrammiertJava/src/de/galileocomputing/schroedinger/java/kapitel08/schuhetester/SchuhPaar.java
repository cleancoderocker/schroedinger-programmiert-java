package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhPaar implements Comparable<SchuhPaar>
{
    private int groesse;
    private String farbe;
    private boolean mitStoeckeln;
    
    public SchuhPaar(int groesse, String farbe, boolean mitStoeckeln)
    {
        this.groesse = groesse;
        this.farbe = farbe;
        this.mitStoeckeln = mitStoeckeln;
    }
    public int getGroesse()
    {
        return groesse;
    }
    public String getFarbe()
    {
        return farbe;
    }
    public boolean isMitStoeckeln()
    {
        return mitStoeckeln;
    }

    @Override
    public boolean equals(Object object)
    {
        boolean equals = false;
        if(object instanceof SchuhPaar) {
            SchuhPaar schuhe = (SchuhPaar) object;
            equals = schuhe.getFarbe().equals(this.getFarbe())
                    && schuhe.getGroesse() == this.getGroesse()
                    && schuhe.isMitStoeckeln() == this.isMitStoeckeln();
        }
        return equals;
    }
    
    @Override
    public String toString()
    {
        return this.getGroesse() + " " + this.getFarbe() + (this.isMitStoeckeln() ? " mit Stöckeln" : " ohne Stöckel");
    }
    
    @Override
    public int hashCode()
    {
        return this.getGroesse() + this.getFarbe().hashCode();
    }
    
    @Override
    public int compareTo(SchuhPaar schuhPaar)
    {
    	int result = 0;
    	int groessenVergleich = Integer.valueOf(this.getGroesse()).compareTo(schuhPaar.getGroesse());
    	int farbenVergleich = this.getFarbe().compareTo(schuhPaar.getFarbe());
    	int stoeckelVergleich = Boolean.valueOf(this.isMitStoeckeln()).compareTo(schuhPaar.isMitStoeckeln());
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
