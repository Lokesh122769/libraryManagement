package com.library;

import javax.servlet.http.HttpServlet;


import com.library.DatabaseConnection.DatabaseCon;
import com.library.employee.Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.time.LocalDate;

import javax.servlet.annotation.WebServlet;


@SuppressWarnings("serial")
@WebServlet("/loginServlet")
public class Login extends HttpServlet 
{
	private Connection con=null;
	
	
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
    	PrintWriter out=res.getWriter();
    	try 
    	{
		   con=DatabaseCon.getConnection();
		   Employee em=new Employee(con);
		   String ename=req.getParameter("ename");
		   String epass=req.getParameter("epass");
		   
		   if(em.checkEmployee(ename, epass))
		   {
			   res.sendRedirect("libraryPage.jsp");
		   }
		   else
		   {
			   res.sendRedirect("login.jsp");
		   }
		   
		   
		}catch(Exception e) 
    	{
			e.printStackTrace();
			out.println(e.getMessage());
		}
    	
    }
	
}
