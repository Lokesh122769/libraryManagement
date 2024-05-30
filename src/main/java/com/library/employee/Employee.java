package com.library.employee;

import java.sql.*;

import javax.naming.CompositeName;


public class Employee 
{
   private Connection con=null;
   private PreparedStatement pst=null;
   public Employee() {}
   
   public Employee(Connection con)
   {
	   this.con=con;
   }
   
   public boolean checkEmployee(String ename,String epass) throws SQLException
   {
	   String url="select * from libraryEmployee where ename=? and epassword=? ";
	   pst=con.prepareStatement(url);
	   pst.setString(1, ename);
	   pst.setString(2, epass);
	   ResultSet rs= pst.executeQuery();
	   if(rs.next())
		   return true;
	   return false;
   }
   
}
