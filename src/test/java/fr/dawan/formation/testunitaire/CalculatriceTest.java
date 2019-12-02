package fr.dawan.formation.testunitaire;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest {

	@Test
	public void test() {
		//throw new RuntimeException("Erreur"); // Error= crash par exception
		//fail("Not yet implemented"); // Failure= échec du test 
		
		// Test du cas nominal
		assertEquals(7, Calculatrice.additionne(3,4));
		assertEquals(37, Calculatrice.additionne(-3,40)); // return value1+value2 instead of 7 so FAIL, expect 37 !
		
		
		// Test de valeurs clés
		assertEquals(100000, Calculatrice.additionne(0, 100000));
		
		// tests aux limites
		System.out.println(Integer.MAX_VALUE); // 2147483647
		assertEquals(2147483647,  Calculatrice.additionne(Integer.MAX_VALUE, 1)); // -2147483648
		
	}

}
