package de.galileocomputing.schroedinger.java.kapitel16.swing.layouts;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class Taschenrechner {
	public static void main(String[] args) {
		JFrame fenster = new JFrame("Taschenrechner");
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(200, 200);
		fenster.setLayout(new GridLayout(4, 4));
		fenster.getContentPane().add(new JButton("7"));
		fenster.getContentPane().add(new JButton("8"));
		fenster.getContentPane().add(new JButton("9"));
		fenster.getContentPane().add(new JButton("/"));
		fenster.getContentPane().add(new JButton("4"));
		fenster.getContentPane().add(new JButton("5"));
		fenster.getContentPane().add(new JButton("6"));
		fenster.getContentPane().add(new JButton("*"));
		fenster.getContentPane().add(new JButton("1"));
		fenster.getContentPane().add(new JButton("2"));
		fenster.getContentPane().add(new JButton("3"));
		fenster.getContentPane().add(new JButton("-"));
		fenster.getContentPane().add(new JButton("0"));
		fenster.getContentPane().add(new JButton(","));
		fenster.getContentPane().add(new JButton("="));
		fenster.getContentPane().add(new JButton("+"));
		fenster.setVisible(true);
	}
}
