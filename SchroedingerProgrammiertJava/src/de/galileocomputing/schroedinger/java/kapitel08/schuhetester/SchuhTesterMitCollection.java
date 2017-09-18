package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

import java.util.Collection;
import java.util.Collections;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhTesterMitCollection implements SolcheSchuheHastDuSchonTester
{
    private Collection<SchuhPaar> schuhKollektion;
    
    public SchuhTesterMitCollection(
            Collection<SchuhPaar> schuhKollektion)
    {
        this.schuhKollektion = schuhKollektion;
    }

    @Override
    public void addSchuhPaar(SchuhPaar schuhPaar)
    {
        this.schuhKollektion.add(schuhPaar);
    }
    
    @Override
    public Collection<SchuhPaar> getSchuhKollektion()
    {
        return Collections.unmodifiableCollection(schuhKollektion);
    }

    @Override
    public boolean hastDuSchon(SchuhPaar schuhPaar)
    {
        return this.getSchuhKollektion().contains(schuhPaar);
    }
    
}
