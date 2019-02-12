package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beans.AuthenticationBean;
import dao.AuthenticationDAO;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, java.io.IOException {

		try {
			String loginId = req.getParameter("username");
			String loginPassword = req.getParameter("password");
			AuthenticationBean user = new AuthenticationBean();
			user.setLoginId(loginId);
			user.setLoginPassword(loginPassword);
			
			user = AuthenticationDAO.validateUser(user);

			if (user.isValidUser()) {
				
		
				if(user.getType().equalsIgnoreCase("ADMIN"))
					res.sendRedirect("Home.jsp");
				else if(user.getType().equalsIgnoreCase("STUDENT"))
					res.sendRedirect("StuHome.jsp");
			}
			else
				res.sendRedirect("LoginError.jsp");
		}
		catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}
	}
}