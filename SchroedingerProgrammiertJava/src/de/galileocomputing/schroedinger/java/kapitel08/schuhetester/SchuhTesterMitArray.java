package de.galileocomputing.schroedinger.java.kapitel08.schuhetester;

import java.util.Arrays;
import java.util.Collection;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class SchuhTesterMitArray implements
		SolcheSchuheHastDuSchonTester {
	
	private SchuhPaar[] schuhe;
	
	private int schuhZaehler = 0;

	public SchuhTesterMitArray() {
		this.schuhe = new SchuhPaar[20];
	}

	@Override
	public void addSchuhPaar(SchuhPaar schuhe) {
		if (this.schuhZaehler >= this.schuhe.length) {
//			SchuhPaar[] schuhKopien = new SchuhPaar[this.schuhe.length + 20];
//			for (int i=0; i<this.schuhe.length; i++) {
//				schuhKopien[i] = this.schuhe[i];
//			}
//			this.schuhe = schuhKopien;
			this.schuhe = Arrays.copyOf(this.schuhe, this.schuhe.length + 20);
		}
		if (this.schuhZaehler < this.schuhe.length) {
			this.schuhe[this.schuhZaehler] = schuhe;
			this.schuhZaehler++;
		}
	}

	@Override
	public boolean hastDuSchon(SchuhPaar neueSchuhe) {
		boolean hastDuSchon = false;
		for (SchuhPaar schuhe : this.schuhe) {
			if (schuhe != null && schuhe.equals(neueSchuhe)) {
				hastDuSchon = true;
			}
		}
		return hastDuSchon;
	}

	@Override
	public Collection<SchuhPaar> getSchuhKollektion() {
		return Arrays.asList(this.schuhe);
	}
}
