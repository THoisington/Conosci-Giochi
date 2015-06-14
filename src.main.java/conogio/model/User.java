package conogio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_TABLE")
public class User implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String password;
	private String genre;
	private String playerNum; 
	private String graphics;
	private String perspective;
	private String publisher;
	private String setting;
	private String focus;
	
	public User(){
	}
	
//	public User(String attr[]){
//		
//		genre = attr[0];
//		playerNum = attr[1];
//		graphics = attr[2];
//		perspective = attr[3];
//		publisher = attr[4];
//		setting = attr[5];
//		focus = attr[6];
//		
//		//TODO: This isn't correct. You need to set each of these by pulling all the values from the database and comparing to see highest number 
//
//	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getGenre(){
		return genre;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public String getPlayerNum(){
		return this.playerNum;
	}
	
	public void setPlayerNum(String playerNum){
		this.playerNum = playerNum;
	}
	
	public String getGraphics(){
		return this.graphics;
	}
	
	public void setGraphics(String graphics){
		this.graphics = graphics;
	}

	public String getPerspective(){
		return this.perspective;
	}
	
	public void setPerspective(String perspective){
		this.perspective = perspective; 
	}
	
	public String getPublisher(){
		return this.publisher;
	}
	
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public String getSetting(){
		return this.setting;
	}
	
	public void setSetting(String setting){
		this.setting = setting;
	}
	
	public String getFocus(){
		return this.focus;
	}
	
	public void setFocus(String focus){
		this.focus = focus;
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
}
