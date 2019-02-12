<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>

  <head >
  <style type="text/css">
    .btn {
        background-color:#2CEE91;
        cursor:pointer;
    }
</style>

<script>
function required(inputText)  
{  
var x = document.forms["reg"]["emailid"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
var empt = document.forms["reg"]["name"].value;
var userid = document.forms["reg"]["userid"].value;
var username = document.forms["reg"]["username"].value;
var password = document.forms["reg"]["password"].value;
var emailid = document.forms["reg"]["emailid"].value;
if (empt == "")  
{  
alert("Please input a name");  
return false;  
} 
if (userid == "")  
{  
alert("Please input a user Id");  
return false;  
} 
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
if (emailid == "")  
{  
alert("Please input a Valid Email Id");  
return false;  
}   

 if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }

}  
</script>
</html>

  </head>
<center>  
<img src="logo.png" height="60"></center>
<center>
<img src="photo.png" height="200" width="200"></center>
  <body style="
    margin: 0;
    padding: 0;
" background="p.jpg">

  <form name="reg" method="post" action="StudentServlet" onsubmit="return required()">

<table cellpadding="2" width="20%" bgcolor="#FFD700" align="center" style="margin-top:15"

  cellspacing="2">


<tr>

  <td colspan=2>

  <center><font size=4><b>User Registration</b></font></center>

  </td>

  </tr>


<tr>

 <td size="30">Name:</td>
<td><input type="text" name="name" value="" size="30"/></td>

 </tr>


<tr>

<td>User Id:</td>
<td><input type="text" name="userid" value="" size="30" /></td>

 </tr>

  <tr>

 <td>User Name:</td>
<td><input type="text" name="username" value="" size="30" /></td

  </tr>


<tr>

<td>Password:</td>
<td><input type="password" name="password" value="" size="30"/></td>

 </tr>


<tr>

<td>Email:</td>
	<td><input type="text" name="emailid" value="" size="30" /></td>

  </tr>
  <tr>

  <td><input class='btn' type="reset"></td>
<td><input class='btn' type="submit" name="register" value="Register" /></td>

  </tr>

  </table>

  </form>

  </body>

  </html>