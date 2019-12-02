package fr.dawan.formation.testunitaire;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FibonacciTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{0, 0},
			{1, 1},
			{2, 1},
			{3, 2},
			{4, 3},
			{5, 5},
			{6, 8},
			{7, 13}			
		});
	}
	
	@Parameter(0) // param en index 0
	public int donneeEnEntree;
	@Parameter(1) // param en index 1
	public int donneeEnSortie;
	
	
	@Test
	public void test() {
		assertEquals(donneeEnSortie, Calculatrice.fibonacci(donneeEnEntree));

	}
	
	
	@Test
	public void test2() {
		System.out.println(donneeEnEntree +" " +donneeEnSortie);
	}

}
