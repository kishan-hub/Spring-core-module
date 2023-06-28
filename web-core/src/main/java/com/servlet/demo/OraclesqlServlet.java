package com.servlet.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OraclesqlServlet extends HttpServlet {
                                                                                                                                                                                                                          
	private static final long serialVersionUID = 1L;
	List<String> cities=null;
	 Statement st=null;
	 Connection conn=null;
	 ResultSet rs =null;
	 public void init() {
		
		try
		{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys","admin");
			   if(conn!=null) {
				   System.out.println("Connection is eastablised");
			   }
			   
			  st =conn.createStatement();
			  
			  rs =st.executeQuery("select cities from tbl_master");
			  
			  cities =new ArrayList<>();
			  while(rs.next()) {
				  cities.add(rs.getString("cities"));
			  }
		}
		 catch (ClassNotFoundException|SQLException e) {
			 e.printStackTrace();
		}
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 try
		 {  
			  request.setAttribute("cities", cities);
			  request.getRequestDispatcher("/register.jsp").forward(request, response);
		 }
		 catch (IOException e) {
			 e.printStackTrace();
		}
	}
}
