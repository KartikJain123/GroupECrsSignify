/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public class RegistrationFailedException extends Exception{

	/**
	 *  Message returned when com.signify.exception is thrown
	 */
	public RegistrationFailedException(String message) {
		// TODO Auto-generated constructor stub
		System.out.println("Registration failed due to "+message);
	}

}
