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
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {
	static ResultSet rs = null;
	static Connection conn = null;
	static String url;
	static Statement statement = null;


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		try {
			if (request.getParameter("logout") != null) {
				response.sendRedirect("Welcome.jsp");
			}
			else if (request.getParameter("lostitem") != null) {
				response.sendRedirect("Lostadditem.jsp");
			}
			else if (request.getParameter("founditem") != null) {
				response.sendRedirect("Foundadd.jsp");
			}
			else if (request.getParameter("deletelostitem") != null) {
				response.sendRedirect("DeleteItem.jsp"); 
			}
			else if (request.getParameter("deletefounditem") != null) {
					response.sendRedirect("Deletefound.jsp"); 
			}else if (request.getParameter("saveitem") != null) {
				StringBuffer saveBookQuery = new StringBuffer("Insert into lostitemdetails (lostitemname,lostitemlocation,lostitemcategory) values (");
				saveBookQuery.append("'" + request.getParameter("lostitemname") +"',");
				saveBookQuery.append("'" + request.getParameter("lostitemlocation") +"',");
				saveBookQuery.append("'" + request.getParameter("lostitemcategory") +"')");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/usmdatabase";
					try {
						conn = DriverManager.getConnection(url, "root", "root");
						statement = conn.createStatement();
						int n = statement.executeUpdate(saveBookQuery.toString());
						if(n>0)
							System.out.println("item inserted successfully");
						response.sendRedirect("StuHome.jsp");
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
				} catch (ClassNotFoundException ex) {
					System.out.println(ex.getMessage());
				}
			}else if (request.getParameter("deleteItemFromDB") != null) {
				StringBuffer deleteBookQuery = new StringBuffer("delete from lostitemdetails where ");
				deleteBookQuery.append("lostitemname like");
				deleteBookQuery.append("'%" + request.getParameter("lostitemname") +"%' and ");
				deleteBookQuery.append("lostitemlocation like ");
				deleteBookQuery.append("'%" + request.getParameter("lostitemlocation") +"%'");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/usmdatabase";
					try {
						conn = DriverManager.getConnection(url, "root", "root");
						statement = conn.createStatement();
						int n = statement.executeUpdate(deleteBookQuery.toString());
						if(n>0)
							System.out.println("Item deleted successfully");
						response.sendRedirect("Home.jsp");
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
				} catch (ClassNotFoundException ex) {
					System.out.println(ex.getMessage());
				}
			}else if (request.getParameter("savefounditem") != null) {
				StringBuffer saveBookQuery = new StringBuffer("Insert into founditemdetails (founditemname,founditemlocation,founditemcategory) values (");
				saveBookQuery.append("'" + request.getParameter("founditemname") +"',");
				saveBookQuery.append("'" + request.getParameter("founditemlocation") +"',");
				saveBookQuery.append("'" + request.getParameter("founditemcategory") +"')");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/usmdatabase";
					try {
						conn = DriverManager.getConnection(url, "root", "root");
						statement = conn.createStatement();
						int n = statement.executeUpdate(saveBookQuery.toString());
						if(n>0)
							System.out.println("item inserted successfully");
						response.sendRedirect("StuHome.jsp");
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
				} catch (ClassNotFoundException ex) {
					System.out.println(ex.getMessage());
				}
			}else if (request.getParameter("deleteitemfromDB") != null) {
				StringBuffer deleteBookQuery = new StringBuffer("delete from founditemdetails where ");
				deleteBookQuery.append("founditemname like");
				deleteBookQuery.append("'%" + request.getParameter("founditemname") +"%' and ");
				deleteBookQuery.append("founditemlocation like ");
				deleteBookQuery.append("'%" + request.getParameter("founditemlocation") +"%'");
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost:3306/usmdatabase";
					try {
						conn = DriverManager.getConnection(url, "root", "root");
						statement = conn.createStatement();
						int n = statement.executeUpdate(deleteBookQuery.toString());
						if(n>0)
							System.out.println("Item deleted successfully");
						response.sendRedirect("Home.jsp");
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
				} catch (ClassNotFoundException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}

		catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}
	}
}