package com.sarvgna.dao;

import java.sql.SQLException;

import com.sarvgna.model.Student;

public interface StudentDAO {
	
	
	   public  String addStudent(Student st)  throws SQLException;
	   
	   
	   public Student updateMarks(int marks, int rollNo) throws SQLException;
	   
	   
	   public Student removeStudent(int rollNo)  throws SQLException; 

}
