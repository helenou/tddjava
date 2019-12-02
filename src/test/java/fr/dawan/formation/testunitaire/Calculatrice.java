package fr.dawan.formation.testunitaire;

import fr.dawan.formation.testunitaire.exceptions.DivisionParZeroException;

public class Calculatrice {

	public static long additionne(int value1, int value2) {
		
		return (long)value1 +value2; // caster l'une des deux valeurs, pas les 2.
	}
	
	public static double divise(int value1, int value2) {
		if(value2 == 0) {
			throw new DivisionParZeroException();
		}
		return (double)value1 / value2;
		
	}
	
	// Returns 0, 1, 1, 2, 3, 5, 8, 13
	// f(n) = f(n-1) + f(n-2)
	
	// f(0)=0; f(1)=1; // exceptions
	public static int fibonacci(int n) {
		int resultat= 0;
		
		if(n <= 1) {
			resultat = n;
		}else {
			resultat = fibonacci(n-1) + fibonacci(n-2);
		}
	
		return resultat;
		
	}

}
