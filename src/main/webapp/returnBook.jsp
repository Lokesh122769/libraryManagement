<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

    .IssueBook
    {
       display:flex;
       flex-direction: column;
       justify-content: center;
       align-items: center;
       
       border-width: 2px;
       border-style: solid;
       border-color: green;
       
    }
    
    .textbox
	{
	    border-color:blue;
	    border-width: 2px;
	    border-style: solid;
	}
	
	.credentials
	{
	    margin-bottom:30px;
	}
}

</style>


</head>
<body>

      <form action="returnBook-url" method="post">
              
             <div class="IssueBook">
                   
                   <div class="credentials">
                    <label>StudentId :</label><input class="textbox" type="text" placeholder="StudentId" name="studentId">
                  </div>
                  
                  <div class="credentials">
                    <label>StudentName :</label><input class="textbox" type="text" placeholder="StudentName" name="studentName">
                  </div>
                  
                  <div class="credentials">
                    <label>BookName :</label><input class="textbox" type="text" placeholder="BookName" name="bookName">
                  </div>

                 <div class="credentials">
                    <label>BookAuthor :</label><input class="textbox" type="text" placeholder="BookAuthor" name="bookAuthor">
                  </div>
                  
                     
       
            <div>
                <input type="submit" value="ReturnBook"> 
            </div>
     </div>
   
      
  </form>
    

</body>
</html>