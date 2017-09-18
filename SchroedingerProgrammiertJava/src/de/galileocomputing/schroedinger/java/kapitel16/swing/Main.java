package de.galileocomputing.schroedinger.java.kapitel16.swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Main {
	public static void main(String[] args) {
		JFrame fenster = new JFrame("Schrödingers GUI");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(240, 80);
		fenster.setLayout(new GridLayout(1, 2));
		JButton schaltflaeche = new JButton("Drück mich");
		fenster.getContentPane().add(schaltflaeche);
		final JLabel label = new JLabel("Hallo Schrödinger");
		Container fensterScheibe = fenster.getContentPane();
		fensterScheibe.add(label);
		schaltflaeche.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
            {
				label.setText("Danke");
            }
        });
		fenster.setVisible(true);
	}
}
