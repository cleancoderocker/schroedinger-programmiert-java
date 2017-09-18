package de.galileocomputing.schroedinger.java.kapitel18.cocktails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Apfelsaft;
import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Banane;
import de.galileocomputing.schroedinger.java.kapitel18.cocktails.zutaten.Milch;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class CocktailMixerTest {
	
	private CocktailMixer cocktailMixer;

	@Before
	public void setUp() {
		this.cocktailMixer = new StandardCocktailMixer();
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testeCocktailMixer() throws EkligeZutatenKombinationException {
		Cocktail cocktail = this.cocktailMixer.mixen();
		assertNotNull(cocktail);
	}
	
	@Test
	public void testeAnzahlZutatenInCocktail() throws EkligeZutatenKombinationException {
		Banane banane = new Banane();
		Milch milch = new Milch();
		this.cocktailMixer.hinzufuegen(banane);
		this.cocktailMixer.hinzufuegen(milch);
		assertEquals(2, this.cocktailMixer.getAnzahlZutaten());
		Cocktail cocktail = this.cocktailMixer.mixen();
		assertEquals(0, this.cocktailMixer.getAnzahlZutaten());
		assertEquals(2, cocktail.getAnzahlZutaten());
	}
	
	@SuppressWarnings("unused")
	@Test(expected=EkligeZutatenKombinationException.class)
	public void testeEkligeZutatenKombination() throws EkligeZutatenKombinationException {
		Banane banane = new Banane();
		Apfelsaft apfelsaft = new Apfelsaft();
		this.cocktailMixer.hinzufuegen(banane);
		this.cocktailMixer.hinzufuegen(apfelsaft);
		Cocktail cocktail = this.cocktailMixer.mixen();
	}
	
	@SuppressWarnings("unused")
	@Test
	public void testeEntfernenVonZutaten() throws EkligeZutatenKombinationException {
		Banane banane = new Banane();
		Apfelsaft apfelsaft = new Apfelsaft();
		Milch milch = new Milch();
		this.cocktailMixer.hinzufuegen(banane);
		this.cocktailMixer.hinzufuegen(apfelsaft);
		this.cocktailMixer.hinzufuegen(milch);
		this.cocktailMixer.entfernen(apfelsaft);
		Cocktail cocktail = this.cocktailMixer.mixen();
	}
}
