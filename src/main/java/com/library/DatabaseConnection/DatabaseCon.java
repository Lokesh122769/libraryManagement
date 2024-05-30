package com.library.DatabaseConnection;

import java.io.PrintWriter;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DatabaseCon 
{
     private static Connection con=null;
     private static Statement st=null;
     private static PreparedStatement pst=null;
     PrintWriter out=null;
     
     public static Connection getConnection() throws ClassNotFoundException, SQLException
     {
    	 if(con==null)
    	 {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 String url="jdbc:mysql://localhost:3306/library";
    		 con=DriverManager.getConnection(url, "root", "1234");
    	 }
    	 return con;
     }
     
     public static String insertValues(int bookId,String bookName,String bookAuthor,int nofPages) throws SQLException
     {
    	
    	 
        try 
    	{
        	 String query="INSERT INTO bookData VALUES (?, ?, ?, ?)";
			pst=con.prepareStatement(query);
			pst.setInt(1, bookId);
			pst.setString(2, bookName);
			pst.setString(3, bookAuthor);
			pst.setInt(4, nofPages);
			
			pst.execute();
			
		}catch (SQLException e)
        {
			e.printStackTrace();
			return e.getMessage();
		}
    	 
    	 return "BookDeatils Inserted";
     }
     
     public static ResultSet viewBookList() throws SQLException
     {
    	 st=con.createStatement();
    	 ResultSet rs=st.executeQuery("select * from bookData");
    	 
    	 return rs;
     }
     
     public static String removeBook(String bookName,String bookAuthor) throws SQLException
     {
    	 String query="delete from bookData where bookName=? and bookAuthor=?";
    	 
    	 pst=con.prepareStatement(query);
    	 pst.setString(1, bookName);
    	 pst.setString(2, bookAuthor);
    	 
    	 pst.execute();
    	 
    	 
    	 return "Specified book Removed";
     }
     
     public static String issueBook(String bookName,String bookAuthor,int studentId,String studentName,String studentBranch,String issueDate,String dueDate) throws SQLException, ParseException
     {
    	
   
    	 String query="insert into IssueBook values(?,?,?,?,?,?,?)";
    	 SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    	 Date issueSqlDate=new Date(simpleDateFormat.parse(issueDate).getTime());
    	 Date dueSqlDate=new Date(simpleDateFormat.parse(dueDate).getTime());
    	 
    	 
    	 try 
    	{
    		 pst=con.prepareStatement(query);
        	 pst.setString(1, bookName);
        	 pst.setString(2, bookAuthor);
        	 pst.setInt(3, studentId);
        	 pst.setString(4, studentName);
        	 pst.setString(5, studentBranch);
        	 pst.setDate(6, issueSqlDate);
        	 pst.setDate(7, dueSqlDate);
        	 
        	 pst.execute();
		}
    	catch (Exception e)
    	{
			return e.getMessage();
		}
    	 
    	 
    	 return "Book was Issued";
     }
     
     public static String returnBook(int studentId,String studentName,String bookName,String bookAuthor) 
     {
    	 
    	 String query="insert into returnStatus values(?,?,?,?)";
    	 
    	 try 
    	 {
			pst=con.prepareStatement(query);
			 pst.setInt(1, studentId);
	    	 pst.setString(2, studentName);
	    	 pst.setString(3, bookName);
	    	 pst.setString(4, bookAuthor);
	    	 
	    	 pst.execute();
	    	 
	    	 pst.execute("delete from IssueBook where studentId=?");
	    	 pst.setInt(1, studentId);
		 }
    	 catch (SQLException e)
    	 {
			
			e.printStackTrace();
			return e.getMessage();
		}
    	
    	 
    	 return "Book Returned SuccessFully";
     }
}
