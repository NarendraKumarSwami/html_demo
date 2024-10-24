package com.sarvgna.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sarvgna.connection.JDBConnection;
import com.sarvgna.model.Student;

public class StudentDaoImp  implements StudentDAO{

	@Override
	public String addStudent(Student st) throws SQLException {
		// TODO Auto-generated method stub
		
		// Connection 
		 Connection con =	 JDBConnection.provideConnection();
		 
	   Statement statement =	 con.createStatement();
	   
	   int result =      statement.executeUpdate("INSERT INTO student(name, gender, marks) VALUES('"+st.getName()+"', '"+st.getGender()+"', "+st.getMarks()+")");
		
	   
	   if(result > 0) {
		    return "Student is inserted in the database";
	   }
		return "Student is not inserted in the databae";
	}

	@Override
	public Student updateMarks(int marks, int rollNo) throws SQLException {
		// TODO Auto-generated method stub
		
		//
		Connection con = JDBConnection.provideConnection();
		
		       Statement st =      con.createStatement();
		       
		    int result =      st.executeUpdate("UPDATE student SET marks = "+marks+" WHERE rollNo= "+rollNo+"");
		    
		    if(result > 0) {
		    	ResultSet resultSet =     st.executeQuery("SELECT * FROM student WHERE rollNo = "+rollNo+"");
		    	    
		    	if(resultSet.next()) {
		    	 int rollNo1 =            resultSet.getInt("rollNo");
		    	 String name = resultSet.getString("name");
		    	 int marks1 = resultSet.getInt("marks");
		    	 String gender =  resultSet.getString("gender");
		    	 
		         Student student  =	 new Student(rollNo1, name, gender, marks1);
		      
		        return student;
		    	}else {
		    		return null;
		    	}
		    }else {
		    	return null;
		    }
		
	}

	@Override
	public Student removeStudent(int rollNo)  throws SQLException{
		// TODO Auto-generated method stub
		
	    Connection con =	JDBConnection.provideConnection();
	    
	     Statement statement =    con.createStatement();
	     
	     // query ---
	     ResultSet resultSet =   statement.executeQuery("SELECT * FROM student WHERE rollNo = "+rollNo+"");
	     
	     
	     if(resultSet.next()) {
	    	  int rollNo1 =      resultSet.getInt("rollNo");
	    	   String name =     resultSet.getString("name");
	    	   int marks =      resultSet.getInt("marks");
	    	   String gender =     resultSet.getString("gender");
	    	   
	    	 Student st =   new Student(rollNo1, name, gender, marks);
	    	 
	    	     int result =  statement.executeUpdate("DELETE FROM student WHERE rollNo = "+rollNo+"");
	    	     
	    	     if(result > 0) {
	    	    	  return st;
	    	     }
	     }
	     
		  
	     
		  
		return null;
	}

}
