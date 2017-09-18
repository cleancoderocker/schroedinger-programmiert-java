package de.galileocomputing.schroedinger.java.kapitel16.swing.schuhe;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class SchuhKartonVolumenBerechnerGUI2 extends JFrame {
	
	private static final long serialVersionUID = 4260409683725402939L;
	private JLabel labelHoehe;
	private JLabel labelBreite;
	private JLabel labelTiefe;
	private JLabel labelErgebnis;
	private JTextField textHoehe;
	private JTextField textBreite;
	private JTextField textTiefe;
	private JTextField textErgebnis;
	private JButton schaltflaecheBerechnen;
	private JButton schaltflaecheLeeren;
	private NurZahlenVerifier nurZahlenVerifier;
	
	private static class NurZahlenVerifier extends InputVerifier {
	    @Override
	    public boolean verify(JComponent input) {
	        String text = ((JTextField) input).getText();
	        try {
	            Integer.parseInt(text);
	            return true; 
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	}
	
	public SchuhKartonVolumenBerechnerGUI2() {
		super("Schuhkarton Volumenberechner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 200);
		this.initialisiereKomponenten();
		this.ordneKomponentenAn();
		this.registriereListener();
		this.registriereValidatoren();
	}

	private void initialisiereKomponenten() {
		this.labelHoehe = new JLabel("Höhe:");
		this.labelBreite = new JLabel("Breite:");
		this.labelTiefe = new JLabel("Tiefe:");
		this.labelErgebnis = new JLabel("Ergebnis:");
		this.textHoehe = new JTextField();
		this.textBreite = new JTextField();
		this.textTiefe = new JTextField();
		this.textErgebnis = new JTextField();
		this.textErgebnis.setEditable(false);
		this.schaltflaecheBerechnen = new JButton("Berechnen");
		this.schaltflaecheLeeren = new JButton("Leeren");
		this.nurZahlenVerifier = new NurZahlenVerifier();
	}
	
	private void ordneKomponentenAn() {
		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(4, 4, 4, 4);
		
		c.gridx = 0;
		c.gridy = 0;
		this.getContentPane().add(this.labelHoehe, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		this.getContentPane().add(this.textHoehe, c);
		
		c.gridx = 3;
		c.gridy = 0;
		c.gridwidth = 1;
		this.getContentPane().add(new JLabel("cm"), c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		this.getContentPane().add(this.labelBreite, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		this.getContentPane().add(this.textBreite, c);
		
		c.gridx = 3;
		c.gridwidth = 1;
		this.getContentPane().add(new JLabel("cm"), c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 1;
		this.getContentPane().add(this.labelTiefe, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		this.getContentPane().add(this.textTiefe, c);
		
		c.gridx = 3;
		c.gridwidth = 1;
		this.getContentPane().add(new JLabel("cm"), c);
		
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth = 1;
		this.getContentPane().add(this.labelErgebnis, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		this.getContentPane().add(this.textErgebnis, c);
		
		c.gridx = 3;
		c.gridwidth = 1;
		this.getContentPane().add(new JLabel("cm³"), c);
		
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth = 1;
		this.getContentPane().add(this.schaltflaecheBerechnen, c);
		
		c.gridx = 2;
		this.getContentPane().add(this.schaltflaecheLeeren, c);
	}
	
	private void registriereListener() {
		this.schaltflaecheBerechnen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer hoehe = Integer.parseInt(textHoehe.getText());
				Integer breite = Integer.parseInt(textBreite.getText());
				Integer tiefe = Integer.parseInt(textTiefe.getText());
				Integer ergebnis = hoehe * breite * tiefe;
				textErgebnis.setText(ergebnis.toString());
			}
		});
		this.schaltflaecheLeeren.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textHoehe.setText("");
				textBreite.setText("");
				textTiefe.setText("");
			}
		});
	}
	
	private void registriereValidatoren() {
		this.textHoehe.setInputVerifier(this.nurZahlenVerifier);
		this.textBreite.setInputVerifier(this.nurZahlenVerifier);
		this.textTiefe.setInputVerifier(this.nurZahlenVerifier);
	}
}
