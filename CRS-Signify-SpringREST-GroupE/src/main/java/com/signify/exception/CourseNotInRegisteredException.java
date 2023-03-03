package com.signify.exception;
/*
@author GROUP-E-CRS-SIGNIFY

*/
public class CourseNotInRegisteredException extends Exception{
//Exception raise when the user tries to drop the unselected course
/*
		Method CourseNotInRegisteredException
		
	
	*/
	public CourseNotInRegisteredException() {
		// TODO Auto-generated constructor stub
		super();
		//Message returned when com.signify.exception is thrown
		 
			System.out.println("You have not added the course you are trying to drop");
	}

}
