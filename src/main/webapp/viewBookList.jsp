<%@page import="com.library.DatabaseConnection.DatabaseCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.sql.*" %>   
 <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <table border=1px align=center >
     
        <tr>
           <th>BookId</th>
           <th>BookName</th>
           <th>BookAuthor</th>
           <th>BookTotalPages</th>
        </tr>
     
          <% 
             Connection con=DatabaseCon.getConnection();
             ResultSet t=DatabaseCon.viewBookList();
             
              while(t.next())
              {
            	 
              
           %>  
           <tr>
              <td><%=t.getInt(1) %></td>
              <td><%=t.getString(2) %></td>
              <td><%=t.getString(3)%></td>
              <td><%=t.getInt(4) %></td>
           </tr> 
           
          <%} %>
           
     </table>

   
</body>
</html>