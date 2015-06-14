package conogio.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.model.*;
import conogio.service.*;

public class addToUserLib extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException{
		
		String title = request.getParameter("title");
		String tempLiked = request.getParameter("liked");
		boolean liked;
		
		RegistrationService regis = new RegistrationService();
		Game game = regis.getGameByTitle(title);
		User user = (User) request.getSession().getAttribute("user");
		User realUser;
		Library userL = new Library();
		
		if(tempLiked.equals("true")){
			liked = true;
		}
		else{
			liked = false;
		}
		
		Preferences userP = new Preferences();
		Session session3 = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		Transaction tx3 = null;
	    
		try {
			tx3 = session3.getTransaction();
			tx3.begin();
			
			Query query2 = session3.createQuery("from User where id='"
					+ user.getId() + "'");
			realUser = (User) query2.uniqueResult(); //Probably not needed
			
			userL.setUserID(realUser.getId());
			userL.setGameID(game.getId());
			userL.setLiked(liked);
			session3.save(userL);
			
			
			Query query = session3.createQuery("from Preferences where userid='"
					+ user.getId() + "'");
			userP = (Preferences) query.uniqueResult();
			
			userP.update(game, liked);
			realUser.setGenre(userP.retGenre(realUser));
			realUser.setPerspective(userP.retPerspective(realUser));
			realUser.setPublisher(userP.retPublisher(realUser));
			realUser.setPlayerNum(userP.retPlayerNum(realUser));
			realUser.setGraphics(userP.retGraphics(realUser));
			realUser.setFocus(userP.retFocus(realUser));
			realUser.setSetting(userP.retSetting(realUser));
			
			
			
			session3.save(userP);
			session3.update(realUser);
			
			tx3.commit();
			} catch (Exception e) {
			if (tx3 != null) {
				tx3.rollback();
			}
			e.printStackTrace();
			} finally {
			}
	}
	
}
