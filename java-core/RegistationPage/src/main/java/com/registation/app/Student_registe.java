package com.registation.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "student_registe", urlPatterns = "/Stude")
public class Student_registe extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		
		RequestDispatcher req = request.getRequestDispatcher("hello.jsp");
		req.include(request, response);
		String contact = request.getParameter("contact");
		if (first_name != null) {
			
			req =  request.getRequestDispatcher("Register_2.jsp");
			req.forward(request, response);
		}
		else{
			
		}
	}

	
}
