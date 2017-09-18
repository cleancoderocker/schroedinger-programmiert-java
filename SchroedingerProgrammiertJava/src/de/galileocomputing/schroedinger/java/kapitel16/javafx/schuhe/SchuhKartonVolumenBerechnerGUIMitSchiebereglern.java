package de.galileocomputing.schroedinger.java.kapitel16.javafx.schuhe;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhKartonVolumenBerechnerGUIMitSchiebereglern extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private Label labelHoehe;
	private Label labelBreite;
	private Label labelTiefe;
	private Label labelErgebnis;
	private Slider schiebereglerHoehe;
	private Slider schiebereglerBreite;
	private Slider schiebereglerTiefe;
	private TextField textErgebnis;
	private BerechneErgebnisListener berechneErgebnisListener;
	private Button schaltflaecheLangstiefel;
	private Button schaltflaecheHalbstiefel;
	private Button schaltflaecheKurzstiefel;
	private Button schaltflaecheHalbschuhe;
	private Button schaltflaecheSandalen;
	
	@Override
	public void start(Stage buehne) throws Exception {
		buehne.setTitle("Schuhkarton Volumenberechner");
		this.initialisiereKomponenten();
		this.ordneKomponentenAn(buehne);
		this.registriereListener();
		this.aktualisiereErgebnis();
//		NumberBinding hoeheMalBreite = Bindings.multiply(this.schiebereglerHoehe.valueProperty(), this.schiebereglerBreite.valueProperty());
//		NumberBinding hoheMalBreiteMalTiefe = Bindings.multiply(hoeheMalBreite, this.schiebereglerTiefe.valueProperty());
//		this.textErgebnis.textProperty().bind(Bindings.format("%f", hoheMalBreiteMalTiefe));
        buehne.show();
	}

	
	private void initialisiereKomponenten() {
		this.labelHoehe = new Label("Höhe:");
		this.schiebereglerHoehe = this.erstelleSchieberegler(20, 60);
		this.labelBreite = new Label("Breite:");
		this.schiebereglerBreite = this.erstelleSchieberegler(20, 60);
		this.labelTiefe = new Label("Tiefe:");
		this.schiebereglerTiefe = this.erstelleSchieberegler(40, 100);
		this.labelErgebnis = new Label("Ergebnis:");
		this.textErgebnis = new TextField();
		this.textErgebnis.setEditable(false);
		this.textErgebnis.setDisable(true);
		this.schaltflaecheLangstiefel = new Button("Langstiefel");
		this.schaltflaecheHalbstiefel = new Button("Halbstiefel");
		this.schaltflaecheKurzstiefel = new Button("Kurzstiefel");
		this.schaltflaecheHalbschuhe = new Button("Halbschuhe");
		this.schaltflaecheSandalen = new Button("Sandalen");
	}

	private Slider erstelleSchieberegler(int minimum, int maximum) {
		Slider schieberegler = new Slider();
		schieberegler.setMin(minimum);
		schieberegler.setMax(maximum);
		schieberegler.setShowTickLabels(true);
		schieberegler.setShowTickMarks(true);
		schieberegler.setMinorTickCount(5);
		schieberegler.setMajorTickUnit(10);
		return schieberegler;
	}


	private void ordneKomponentenAn(Stage buehne) {
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(this.labelHoehe, 0, 1);
		grid.add(this.schiebereglerHoehe, 1, 1, 2, 1);
		grid.add(new Label("cm"), 3, 1);
		grid.add(this.labelBreite, 0, 2);
		grid.add(this.schiebereglerBreite, 1, 2, 2, 1);
		grid.add(new Label("cm"), 3, 2);
		grid.add(this.labelTiefe, 0, 3);
		grid.add(this.schiebereglerTiefe, 1, 3, 2, 1);
		grid.add(new Label("cm"), 3, 3);
		grid.add(this.labelErgebnis, 0, 4);
		grid.add(this.textErgebnis, 1, 4, 2, 1);
		grid.add(new Label("cm³"), 3, 4);
		VBox vbox = new VBox();
		vbox.getChildren().add(this.schaltflaecheLangstiefel);
		Insets abstand = new Insets(4, 4, 4, 4);
		VBox.setMargin(this.schaltflaecheLangstiefel, abstand);
		vbox.getChildren().add(this.schaltflaecheHalbstiefel);
		VBox.setMargin(this.schaltflaecheHalbstiefel, abstand);
		vbox.getChildren().add(this.schaltflaecheKurzstiefel);
		VBox.setMargin(this.schaltflaecheKurzstiefel, abstand);
		vbox.getChildren().add(this.schaltflaecheHalbschuhe);
		VBox.setMargin(this.schaltflaecheHalbschuhe, abstand);
		vbox.getChildren().add(this.schaltflaecheSandalen);
		VBox.setMargin(this.schaltflaecheSandalen, abstand);
		grid.add(vbox, 4, 1, 1, 5);
        buehne.setScene(new Scene(grid, 400, 250));
	}
	
	private void aktualisiereErgebnis() {
		double hoehe = this.schiebereglerHoehe.getValue();
		double breite = this.schiebereglerBreite.getValue();
		double tiefe = this.schiebereglerTiefe.getValue();
		double ergebnis = hoehe * breite * tiefe;
		this.textErgebnis.setText(String.valueOf(ergebnis));
	}
	
	private class BerechneErgebnisListener implements ChangeListener<Number> {
		@Override
		public void changed(ObservableValue<? extends Number> observable,
				Number alterWert, Number neuerWert) {
			aktualisiereErgebnis();
		}
	}
	
	private void registriereListener() {
		this.berechneErgebnisListener = new BerechneErgebnisListener();
		this.schiebereglerHoehe.valueProperty().addListener(this.berechneErgebnisListener);
		this.schiebereglerBreite.valueProperty().addListener(this.berechneErgebnisListener);
		this.schiebereglerTiefe.valueProperty().addListener(this.berechneErgebnisListener);
		this.schaltflaecheLangstiefel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				aktualisiereSchieberegler(20, 40, 100);
			}
		});
		this.schaltflaecheHalbstiefel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				aktualisiereSchieberegler(20, 40, 80);
			}
		});
		this.schaltflaecheKurzstiefel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				aktualisiereSchieberegler(20, 40, 60);
			}
		});
		this.schaltflaecheHalbschuhe.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				aktualisiereSchieberegler(20, 40, 40);
			}
		});
		this.schaltflaecheSandalen.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				aktualisiereSchieberegler(20, 20, 40);
			}
		});
	}


	private void aktualisiereSchieberegler(double hoehe, double breite, double tiefe) {
		this.schiebereglerHoehe.setValue(hoehe);
		this.schiebereglerBreite.setValue(breite);
		this.schiebereglerTiefe.setValue(tiefe);
	}

}
