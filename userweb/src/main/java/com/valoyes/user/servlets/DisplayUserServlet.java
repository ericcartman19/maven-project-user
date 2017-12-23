package com.valoyes.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.valoyes.user.bo.UserBO;
import com.valoyes.user.dto.User;

/**
 * Servlet implementation class DisplayUserServlet
 */
public class DisplayUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		UserBO bo = (UserBO) context.getBean("userbo");
		
		User user = bo.findUser(Integer.parseInt(request.getParameter("id")));

		PrintWriter out = response.getWriter();
		out.print("User details: ");
		out.print("User ID: " + user.getId());
		out.print("User Name: " + user.getName());
		out.print("User Email: " + user.getEmail());
	}

}
