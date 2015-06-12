package conogio.model;

import conogio.model.User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.service.*;
import conogio.utils.HibernateUtil;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String button = request.getParameter("button");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.authenticate(userName, password);
		User user = loginService.getUserByUserId(userName);
		
		/* Game Database and integer variable section */
		Session session4 = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		Transaction tx4 = null;
		Game[] gameList = new Game[70];
		List<Game> tempList;
		
		int indexL = 0;
		int indexLib = 0;
		Integer workaroundL = null;

		try {
			tx4 = session4.getTransaction();
			tx4.begin();
			
			Query query = session4.createQuery("from Game");
			tempList = query.list();
			tempList.toArray(gameList);

			tx4.commit();
			} catch (Exception e) {
			if (tx4 != null) {
				tx4.rollback();
			}
			e.printStackTrace();
			} finally {
			}
		
		
		workaroundL = Integer.valueOf(indexL);
		//TODO: Maybe take advantage of this and reduce redundancy at the end. 
		request.getSession().setAttribute("games", gameList);
		request.getSession().setAttribute("index", indexL);
		request.getSession().setAttribute("indexLib", indexLib);
		/* Back to Login */
		
		if(button.equals("login")){
			if(result == true){
				request.getSession().setAttribute("user", user);	
				response.sendRedirect("ourgames.jsp");
			}
			else{
				response.sendRedirect("test.html");
			}
		}
		else{
			response.sendRedirect("registration.jsp");
		}
	}
}
