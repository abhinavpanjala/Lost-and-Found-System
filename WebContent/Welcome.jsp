<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Login Page</title>
  <style type="text/css">
    .btn {
        background-color:#2CEE91;
        cursor:pointer;
    }
</style>


<script>
function required()  
{  
var username = document.forms["log"]["username"].value;
var password = document.forms["log"]["password"].value;
if (username == "")  
{  
alert("Please input a User name");  
return false;  
} 
if (password == "")  
{  
alert("Please input a Password");  
return false;  
} 
}  
</script>

</head>
<center>  
<img src="logo.png" height="60"></center>
<center>
<img src="photo.png" height="200" width="200"></center>
  <body style="background-color : #F0F0F0;
    margin: 0;
    padding: 0;
" >
<body background='p.jpg'>
	<form method="post" action="LoginServlet" name="log" onsubmit="return required()">
	<table cellpadding="2" width="20%" bgcolor="#FFD700" align="center" style="margin-top:15"

  cellspacing="2">
			
			<tr>

  <td colspan=2>

  </td>

  </tr>
  <tr>

  <td colspan=2>

  <center><font size='4'><b>User Login</b></font></center>

  </td>

  </tr>
  <tr>
			<td size="30">User Name:</td>
			<td>	<input type="text" name="username" value="" size="30"> </td>
	</tr>
			
			
			<tr>
			
			<td size="30" >Password:</td>
			<td><input type="password" name="password"
				value="" size="30"> </td>
				</tr>
			<tr>
			<td>
				<input class='btn' type="submit" name="login" value="Log In" /> </td>
				<td><label> New Student ? </label> <a href="Registration.jsp">Register Here</a>
			</td></tr>
			</table>
		
	</form>
</body>
</html>