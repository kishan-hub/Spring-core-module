package com.postgress.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection { 
	
	public static Connection conn;
	
	public static Properties props;
	static
	{
		 props =new Properties();
		 try
		 {
		 props.load(DBConnection.class.getClassLoader().getResourceAsStream("mysql.properties"));
		 
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  DriverManager.getConnection("jdbc:mysql://mysqldb-instance-1.cza1l5idfka9.eu-central-1.rds.amazonaws.com:3306/urotaxidb","admin","Mysql$123$");
		  if(conn!=null) {
			  System.out.println("connection eastablised");
		  }
		  else
		  {
			  System.out.println("connection is not eastablised");
		  }
		  
		 }
		 catch (Exception e) {
	           e.printStackTrace();
		}
		 
	}
	
	public static Connection getDbConnection() {
		return conn;
		
	}

}
