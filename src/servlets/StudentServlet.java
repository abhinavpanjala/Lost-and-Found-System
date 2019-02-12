package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	static Connection currentCon = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static String url;
	static Statement statement = null;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, java.io.IOException 
	{
		try
		{
			if (req.getParameter("register") != null) {
				StringBuffer insertStudentDetailsQuery = new StringBuffer("INSERT INTO user (UserId, "
						 + "Name," + "Username," + "Password," + "EmailId" + ") " +" VALUES (");
				System.out.println("UserId : "+req.getParameter("userid"));
				insertStudentDetailsQuery.append("'" + req.getParameter("userid") + "'" + ",");
				insertStudentDetailsQuery.append("'" + req.getParameter("name") + "'" + ",");
				insertStudentDetailsQuery.append("'" + req.getParameter("username") + "'" + ",");
				insertStudentDetailsQuery.append("'" + req.getParameter("password") + "'" + ",");
				insertStudentDetailsQuery.append("'" + req.getParameter("emailid") + "')");
				System.out.println(insertStudentDetailsQuery);

				StringBuffer insertLoginDetails = new StringBuffer(
						"INSERT INTO user_logindetails (Username, " + "Password," + "role" + ")  " + "VALUES (");
				insertLoginDetails.append("'" + req.getParameter("username") + "'" + ",");
				insertLoginDetails.append("'" + req.getParameter("password") + "'" + ",");
				insertLoginDetails.append("'STUDENT'");
				insertLoginDetails.append(")");
				System.out.println(insertLoginDetails);
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/usmdatabase";
					conn = DriverManager.getConnection(url, "root", "root");
					statement = conn.createStatement();
					int n = statement.executeUpdate(insertStudentDetailsQuery.toString());
					if (n > 0)
						System.out.println("item Details inserted successfully");
					n = statement.executeUpdate(insertLoginDetails.toString());
					if (n > 0)
						System.out.println("Login Details inserted successfully");
					res.sendRedirect("Welcome.jsp");

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			} else if (req.getParameter("lostitem") != null) {
				res.sendRedirect("Lostadditem.jsp");
			} else if (req.getParameter("founditem") != null) {
				res.sendRedirect("Foundadd.jsp");
			}else if (req.getParameter("logout") != null) {
				res.sendRedirect("Welcome.jsp");
			}else if (req.getParameter("ListofFoundItems") != null) {
				res.sendRedirect("Listfounditems.jsp");
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}