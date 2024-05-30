package com.library.options;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.DatabaseConnection.DatabaseCon;



@WebServlet("/addBook")
public class addBookServlet extends HttpServlet 
{
    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	int bookId,nofPages;
    	String bookName,bookAuthor;
    	PrintWriter out=res.getWriter();
    	
    	bookId=Integer.parseInt(req.getParameter("bookId"));
    	bookName=req.getParameter("bookName");
    	bookAuthor=req.getParameter("bookAuthor");
    	nofPages=Integer.parseInt(req.getParameter("nofPages"));
    	
    	
    	try 
    	{
			Connection con=DatabaseCon.getConnection();
			String inform=DatabaseCon.insertValues(bookId, bookName, bookAuthor, nofPages);
			out.println(inform);
			
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
			out.println(e.getMessage());
		}
    	
    }
}
