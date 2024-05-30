<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 
  <div style="display:flex;justify-content: space-around;align-items: center;flex-direction: column;">
      <form action="addBook">
        <label>BookId</label><input type="text" name="bookId">
        <label>BookName</label><input type="text" name="bookName">
        <label>BookAuthor</label><input type="text" name="bookAuthor">
        <label>No.OfPages</label><input type="text" name="nofPages">
        <input type="submit" value="addBook">
     </form>
  </div>
   

</body>
</html>