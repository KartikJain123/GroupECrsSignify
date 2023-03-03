/**
 * 
 */
package com.signify.dao;

import com.signify.bean.Admin;
import com.signify.exception.AdminDoesntExistException;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */
public interface AdminDAOInterface {
	
	/**
 * Methods update
 @params query
 
 *
 */
	
	public void update(String query);
	
	/*
	 method for adding admin into database
	 @param id unique id to represent the admin 
	 */
	
	public boolean add(int id, Admin admin);
	
	/*
	 method for removing the admin
	@param adminId unique id to represent the admin
	*/
	
	public void remove(String adminId) throws AdminDoesntExistException;
	/**
 * Methods view
 @params query
 
 *
 */
	public void view(String query);

}
