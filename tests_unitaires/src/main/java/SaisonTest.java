package main.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class SaisonTest {

	@Test
	public void testLibelle() {
		Saison nomSaison = Saison.valueByLibelle("Hiver");
		assertEquals(Saison.HIVER, nomSaison);
	}

	@Test
	public void testLibelleInexistant() throws Exception {
		Saison nomSaison = Saison.valueByLibelle("Test");
		assertNull(nomSaison);
	}

	@Test
	public void testLibelleNull() {
		Saison nomSaison = Saison.valueByLibelle(null);
		assertNull(nomSaison);
	}

}