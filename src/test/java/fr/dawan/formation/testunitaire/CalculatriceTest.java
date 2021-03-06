package fr.dawan.formation.testunitaire;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.dawan.formation.testunitaire.exceptions.DivisionParZeroException;

public class CalculatriceTest {

	
	@BeforeClass
	public static void initClass() {
		System.out.println("INITIALISATION");
	}
	
	@BeforeClass
	public static void cleanFinal() {
		System.out.println("Nettoyage Final");
	}
	
	@Before
	public void init() {
		System.out.println("Initialisation avant chaque test");
	}
	
	@After
	public void cleanUp() {
		System.out.println("Nettoyage après chaque test");
	}
	
	@Test
	public void additionTest() {
		System.out.println("additionTest");
		//throw new RuntimeException("Erreur"); // Error= crash par exception
		//fail("Not yet implemented"); // Failure= échec du test 
		
		// Test du cas nominal
		assertEquals(7, Calculatrice.additionne(3,4));
		assertEquals(37, Calculatrice.additionne(-3,40)); // return value1+value2 instead of 7 so FAIL, expect 37 !
		
		
		// Test de valeurs clés
		assertEquals(100000, Calculatrice.additionne(0, 100000));
		
		// tests aux limites
		System.out.println(Integer.MAX_VALUE); // 2147483647
		
		// 1ere solution, corriger le test
		//assertEquals(2147483647,  Calculatrice.additionne(Integer.MAX_VALUE, 1)); // expecting -214748364
		//assertEquals(Integer.MIN_VALUE, Calculatrice.additionne(Integer.MAX_VALUE, 1)); // corrigé
		
		// 2e solution, corriger le code
		assertEquals(2147483648L,  Calculatrice.additionne(Integer.MAX_VALUE, 1)); // Change code return type to long
	}
	
	@Test
	public void divisionTest() {
		System.out.println("divisionTest");
		// Pour l'assertion d'égalité sur des doubles, utiliser un delta (approx du résultat)
		//assertEquals(2.0, 20, 0.01);
		
		assertEquals(2, Calculatrice.divise(6, 3), 0.001);
		assertEquals(-2, Calculatrice.divise(-6, 3), 0.001);
		assertEquals(-3.5, Calculatrice.divise(-7, 2), 0.001);
				
		assertEquals(0, Calculatrice.divise(0, 2), 0.001);
		//assertEquals(Double.POSITIVE_INFINITY, Calculatrice.divise(2, 0), 0.001);
	}
	
	@Test(expected=DivisionParZeroException.class)
	public void divisionParZeroTest() {
		System.out.println("divisionParZeroTest");
		Calculatrice.divise(2, 0);
		
	}
	
	@Test(timeout=10)
	public void divisionTimeOut() throws InterruptedException{
		System.out.println("divisionTimeOutTest");
		Thread.currentThread().sleep(100);
		Calculatrice.divise(2, 0);
		
	}
	

}
