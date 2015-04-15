package conogio;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String button = request.getParameter("button");
		
		//TODO: Verify Email and Password
		
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		session.setAttribute("password", password);
		
		if(button.equals("login")){
			PrintWriter writer = response.getWriter();
			writer.println("<html>Email: " + email + "<br>" + "Password: "
					+ password + "</html>");
			writer.flush();
		}
		else{
			PrintWriter writer = response.getWriter();
			writer.println("<html> Time to Register </html>");
			writer.flush();
			
//			HttpServletResponse.sendRedirect("/your/new/location.jsp")
		}
	}
}
