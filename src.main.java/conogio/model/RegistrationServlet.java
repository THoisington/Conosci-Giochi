package conogio.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.service.LoginService;
import conogio.service.RegistrationService;
import conogio.utils.HibernateUtil;

//@WebServlet("/register")
public class RegistrationServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String gameTitle = request.getParameter("gameField");
		
		RegistrationService registerService = new RegistrationService();
		boolean found = registerService.titleSearch(gameTitle);
		Game first = registerService.getGameByTitle(gameTitle);
		
		
		
		LoginService loginService = new LoginService();
		User user = loginService.createUser(userName, password);
		boolean userExists = loginService.authenticate(userName, password);

		if(userExists == false && found == true){
			registerService.addToDB(user, first);
		}
//		else if(userExists == false && found == false){
//			//TODO: Tell the user to try another game
//		}
		else{
			response.sendRedirect("test.html");
		}
		
		request.getSession().setAttribute("user", user);	
		response.sendRedirect("ourgames.jsp");
	}
	
}
