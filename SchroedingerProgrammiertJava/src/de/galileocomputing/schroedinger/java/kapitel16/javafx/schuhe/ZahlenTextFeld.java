package de.galileocomputing.schroedinger.java.kapitel16.javafx.schuhe;

import javafx.scene.control.TextField;

/**
 * 
 * @author Philip Ackermann
 * 
 */
public class ZahlenTextFeld extends TextField {

	@Override
	public void replaceText(int start, int end, String text) {
		if (this.istZahl(text)) {
			super.replaceText(start, end, text);
		}
	}

	@Override
	public void replaceSelection(String text) {
		if (this.istZahl(text)) {
			super.replaceSelection(text);
		}
	}

	private boolean istZahl(String text) {
		return text.matches("[0-9]*");
	}

}
