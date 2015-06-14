package conogio.service;

import conogio.model.User;
import conogio.utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class LoginService {

	public boolean authenticate(String userId, String password) {
		User user = getUserByUserId(userId);
		if (user != null && user.getUserName().equals(userId)
				&& user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public User getUserByUserId(String userId) {
		Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		Transaction tx = null;
		User user = null;
		try {
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from User where userName='"
					+ userId + "'");
			user = (User) query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
		}
		return user;
	}

//	public List<User> getListOfUsers() {
//		List<User> list = new ArrayList<User>();
//		Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.getTransaction();
//			tx.begin();
//			list = session.createQuery("from User").list();
//			tx.commit();
//		} catch (Exception e) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//		}
//		return list;
//	}
	
	public User createUser(String userName, String password){
		User user = new User(); //Is =null better here?
		user.setUserName(userName);
		user.setPassword(password);
		
		return user;
	}
}
