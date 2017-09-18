package de.galileocomputing.schroedinger.java.kapitel14.terminkalender.objekte;



/**
 * 
 * @author Philip Ackermann
 *
 */
public class Terminkalender {

    private Besitzer besitzer;
    private Termine termine;

    public Besitzer getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
    }

	public Termine getTermine() {
		return termine;
	}

	public void setTermine(Termine termine) {
		this.termine = termine;
	}

}
