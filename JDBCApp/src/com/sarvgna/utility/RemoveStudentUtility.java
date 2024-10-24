package com.sarvgna.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.sarvgna.dao.StudentDAO;
import com.sarvgna.dao.StudentDaoImp;
import com.sarvgna.model.Student;

public class RemoveStudentUtility {

	
	
	
	public  void removeStudent(Scanner sc) {
		  
		
		 //  remove the student
		
		
		 
		  System.out.println("Enter the rollNo of student to delete from the database");
		  int rollNo = sc.nextInt();
		  
		  sc.nextLine();
		  
		  // StudenDao
		  
		  StudentDAO stDao = new StudentDaoImp();
		  
		  try {
			 Student st =  stDao.removeStudent(rollNo);
			 
			 System.out.println(st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
