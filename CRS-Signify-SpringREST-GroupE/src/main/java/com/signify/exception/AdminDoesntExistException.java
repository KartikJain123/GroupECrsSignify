/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public class AdminDoesntExistException extends Exception{
//Exception to raise when the given admin doesnot exist
	/*
		Method AdminDoesntExistException
	
	*/
	public AdminDoesntExistException() {
		super();
		//Message returned when com.signify.exception is thrown
		 
		System.out.println("This user ID does not have admin access.");
	}
}
