/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public class CourseNotAssignedToProfessorException extends Exception{

	
	/*
		Method CourseNotAssignedToProfessorException
		
	
	*/
	
	//Exception raise when course is not assigned to any professor
	public CourseNotAssignedToProfessorException() {
		// TODO Auto-generated constructor stub
		super();
		//Message returned when com.signify.exception is thrown
		 
		System.out.println("The course has not been assigned to any professor.");
	}

}
