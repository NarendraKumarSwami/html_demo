package com.sarvgna.utility;

import java.sql.SQLException;
import java.util.Scanner;

import com.sarvgna.dao.StudentDAO;
import com.sarvgna.dao.StudentDaoImp;
import com.sarvgna.model.Student;

public class UpdateMarksUtility {

	
	public  void updateMarks(Scanner sc) {
		
		
		// take roll Number and marks from the console
		
		  
		   
		   System.out.println("Enter the rollNo of student for which marks is going to updated ");
		   int rollNo =  sc.nextInt();
		   
		   System.out.println("Enter the new marks ");
		   int marks =  sc.nextInt();
		   
		   
		   sc.nextLine();
		   
		   //  
		   
		   StudentDAO stDao = new StudentDaoImp();
		   
		   try {
			  Student st= stDao.updateMarks(marks, rollNo);
			  
			  System.out.println(st);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
		
	}
}
