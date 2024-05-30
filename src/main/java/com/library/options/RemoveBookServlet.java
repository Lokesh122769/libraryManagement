package com.library.options;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.DatabaseConnection.DatabaseCon;

@WebServlet("/removeBook-url")
public class RemoveBookServlet extends HttpServlet 
{
     public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
     {
    	 String bookName,bookAuthor;
    	 
    	 bookName=req.getParameter("bookName");
    	 bookAuthor=req.getParameter("bookAuthor");
    	 
    	 try
    	 {
    		 DatabaseCon.getConnection();
			 String response=DatabaseCon.removeBook(bookName, bookAuthor);
			 res.getWriter().println(response);
		 }
    	 catch (Exception e) 
    	 {
			
			e.printStackTrace();
			res.getWriter().println(e.getMessage());
		}
     }
}
