package servlets;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AuthenticationBean;


public class LogOutServlet extends HttpServlet {

	public void doPost(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
			throws ServletException, java.io.IOException {

		try {
			httpResponse.sendRedirect("LoginPage.jsp"); 
		}
		catch (Throwable ex) {
			ex.printStackTrace();
		}
	}
}
