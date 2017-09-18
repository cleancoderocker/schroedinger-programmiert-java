package de.galileocomputing.schroedinger.java.kapitel12.wow.forkjoin;

import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class KampfAktion extends RecursiveAction {

	private static final long serialVersionUID = -6813393357672133394L;
	private int MAX_ANZAHL_FEINDE = 6;
	private List<Feind> feinde;

	public KampfAktion(List<Feind> feinde) {
		this.feinde = feinde;
	}

	@Override
	protected void compute() {
		if (this.feinde.size() < MAX_ANZAHL_FEINDE) {
			kaempfeSelber();
		} else {
			System.out.printf("%s: \"%d Feinde, das ist mir zuviel, hilf mir einer!\"%n", Thread.currentThread().getName(), this.feinde.size());
			int mitte = this.feinde.size() / 2;
			List<Feind> eineHaelfteDerFeinde = this.feinde.subList(0, mitte);
			List<Feind> andereHaelfteDerFeinde = this.feinde.subList(mitte, this.feinde.size());
			KampfAktion kampfAktionEineHaelfteDerFeinde = new KampfAktion(eineHaelfteDerFeinde);
			KampfAktion kampfAktionAndereHaelfteDerFeinde = new KampfAktion(andereHaelfteDerFeinde);
			kampfAktionEineHaelfteDerFeinde.fork();
			kampfAktionAndereHaelfteDerFeinde.invoke();
			kampfAktionEineHaelfteDerFeinde.join();
//			invokeAll(kampfAktionEineHaelfteDerFeinde, kampfAktionAndereHaelfteDerFeinde);
		}
	}

	protected void kaempfeSelber() {
		for(int i=0; i<MAX_ANZAHL_FEINDE && i<this.feinde.size(); i++) {
			System.out.printf("%s: \"%d Feinde, die erledige ich mit links!\"%n", Thread.currentThread().getName(), this.feinde.size());
			try {
				Thread.sleep(5);
			} catch (InterruptedException exception) {
			}
			System.out.printf("%s: \"%s, zack!\"%n", Thread.currentThread().getName(), this.feinde.get(i).getName());
		}
	}

}
