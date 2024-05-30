<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">


<style>

   .buttons
   {
      color:white;
      background-color:rgb(116, 77, 37);
      
     
      cursor:pointer;
      
      margin-top:200px;
      margin-left:50px;
      
      padding:15px;
      border-style: none;
      
      border-radius:5px;
      font-family: roboto;
      
      box-shadow: 0px 0px 3px grey;  
   }

</style>

</head>
<body>
  
  <div style="position:absolute ;z-index: -1">
       <img style="width:1480px;height:700px;" src="images/library-books2.jpg">
  </div>
  
  <div style="position: relative;display:flex;align-items: center;justify-content: space-around;">
        <form action="buttonsServlet" >
        
             <button class="buttons" name="action" value="addBook">AddBook</button>
             <button class="buttons" name="action" value="ViewBookList">ViewBookList</button>
             <button class="buttons" name="action" value="RemoveBook">RemoveBook</button>
             <button class="buttons" name="action" value="IssueBook">IssueBook</button>
             <button class="buttons" name="action" value="returnBook">ReturnBook</button>
             
        </form>
  </div>
  
  
  
  
</body>
</html>