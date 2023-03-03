/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public class StudentNotApprovedException extends Exception{
	public  StudentNotApprovedException (String studentName)
	{
		super();
		/**
		 * Message returned when com.signify.exception is thrown
		 */
		 System.out.println("Student Not Approved "+studentName);
	}
}
