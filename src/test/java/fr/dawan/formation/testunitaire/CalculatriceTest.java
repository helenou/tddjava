package fr.dawan.formation.testunitaire;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatriceTest {

	@Test
	public void test() {
		//throw new RuntimeException("Erreur"); // Error= crash par exception
		//fail("Not yet implemented"); // Failure= échec du test 
		assertEquals(7, Calculatrice.additionne(3,4));
		assertEquals(7, Calculatrice.additionne(-3,40)); // return value1+value2 instead of 7 so FAIL
	}

}
