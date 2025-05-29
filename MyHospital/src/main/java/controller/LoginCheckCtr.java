package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adminnn.AdminModel;

@WebServlet("/LoginCheckCtr")
public class LoginCheckCtr extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		
		AdminModel model = new AdminModel();
		int y = model.chackLogin(user,pwd );
 
		if (y != 0) {
	         HttpSession session = request.getSession();
             session.setAttribute("USER",user);
			response.sendRedirect("adminHome.jsp");
		}
		else {
			RequestDispatcher rr = request.getRequestDispatcher("login.jsp");
			request.setAttribute("msg", "Incorrect User Name or Password");
			rr.forward(request, response);
		}
	}

}
