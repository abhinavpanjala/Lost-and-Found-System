<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.mysql.*" %>
<%@ page import="java.sql.*" %>
<html>
<body>
<div id="content">


    <p>Displaying FoundItemDetails: </p>

    <table border="0" cellpadding="10">
        <thead>
            <tr>
                <th>founditemname</th>
                <th>founditemlocation</th>
                <th>founditemcategory</th>
            </tr>
        </thead>
        <tbody>


            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = null;
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usmdatabase", "root", "root");
                Statement stmt = null;
                stmt = conn.createStatement();
                String query = "select * from founditemdetails";
                ResultSet rs = null;
                rs = stmt.executeQuery(query);
                while(rs.next()){
            %>
            <tr>
                <%
                    String founditemname = rs.getString("founditemname");
                    String founditemlocation = rs.getString("founditemlocation");
                    String founditemcategory = rs.getString("founditemcategory");
                %>
                <td><%=founditemname %></td>
                <td><%=founditemlocation %></td>
                <td><%=founditemcategory %></td>
             
            </tr>               

            <%      
                }
            %>

        </tbody>
    </table>
    <label> If Item Not Found ? </label>
					 <a href="StuHome.jsp">CLick Here</a>
</div>
</body>
</html>