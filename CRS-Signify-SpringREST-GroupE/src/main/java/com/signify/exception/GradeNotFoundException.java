/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public class GradeNotFoundException extends Exception{
	/*
		Method GradeNotFoundException
		
	
	*/
	
//com.signify.exception raise when professor tries to add grades which are not in the list
	public  GradeNotFoundException ()
	{
		//Message returned when com.signify.exception is thrown
		super();
		 System.out.println("Grade Not Found ");
	}

}
