package conogio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRARY_TABLE")
public class Library implements Serializable{
	@Id
	@GeneratedValue
	private Long dummyID;
	private Long userID;
	private Long gameID;
	private boolean liked;
	
	
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Long getGameID() {
		return gameID;
	}
	public void setGameID(Long gameID) {
		this.gameID = gameID;
	}
	public boolean isLiked() {
		return liked;
	}
	public void setLiked(boolean liked) {
		this.liked = liked;
	}
	public Long getDummyID() {
		return dummyID;
	}
	public void setDummyID(Long dummyID) {
		this.dummyID = dummyID;
	}
	
}
