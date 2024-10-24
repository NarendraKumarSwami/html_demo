package com.sarvgna;

import java.util.Scanner;

import com.sarvgna.utility.AddStudentUitlity;
import com.sarvgna.utility.RemoveStudentUtility;
import com.sarvgna.utility.UpdateMarksUtility;

public class App {

	
	
	 public static void main(String[] args) {
		
		 
		 
		   //  
		 
		 System.out.println("Welcome to Student Managment");
		 
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 boolean flag = true;
		 
		 while(flag) {
			 
			 System.out.println("Enter a number to perfrom operation \n"
				 		+ "Enter 1 to add student \n"
				 		+ "Enter 2 to update marks of student \n"
				 		+ "Enter 3 to remove a student ");
		 
		    int number = sc.nextInt();
		    
		   sc.nextLine();
		    
		    switch (number) {
			case 1: {
				  
				// add student 
				
				AddStudentUitlity add =  new AddStudentUitlity();
				
				add.addStudent(sc);
				
				break;
			}
			case 2: {
				  
				// update marks of student 
				
				UpdateMarksUtility upMarks = new UpdateMarksUtility();
				
				upMarks.updateMarks(sc);
				
				break;
			}
			case 3:{
				// remove student
				
				RemoveStudentUtility rs = new RemoveStudentUtility();
				
				rs.removeStudent(sc);
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + number);
			}
		    
		    
		    // 
		    System.out.println("Do you want to continue Pass yes or no");
		    
		     String response = sc.nextLine();
		     
		     if(response.equals("no")) {
		    	 flag = false;
		     }
		    
		 }
	}
}
