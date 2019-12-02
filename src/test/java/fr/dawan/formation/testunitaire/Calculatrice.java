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

}
