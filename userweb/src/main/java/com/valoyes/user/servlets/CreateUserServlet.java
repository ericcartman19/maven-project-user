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
 * Servlet implementation class CreateUserServlet
 */
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		UserBO bo = (UserBO) context.getBean("userbo");
		bo.create(user);
		
		PrintWriter out = response.getWriter();
		out.println("Creado el usuario : " + user.getName());
		
	}

}
