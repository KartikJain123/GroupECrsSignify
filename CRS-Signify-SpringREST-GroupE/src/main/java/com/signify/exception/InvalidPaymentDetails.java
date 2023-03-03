package com.signify.exception;
/*
@author GROUP-E-CRS-SIGNIFY

*/
public class InvalidPaymentDetails extends Exception{
/*
		Method InvalidPaymentDetails
		@params reason
	
	*/
	public InvalidPaymentDetails(String reason) {
		// TODO Auto-generated constructor stub
		System.out.println("Please enter valid details. You have entered "+reason);
	}

}
