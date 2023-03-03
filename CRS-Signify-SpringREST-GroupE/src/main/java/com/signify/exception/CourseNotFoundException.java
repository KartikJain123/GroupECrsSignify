/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public class CourseNotFoundException extends Exception {
/*
		Method CourseNotFoundException
		@params courseCode
	
	*/
	public CourseNotFoundException (String courseCode)
	{
		super();
		//Exception raise when user enters wrong coursecode
		 System.out.println("Invalid CourseCode "+courseCode);
	}
	//Message returned when com.signify.exception is thrown
	 
}
