package com.exceptions;

public class CustomExceptionImpl {
	
	public static void castVote(int age) throws InvalidAgeException {

		if (!(age>=18)) {
			throw new InvalidAgeException(age + " years is not allowed for casting vote");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		castVote(16);
	}

}
