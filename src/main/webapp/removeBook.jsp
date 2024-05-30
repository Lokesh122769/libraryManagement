<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <div style="display:flex;justify-content: space-around;">
     
         <form action="removeBook-url" method="get">
          <label>Enter BookName: </label><input type="text" name="bookName">
           <label>Enter BookAuthor: </label><input type="text" name="bookAuthor">
               <input type="submit" value="removeBook">
         </form>
     </div>

</body>
</html>