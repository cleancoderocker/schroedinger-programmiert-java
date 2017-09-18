package de.galileocomputing.schroedinger.java.kapitel16.javafx.schuhe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhKartonVolumenBerechnerGUI extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private Label labelHoehe;
	private Label labelBreite;
	private Label labelTiefe;
	private Label labelErgebnis;
	private TextField textHoehe;
	private TextField textBreite;
	private TextField textTiefe;
	private TextField textErgebnis;
	private Button schaltflaecheBerechnen;
	private Button schaltflaecheLeeren;
	
	@Override
	public void start(Stage buehne) throws Exception {
		buehne.setTitle("Schuhkarton Volumenberechner");
		this.initialisiereKomponenten();
		this.ordneKomponentenAn(buehne);
		this.registriereListener();
        buehne.show();
	}

	
	private void initialisiereKomponenten() {
		this.labelHoehe = new Label("Höhe:");
		this.textHoehe = new ZahlenTextFeld();
		this.labelBreite = new Label("Breite:");
		this.textBreite = new ZahlenTextFeld();
		this.labelTiefe = new Label("Tiefe:");
		this.textTiefe = new ZahlenTextFeld();
		this.labelErgebnis = new Label("Ergebnis:");
		this.textErgebnis = new TextField();
		this.textErgebnis.setEditable(false);
		this.textErgebnis.setDisable(true);
		this.schaltflaecheBerechnen = new Button("Berechnen");
		this.schaltflaecheLeeren = new Button("Leeren");
	}

	private void ordneKomponentenAn(Stage buehne) {
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		grid.add(this.labelHoehe, 0, 1);
		grid.add(this.textHoehe, 1, 1, 2, 1);
		grid.add(new Label("cm"), 3, 1);
		grid.add(this.labelBreite, 0, 2);
		grid.add(this.textBreite, 1, 2, 2, 1);
		grid.add(new Label("cm"), 3, 2);
		grid.add(this.labelTiefe, 0, 3);
		grid.add(this.textTiefe, 1, 3, 2, 1);
		grid.add(new Label("cm"), 3, 3);
		grid.add(this.labelErgebnis, 0, 4);
		grid.add(this.textErgebnis, 1, 4, 2, 1);
		grid.add(new Label("cm³"), 3, 4);
        grid.add(this.schaltflaecheBerechnen, 1, 5);
        grid.add(this.schaltflaecheLeeren, 2, 5);
        Scene szene = new Scene(grid, 300, 250);
        szene.getStylesheets().add("de/galileocomputing/schroedinger/java/kapitel16/javafx/schuhe/styles.css");
        buehne.setScene(szene);
	}
	
	private void registriereListener() {
		this.schaltflaecheBerechnen.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				aktualisiereErgebnis();
			}
		});
		this.schaltflaecheLeeren.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				textHoehe.setText(null);
				textBreite.setText(null);
				textTiefe.setText(null);
			}
		});
	}
	
	private void aktualisiereErgebnis() {
		Integer hoehe = Integer.parseInt(this.textHoehe.getText());
		Integer breite = Integer.parseInt(this.textBreite.getText());
		Integer tiefe = Integer.parseInt(this.textTiefe.getText());
		Integer ergebnis = hoehe * breite * tiefe;
		this.textErgebnis.setText(ergebnis.toString());
	}

}
