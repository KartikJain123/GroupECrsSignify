/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SINGIFY
 *
 */
public class NoApprovedStudentsException extends Exception {

	/**
	 * /*
		Method NoApprovedStudentsException
		
	
	*/
	 */
	//Exception raise when no students are approved by admin
	public NoApprovedStudentsException() {
		// TODO Auto-generated constructor stub
		super();
		//Message returned when com.signify.exception is thrown
		 
		System.out.println("There are no approved students yet.");
	}

}
