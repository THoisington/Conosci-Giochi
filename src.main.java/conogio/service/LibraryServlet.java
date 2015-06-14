package conogio.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.model.*;
import conogio.utils.HibernateUtil;

public class LibraryServlet extends HttpServlet{

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException{
		

	User user = (User) request.getSession().getAttribute("user");	
		
	List<Game> tempList = null;
	ArrayList<Game> altroList = new ArrayList<Game>();
	Game[] games = new Game[70];
	ArrayList<Library> userGames = new ArrayList();
	games = (Game[]) request.getSession().getAttribute("games");
	

	
	
	Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
	Transaction tx = null;
    
	try {
		tx = session.getTransaction();
		tx.begin();
		
		Query query = session.createQuery("from Game");
		tempList = query.list();
		
		Query query2 = session.createQuery("from Library where userid='"
				+ user.getId() + "'");
		userGames = (ArrayList<Library>) query2.list();

		tx.commit();
		} catch (Exception e) {
		if (tx != null) {
			tx.rollback();
		}
		e.printStackTrace();
		} finally {
		}
	
	// clear page (maybe done in javascript) 
	for(Game curr: games){
		for(int i = 0; i < userGames.size(); i++){
			if(userGames.get(i).getGameID().equals(curr.getId())){
				altroList.add(curr);
			}
		}	
	}
	Game[] sendToLibrary = new Game[altroList.size()]; 
	altroList.toArray(sendToLibrary);
	request.getSession().setAttribute("library", sendToLibrary );
	response.sendRedirect("library.jsp");
	return;
	}
}
