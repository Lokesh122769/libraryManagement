package com.library.options;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.DatabaseConnection.DatabaseCon;

@WebServlet("/issueBook-url")
public class IssueBookServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	String bookName,bookAuthor,studentName,StudentBranch,issueDate,dueDate;
    	int studentId;
    	PrintWriter out=res.getWriter();
    	bookName=req.getParameter("bookName");
    	bookAuthor=req.getParameter("bookAuthor");
    	
    	studentId=Integer.parseInt(req.getParameter("studentId"));
    	
    	studentName=req.getParameter("studentName");
    	StudentBranch=req.getParameter("studentBranch");
    	
    	issueDate=req.getParameter("issueDate");
    	dueDate=req.getParameter("dueDate");
    	
    	try 
    	{
			DatabaseCon.getConnection();
			String response=DatabaseCon.issueBook(bookName, bookAuthor, studentId, studentName, StudentBranch, issueDate, dueDate);
			out.println(response);
		}
    	catch(Exception e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.println(e.getMessage());
		}
    	
    }
}
