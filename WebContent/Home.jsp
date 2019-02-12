<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title></title>
<style type="text/css">
    .btn {
		background-color: #4CAF50;
        border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
	cursor:pointer;
    }
</style>
</head>
<center><img src="logos.png" height="50"></center>
<center>  
<img src="logo.png" height="40"></center>
<body background="p.jpg">
<center><img src="photo.png" width="150" height="150"></center>
	<form method="post" action="HomeServlet">	
			<table cellpadding="2" width="20%"  align="center" style="margin-top:15"

  cellspacing="2">
				<tr>
					<td>
						<input class='btn'
							type="submit" name="lostitem" value="Lost Item"></td>
							<td>
							<input class='btn' type="submit" name="founditem" value="Found Item"
						   ></td>
						  <td>
						   <input class='btn'
							type="submit" name="deletelostitem" value="DeleteLost Item"></td>
							<td>
							<input class='btn'
						   type="submit" name="deletefounditem" value="DeleteFound Item"
						   ></td>
				</tr>
   			</table>
			<center>
				<input style="	background-color: #008CBA;
        border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
	cursor:pointer;"
					type="submit" name="logout" value="Log Out">
					</center>

	</form>
</body>
</html>