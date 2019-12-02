package fr.dawan.formation.testunitaire.exceptions;

public class DivisionParZeroException extends RuntimeException {

	public DivisionParZeroException() {
		super("la division par zéro est interdite !");
	}

	@Override
	public String getMessage() {
		
		return super.getMessage();
	}

}
