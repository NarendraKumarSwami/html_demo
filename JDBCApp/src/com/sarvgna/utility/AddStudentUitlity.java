package com.sarvgna.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sarvgna.dao.StudentDAO;
import com.sarvgna.dao.StudentDaoImp;
import com.sarvgna.model.Student;

public class AddStudentUitlity {
	
	
	 public  void  addStudent(Scanner sc) {
		
		 
		 
		      // Enter the student data 
	
		       
		       
		        System.out.println("Enter the name of student");
		           
		         String name =     sc.nextLine();
		         
		         System.out.println("Enter the gender of student");
		         
		           String gender =   sc.nextLine();
		           
		           System.out.println("Enter the marks of student");
		             int marks  =   sc.nextInt();
		             
		             sc.nextLine();
		             
		             Student st = new Student( name, gender, marks);
		    
	
		    
		      
				      
				    // StudentDAO -
		             
		             StudentDAO stDao = new StudentDaoImp();
		             
		            try {
						String result =  stDao.addStudent(st);
						
						System.out.println(result);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    	    
				    	
				            
		        
		        
		       
	}

}
