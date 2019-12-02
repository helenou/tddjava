package fr.dawan.formation.testunitaire;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	
	@Test
	public void test() {
		assertEquals(1, Calculatrice.fibonacci(1));
		assertEquals(1, Calculatrice.fibonacci(2));
		assertEquals(2, Calculatrice.fibonacci(3));
		assertEquals(3, Calculatrice.fibonacci(4));
		assertEquals(5, Calculatrice.fibonacci(5));
		assertEquals(8, Calculatrice.fibonacci(6));
		assertEquals(13, Calculatrice.fibonacci(7));
	}

}
