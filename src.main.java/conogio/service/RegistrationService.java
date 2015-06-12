package conogio.service;
import conogio.model.Game;
import conogio.model.User;
import conogio.model.Library;
import conogio.model.Preferences;
import conogio.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class RegistrationService {

public Boolean titleSearch(String title){
	Game x = getGameByTitle(title);
	if(x.getTitle().equals(title)){
		return true;
	}
	else{
		return false;
	}
	
}

public Game getGameByTitle(String title){
	Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
	Transaction tx = null;
	Game x = new Game();
	try {
		tx = session.getTransaction();
		tx.begin();
		
		Query query = session.createQuery("from Game where Title= :title");
		query.setParameter("title",title);
		
		x = (Game) query.uniqueResult();

		tx.commit();
		} catch (Exception e) {
		if (tx != null) {
			tx.rollback();
		}
		e.printStackTrace();
		} finally {
		}

	return x;
}

public void addToDB(User x, Game y){
	
	Preferences userP = new Preferences();
	Library userL = new Library();
	
	Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
	Transaction tx = null;
	
	try {
		tx = session.getTransaction();
		tx.begin();
	
		x.setGenre(y.getGenre());
		x.setFocus(y.getFocus());
		x.setGraphics(y.getGraphics());
		x.setPerspective(y.getPerspective());
		x.setPlayerNum(y.getPlayerNum());
		x.setPublisher(y.getPublisher());
		x.setSetting(y.getSetting());
		session.save(x);
		
		tx.commit();
	} catch (Exception e) {
		if (tx != null) {
			tx.rollback();
		}
		e.printStackTrace();
	} finally {
	}
	
	userP.setUserID(x.getId());
	Session session8 = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
	Transaction tx8 = null;
	
	try {
		tx8 = session8.getTransaction();
		tx8.begin();
		
		//Stuff outlined in notebook
		userL.setUserID(x.getId());
		userL.setGameID(y.getId());
		userL.setLiked(true);
		session8.save(userL);
		
		userP.update(y, true);
		userP.checkProfile(x);
		session8.save(userP);

		tx8.commit();
		} catch (Exception e) {
		if (tx8 != null) {
			tx8.rollback();
		}
		e.printStackTrace();
		} finally {
		}
}
}
