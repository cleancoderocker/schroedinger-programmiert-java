package de.galileocomputing.schroedinger.java.kapitel18;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * @author Philip Ackermann
 *
 */
public class EinfacheTests {
	@Test
	public void ganzEinfacherTest() {
		assertEquals("Schuhe", "Schuhe");
		assertTrue(2 == 2);
		assertFalse(2 == 7);
		assertNotNull("Zwei");
		assertNull(null);
	}
	
	@Test
	public void nochEinTest() {
		String a = "Schrö";
		String b = "dinger";
		String name = a + b;
		assertEquals("Schrödinger", name);
	}
}
