package com.sj.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    static DBConnector dbconnector;
	private DBConnector() {
		super();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated constructor stub
	  }

	  public static DBConnector getInstance() {
		  if (dbconnector == null)
			  dbconnector = new DBConnector();
			return dbconnector;	  
	  }
	 
	  public Connection getConnection() throws SQLException {
    	   
    	   return     DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","root");
    	     
       }



}
