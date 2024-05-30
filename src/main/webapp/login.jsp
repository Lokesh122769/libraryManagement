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

<style type="text/css">
    
    div
    {
       font-family: roboto;
    }
    
    .loginDiv
    {
        border-width:1px;
        border-style: solid;
        margin-top:200px;
        margin-left:450px;
        border-color: red;
        
        padding: 30px;
        padding-left:60px;
        width:400px;
        height:200px;
        
        display:flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        
        box-shadow: 0px 0px 3px grey;  
        
        border-radius:8px;
    }
    
    .textbox
    {
        width:250px;
        border-style:solid;
        border-width:1px;
        margin-left:5px;
        border-radius:2px;
        height:27px;
        border-color:red;
        
        font-size:16px;
    }
    .credentials
    {
      margin-bottom:40px;
      height:25px;
      font-size: 24px;
    }
    .submit
    {
       padding:10px;
       padding-left:15px;
       padding-right:15px;
       
       color:white;
       border-style:none;
       cursor:pointer;
       background-color:rgb(0,128,255);
       border-radius:10px;
       
       
    }
    .submit:active
    {
	   background-color: rgb(77,166,255); 
    }
    
</style>

</head>
<body>

  <form action="loginServlet">
         <div class="loginDiv">
     <div style="display:flex;">
             <div style="display:flex;flex-direction: column;justify-content: center;">
                  <div class="credentials">
                       Username :
                  </div>
                  <div class="credentials">
                        Password :
                  </div>
                
                 
             </div>
             <div style="display:flex;flex-direction: column;justify-content: center;">
                  <div class="credentials">
                       <input class="textbox" type="text" placeholder="username" name="ename">
                  </div>
                  <div class="credentials">
                       <input class="textbox" type="password" placeholder="******" name="epass">
                  </div>
             </div> 
      </div>
         <div>
             <input class="submit" type="submit"> 
         </div>
    </div>  
     
  </form>
  

</body>
</html>