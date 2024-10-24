package com.sarvgna.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnection {
	
	
	public static Connection con;
	
	
	public static Connection provideConnection() {
		   
		if(con == null) {
			
		
		     try {
			    con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/batch3", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		     
		    
		     
		}
		
		
		return con;
		
		     
		
	}

}
