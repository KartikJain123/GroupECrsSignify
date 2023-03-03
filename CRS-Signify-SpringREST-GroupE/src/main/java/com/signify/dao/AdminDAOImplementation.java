/**
 * 
 */
package com.signify.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.signify.bean.Admin;
import com.signify.constants.SQLConstants;
import com.signify.exception.AdminDoesntExistException;
import com.signify.helper.IDs;
import com.signify.utils.DBUtils;

/**
 * @author GROUP-E-CRS-SIGNIFY
 *
 */

public class AdminDAOImplementation implements AdminDAOInterface{


	Connection conn = null;
    PreparedStatement stmt = null;
	

    
	@Override
/**
 * Methods update
 @params query
 
 *
 */
	public void update(String query) {
		// TODO Auto-generated method stub
		
	}
    
	@Override
/**
 * Methods add
 @params id,admin
 
 *
 */
	public boolean add(int id, Admin admin) {
		// TODO Auto-generated method stub
		boolean flag = false;
		   try{
			    conn = DBUtils.getConnection();
			   
			      stmt = conn.prepareStatement(SQLConstants.ADD_ADMIN);
			      String name=admin.getAdminName();
			      
			      stmt.setInt(1, id); 
			      stmt.setString(2,name);
			      
			      int row = stmt.executeUpdate();
			      if (row == 0)
			    	  flag = false;
			      else
			    	  flag = true;
			    	  
			      stmt.close();
			      //
			      
			   }catch(SQLException se){		//Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){ 	      //Handle errors for Class.forName
			     e.printStackTrace();
			   }
		   return flag;
	}
    
	@Override
/**
 * Methods remove
 @params adminId
 
 *
 */
	public void remove(String adminId) throws AdminDoesntExistException {
		// TODO Auto-generated method stub
		 try{
			  conn = DBUtils.getConnection();
		      stmt = conn.prepareStatement(SQLConstants.DELETE_ADMIN + Integer.parseInt(adminId));
		     
		      if(stmt.execute())
		    	  throw new AdminDoesntExistException();
		     
		      stmt.close();
		      //
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      //se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      //e.printStackTrace();

		    	  throw new AdminDoesntExistException();
		   }
	}

	
     
	
	@Override
	/**
 * Methods view
 @params query
 
 *
 */
	public void view(String query) {
		// TODO Auto-generated method stub
		
	}

}
