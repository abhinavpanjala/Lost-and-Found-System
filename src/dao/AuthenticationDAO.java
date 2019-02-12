package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import beans.AuthenticationBean;

public class AuthenticationDAO {
	static ResultSet rs = null;
	static Connection conn = null;
	static String url;
	static Statement statement = null;

	public static AuthenticationBean validateUser(AuthenticationBean bean) {

		String username = bean.getLoginId();
		String password = bean.getLoginPassword();

		String loginSelectQuery = "select * from user_logindetails where username='" + username + "' AND password='"
				+ password + "'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/usmdatabase";
			try {
				conn = DriverManager.getConnection(url, "root", "root");
				statement = conn.createStatement();
				rs = statement.executeQuery(loginSelectQuery);
				boolean validUser = rs.next();
				if (!validUser) {
					bean.setValidUser(false);
				} else if (validUser) {
					bean.setValidUser(true);
					bean.setType(rs.getString("role"));
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		} catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		}

		return bean;

	}
}
