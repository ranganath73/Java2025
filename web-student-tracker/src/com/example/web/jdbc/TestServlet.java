package com.example.web.jdbc;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

//import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Define datasource/connection pool for Resources injection
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;

    /**
     * Default constructor. 
     */
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step: 1 Set up the printWriter)
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		// Step: 2 Get a connection to the database 
		Connection myConn = null;  // 1
		Statement myStmt = null;   // 2
		ResultSet myRs = null;     // 3
		
		try {
			myConn = dataSource.getConnection(); // 1
			
		// Step: 3 Create a SQL Statements
			String sql = "SELECT * FROM student"; 
			myStmt = myConn.createStatement();   // 2
		
		// Step: 4 Execute SQL Query
		myRs = myStmt.executeQuery(sql);   // 3
		
		// Step: 5 Process the resultset
		while(myRs.next()) {
			
			String firstName = myRs.getString("first_name");
			out.println(firstName);
			
			String lastName = myRs.getString("last_name");
			out.println(lastName);
			
			String email = myRs.getString("email");
			out.println(email);
			
			out.println();
		}
		} catch(Exception exec) {
			exec.printStackTrace();
		}
	}

}
