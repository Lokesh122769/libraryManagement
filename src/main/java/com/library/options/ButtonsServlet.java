package com.library.options;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/buttonsServlet")
public class ButtonsServlet extends HttpServlet 
{
	
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	   	
    	String action = req.getParameter("action");
    	res.getWriter().println(action);
    	if ("addBook".equals(action)) 
    	{
    	    res.sendRedirect("addBook.jsp");
    	} 
    	else if ("ViewBookList".equals(action)) 
    	{
    	    res.sendRedirect("viewBookList.jsp");
    	} 
    	else if ("RemoveBook".equals(action)) 
    	{
    	    res.sendRedirect("removeBook.jsp");
    	} 
    	else if ("IssueBook".equals(action)) 
    	{
    	    res.sendRedirect("IssueBook.jsp");
    	}
    	else if("returnBook".equals(action))
    	{
    		res.sendRedirect("returnBook.jsp");
    	}
    }
}
