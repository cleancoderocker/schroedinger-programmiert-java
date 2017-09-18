package de.galileocomputing.schroedinger.java.kapitel16.swing.layouts;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Login {
	public static void main(String[] args) {
		JFrame fenster = new JFrame("Login");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(290, 170);
		fenster.setLayout(new GridBagLayout());
		JLabel labelName = new JLabel("Name:");
		JLabel labelPasswort = new JLabel("Passwort:");
		JTextField feldName = new JTextField();
		JPasswordField feldPasswort = new JPasswordField();
		JButton schaltflaecheOk = new JButton("Ok");
		JButton schaltflaecheAbbrechen = new JButton("Abbrechen");
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets(4, 4, 4, 4);
		c.gridx = 0;
		c.gridy = 0;
		fenster.getContentPane().add(labelName, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		fenster.getContentPane().add(feldName, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		fenster.getContentPane().add(labelPasswort, c);
		
		c.gridx = 1;
		c.gridwidth = 2;
		fenster.getContentPane().add(feldPasswort, c);
		
		c.gridy = 2;
		c.gridwidth = 1;
		fenster.getContentPane().add(schaltflaecheOk, c);
		
		c.gridx = 2;
		c.gridy = 2;
		fenster.getContentPane().add(schaltflaecheAbbrechen, c);
		fenster.setVisible(true);
	}
}
