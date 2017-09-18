package de.galileocomputing.schroedinger.java.kapitel10.kartons;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhPaar {
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
}
