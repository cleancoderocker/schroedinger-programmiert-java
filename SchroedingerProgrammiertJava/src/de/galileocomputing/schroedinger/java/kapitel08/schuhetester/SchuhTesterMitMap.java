package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhTesterMitMap extends SchuhTesterMitCollection implements SovieleSchuheHastDuSchonTester {

    private Map<SchuhPaar, Integer> schuhMappe;
    
    public SchuhTesterMitMap(Collection<SchuhPaar> schuhKollektion, Map<SchuhPaar, Integer> schuhMappe)
    {
    	super(schuhKollektion);
        this.schuhMappe = schuhMappe;
    }

    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar)
    {
    	super.addSchuhPaar(schuhPaar);
        Integer anzahlGleicherSchuhe = this.soVieleHastDuSchon(schuhPaar);
        this.schuhMappe.put(schuhPaar, anzahlGleicherSchuhe + 1);            
    }

    @Override
    public int soVieleHastDuSchon(SchuhPaar neueSchuhe)
    {
    	Integer anzahl = this.schuhMappe.get(neueSchuhe);
        return anzahl == null ? 0 : anzahl;
    }

}
