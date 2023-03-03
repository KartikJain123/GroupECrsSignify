/**
 * 
 */
package com.signify.service;

import org.springframework.stereotype.Service;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */


@Service
public class PaymentNotificationServices implements PaymentNotificationInterface{
	/**
 * method generateNotificationId
 
 *
 */
	public void generateNotificationId() {
		System.out.println("notification id generated");
	}
	/**
 * method notificationMessage
 
 *
 */
	public void notificationMessage() {
		System.out.println("notification message");
	}
	/**
 * method makeNotification
 *
 */
	public void makeNotification(){
		System.out.println("make notification function");
	}

}
