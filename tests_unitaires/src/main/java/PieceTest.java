package main.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class PieceTest {

	@Test
	public void testPieceNull() {
		Maison maison = new Maison();
		maison.ajouterPiece(null);
		assertEquals(null, maison.getPieces()[0]);
	}
	
	@Test 
	public void testSuperficieNegative() {
		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(0, -9.5));
	}

}