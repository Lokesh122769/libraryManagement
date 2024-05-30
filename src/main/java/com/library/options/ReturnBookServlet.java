package com.library.options;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

import com.library.DatabaseConnection.DatabaseCon;

@WebServlet("returnBook-url")
public class ReturnBookServlet extends HttpServlet 
{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int studentId;
		String studentName,bookName,bookAuthor;
		PrintWriter out=res.getWriter();
		
		studentId=Integer.parseInt(req.getParameter("studentId"));
		
		studentName=req.getParameter("studentName");
		bookName=req.getParameter("bookName");
		bookAuthor=req.getParameter("bookAuthor");
		
		try 
		{
			DatabaseCon.getConnection();
		    String response=DatabaseCon.returnBook(studentId, studentName, bookName, bookAuthor);
		    out.println(response);
		} 
		catch (Exception e) 
		{
		    	e.printStackTrace();
		}
	}
	
}
