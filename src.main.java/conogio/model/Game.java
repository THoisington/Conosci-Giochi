package conogio.model;
import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAME_TABLE")
public class Game implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String genre;
	private String playerNum; 
	private String graphics;
	private String perspective; 
	private String publisher; 
	private String setting; 
	private String focus;
	private String title;
	private String cover;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	private ArrayList<Integer> inCommon = new ArrayList<>();
	private double dice;
	
	public Game(){
	}
	
	public Game(String attr[]){
	//TODO create a table with this information that links to the larger table with all the user numbers and we update the smaller table when new games are rated 
		genre = attr[0];
		playerNum = attr[1];
		graphics = attr[2];
		perspective = attr[3];
		publisher = attr[4];
		setting = attr[5];
		focus = attr[6];
		dice = 0;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(String playerNum) {
		this.playerNum = playerNum;
	}

	public String getGraphics() {
		return graphics;
	}

	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}

	public String getPerspective() {
		return perspective;
	}

	public void setPerspective(String perspective) {
		this.perspective = perspective;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public String getFocus() {
		return focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public void addSimilarity(int x){
		this.inCommon.add(x);
	}
	
	public int[] getSimilarity(){
		int[] results = new int[inCommon.size()];
		
		for(int i=0; i<inCommon.size(); i++){
			results[i] = inCommon.get(i);
			//Very Strange unless you then reset inCommon
		}
		
		return results;
	}
	
	public void setDice(double x){
		this.dice = x;
	}
	
	public double getDice(){
		return this.dice;
	}
	
}
