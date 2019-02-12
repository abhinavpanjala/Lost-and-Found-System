<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>lost additem</title>
</head>
<body>
	<form method="post" action="HomeServlet">
		<center>
			<div style="height: 40; color: blue">
				<h1 style="color: red;">USM Lost and Found System</h1>
				<span style="float: right"><input
					type="submit" name="logout" value="Log Out"></span>
			</div>
			<div style="height: 10px"></div>
			</div>
			<table align="center" border="0" width="50%" cellpadding="3"
				cellspacing="0">
				<thead>
					<tr>
						<th colspan="2">LostItem Details</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Lost ItemName</td>
						<td><input type="text" name="lostitemname" value="" /></td>
					</tr>
					<tr>
						<td>Lost ItemLocation</td>
						<td><input type="text" name="lostitemlocation" value="" /></td>
					</tr>
			<tr>
						<td>Lost ItemCategory</td>
						<td><input type="text" name="lostitemcategory" value="" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" name="saveitem" value="saveitem" /></td>
					</tr>
			</table>
		</center>
	</form>
</body>
</html>