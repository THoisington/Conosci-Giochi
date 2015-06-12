package conogio.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.utils.HibernateUtil;

public class Recommender {
	
	private Game game1, game2, game3, temp;
	private User person; 
	
	public Recommender(User x){
		person = x; 
	}
	
	public Game[] recommend(){
		
		Game[] results = new Game[3];
		List<Game> tempList;
		Game[] gameList = new Game[70];
		ArrayList<Library> userGames = new ArrayList();
		boolean played = false;
		
		
		Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		Transaction tx = null;
	    
		try {
			tx = session.getTransaction();
			tx.begin();
			
			Query query = session.createQuery("from Game");
			tempList = query.list();
			
			Query query2 = session.createQuery("from Library where userid='"
					+ person.getId() + "'");
			userGames = (ArrayList<Library>) query2.list();
			tempList.toArray(gameList);

			tx.commit();
			} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
			} finally {
			}
		
		for(Game curr: gameList){
			temp = curr;
			
			for(int i = 0; i < userGames.size(); i++){
				if(userGames.get(i).getGameID().equals(temp.getId())){
					played = true;
				}
			}
			if(played == false){
			if(game1 == null){
				temp.setDice(diceCoeff());
				game1 = temp;
			}
			else if(game2 == null){
				temp.setDice(diceCoeff());
				game2 = temp;
			}
			else if(game3 == null){
				temp.setDice(diceCoeff());
				game3 = temp;
			}
			else{
				temp.setDice(diceCoeff());
				if(temp.getDice()>game1.getDice()){
					game3 = game2;
					game2 = game1;
					game1 = temp;
				}
				else if(temp.getDice()>game2.getDice()){
					game3 = game2;
					game2 = temp;
				}
				else if(temp.getDice()>game3.getDice()){
					game3 = temp;
				}
			}}
			else{
				played = false;
			}
			
			temp = null;
		}
		
		results[0] = game1;
		results[1] = game2;
		results[2] = game3;
		
		for(Game curr: gameList){
			curr.setDice(0.0);
		}
	
		return results; 
	}

	public double diceCoeff(){
		int intersection = 0;
		
		if(person.getGenre().equals(temp.getGenre())){ 
			intersection++;
//			temp.addSimilarity(0);
		}
		if(person.getPlayerNum().equals(temp.getPlayerNum())){ 
			intersection++;
//			temp.addSimilarity(1);
		}
		if(person.getFocus().equals(temp.getFocus())){ 
			intersection++;
//			temp.addSimilarity(2);
		}
		if(person.getGraphics().equals(temp.getGraphics())){ 
			intersection++;
//			temp.addSimilarity(3);
		}
		if(person.getPerspective().equals(temp.getPerspective())){ 
			intersection++;
//			temp.addSimilarity(4);
		}
		if(person.getPublisher().equals(temp.getPublisher())){ 
			intersection++;
//			temp.addSimilarity(5);
		}
		if(person.getSetting().equals(temp.getSetting())){ 
			intersection++;
//			temp.addSimilarity(6);
		}

		double test = (2.0*intersection)/14.0;
		
		return test;
		
	}
	
}
