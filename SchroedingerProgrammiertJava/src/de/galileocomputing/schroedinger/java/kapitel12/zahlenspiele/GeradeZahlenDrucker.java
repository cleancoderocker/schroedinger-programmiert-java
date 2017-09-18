package de.galileocomputing.schroedinger.java.kapitel12.zahlenspiele;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class GeradeZahlenDrucker extends AbstractZahlenDrucker {

	public GeradeZahlenDrucker(int grenze) {
		super(grenze);
	}

	@Override
	protected boolean akzeptiereZahl(int zahl) {
		return zahl%2==0;
	}

}
