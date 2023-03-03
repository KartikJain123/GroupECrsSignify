/**
 * 
 */
package com.signify.service;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public interface PaymentInterface {
	//amount calculated
	/**
 * method calculateAmount
 
 *
 */
	public void calculateAmount();
	//payment made acknowledgment
	/**
 * method makePayment
 
 *
 */
	public void makePayment();
	/**
 * method paymentStatus
 
 *
 */
	//Returning status of the payment
	public boolean paymentStatus();
}
