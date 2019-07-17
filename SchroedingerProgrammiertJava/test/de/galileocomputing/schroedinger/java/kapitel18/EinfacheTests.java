package de.galileocomputing.schroedinger.java.kapitel18;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
