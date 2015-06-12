package conogio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.utils.HibernateUtil;

@Entity
@Table(name = "PREFERENCES_TABLE")
public class Preferences implements Serializable {
	
	@Id
	private Long userID;
	//Genres
	private Long adventure;
	private Long platformer;
	private Long action;
	private Long horror;
	private Long jrpg;
	private Long wrpg;
	private Long puzzle;
	private Long strategy;
	private Long sports;
	private Long shooter;
	
	
	//Perspective
	private Long side;
	private Long top;
	private Long first;
	private Long third;
	
	//Focus
	private Long story;
	private Long gameplay;
	private Long competition;
	private Long creation;
	private Long exploration;
	
	
	//Graphics
	private Long realistic;
	private Long pixel;
	private Long cartoon;
	private Long cel;
	private Long art;
	private Long otherGraphics;
	
	
	
	//PlayerNum
	private Long single;
	private Long multi;
	private Long mmo;
	
	//Publishers
	private Long nintendo;
	private Long sony;
	private Long indie;
	private Long ea;
	private Long ubisoft;
	private Long capcom;
	private Long namcobandai;
	private Long valve;
	private Long atlus;
	private Long otherPublisher;
	
	
	//Setting
	private Long global;
	private Long modern;
	private Long fantasy;
	private Long scifi;
	private Long nature;
	private Long apocalyptic;
	private Long otherSetting;
	
	
	//Max counts
	private Long maxGenre;
	private Long maxPerspective;
	private Long maxPublisher;
	private Long maxPlayerNum;
	private Long maxSetting;
	private Long maxGraphics;
	private Long maxFocus;
	
	public Preferences(){
		puzzle = action = adventure = horror = jrpg = wrpg = puzzle = strategy = shooter = platformer = sports = (long) 0;
        first = third = top = side = story = gameplay = competition = creation = exploration = (long) 0;
		pixel = realistic = cartoon = cel = art = otherGraphics = (long) 0;
		modern = fantasy = scifi = nature = global = apocalyptic = otherSetting = single = multi = mmo = (long) 0;
		puzzle = action = adventure = horror = jrpg = wrpg = puzzle = strategy = shooter = platformer = sports = (long) 0;
		sony = nintendo = indie = ea = ubisoft = capcom = namcobandai = valve = atlus = otherPublisher = (long) 0;
		maxGenre = maxPerspective = maxPublisher = maxPlayerNum = maxSetting = maxGraphics = maxFocus = (long) 0;
		
	}
	
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Long getScifi() {
		return scifi;
	}
	public void setScifi(Long scifi) {
		this.scifi = scifi;
	}
	public Long getStory() {
		return story;
	}
	public void setStory(Long story) {
		this.story = story;
	}
	public Long getRealistic() {
		return realistic;
	}
	public void setRealistic(Long realistic) {
		this.realistic = realistic;
	}
	public Long getThird() {
		return third;
	}
	public void setThird(Long third) {
		this.third = third;
	}
	public Long getSingle() {
		return single;
	}
	public void setSingle(Long single) {
		this.single = single;
	}
	public Long getSony() {
		return sony;
	}
	public void setSony(Long sony) {
		this.sony = sony;
	}
	public Long getGlobal() {
		return global;
	}
	public void setGlobal(Long global) {
		this.global = global;
	}
	public Long getAdventure() {
		return adventure;
	}
	public void setAdventure(Long adventure) {
		this.adventure = adventure;
	}

	public Long getPlatformer() {
		return platformer;
	}

	public void setPlatformer(Long platformer) {
		this.platformer = platformer;
	}

	public Long getAction() {
		return action;
	}

	public void setAction(Long action) {
		this.action = action;
	}

	public Long getHorror() {
		return horror;
	}

	public void setHorror(Long horror) {
		this.horror = horror;
	}

	public Long getJrpg() {
		return jrpg;
	}

	public void setJrpg(Long jrpg) {
		this.jrpg = jrpg;
	}

	public Long getWrpg() {
		return wrpg;
	}

	public void setWrpg(Long wrpg) {
		this.wrpg = wrpg;
	}

	public Long getPuzzle() {
		return puzzle;
	}

	public void setPuzzle(Long puzzle) {
		this.puzzle = puzzle;
	}

	public Long getStrategy() {
		return strategy;
	}

	public void setStrategy(Long strategy) {
		this.strategy = strategy;
	}

	public Long getSports() {
		return sports;
	}

	public void setSports(Long sports) {
		this.sports = sports;
	}

	public Long getShooter() {
		return shooter;
	}

	public void setShooter(Long shooter) {
		this.shooter = shooter;
	}

	public Long getSide() {
		return side;
	}

	public void setSide(Long side) {
		this.side = side;
	}

	public Long getTop() {
		return top;
	}

	public void setTop(Long top) {
		this.top = top;
	}

	public Long getFirst() {
		return first;
	}

	public void setFirst(Long first) {
		this.first = first;
	}

	public Long getGameplay() {
		return gameplay;
	}

	public void setGameplay(Long gameplay) {
		this.gameplay = gameplay;
	}

	public Long getCompetition() {
		return competition;
	}

	public void setCompetition(Long competition) {
		this.competition = competition;
	}

	public Long getCreation() {
		return creation;
	}

	public void setCreation(Long creation) {
		this.creation = creation;
	}

	public Long getExploration() {
		return exploration;
	}

	public void setExploration(Long exploration) {
		this.exploration = exploration;
	}

	public Long getPixel() {
		return pixel;
	}

	public void setPixel(Long pixel) {
		this.pixel = pixel;
	}

	public Long getCartoon() {
		return cartoon;
	}

	public void setCartoon(Long cartoon) {
		this.cartoon = cartoon;
	}

	public Long getCel() {
		return cel;
	}

	public void setCel(Long cel) {
		this.cel = cel;
	}

	public Long getArt() {
		return art;
	}

	public void setArt(Long art) {
		this.art = art;
	}

	public Long getOtherGraphics() {
		return otherGraphics;
	}

	public void setOtherGraphics(Long otherGraphics) {
		this.otherGraphics = otherGraphics;
	}

	public Long getMulti() {
		return multi;
	}

	public void setMulti(Long multi) {
		this.multi = multi;
	}

	public Long getMmo() {
		return mmo;
	}

	public void setMmo(Long mmo) {
		this.mmo = mmo;
	}

	public Long getNintendo() {
		return nintendo;
	}

	public void setNintendo(Long nintendo) {
		this.nintendo = nintendo;
	}

	public Long getIndie() {
		return indie;
	}

	public void setIndie(Long indie) {
		this.indie = indie;
	}

	public Long getEa() {
		return ea;
	}

	public void setEa(Long ea) {
		this.ea = ea;
	}

	public Long getUbisoft() {
		return ubisoft;
	}

	public void setUbisoft(Long ubisoft) {
		this.ubisoft = ubisoft;
	}

	public Long getCapcom() {
		return capcom;
	}

	public void setCapcom(Long capcom) {
		this.capcom = capcom;
	}

	public Long getNamcobandai() {
		return namcobandai;
	}

	public void setNamcobandai(Long namcobandai) {
		this.namcobandai = namcobandai;
	}

	public Long getValve() {
		return valve;
	}

	public void setValve(Long valve) {
		this.valve = valve;
	}

	public Long getAtlus() {
		return atlus;
	}

	public void setAtlus(Long atlus) {
		this.atlus = atlus;
	}

	public Long getOtherPublisher() {
		return otherPublisher;
	}

	public void setOtherPublisher(Long otherPublisher) {
		this.otherPublisher = otherPublisher;
	}

	public Long getModern() {
		return modern;
	}

	public void setModern(Long modern) {
		this.modern = modern;
	}

	public Long getFantasy() {
		return fantasy;
	}

	public void setFantasy(Long fantasy) {
		this.fantasy = fantasy;
	}

	public Long getNature() {
		return nature;
	}

	public void setNature(Long nature) {
		this.nature = nature;
	}

	public Long getApocalyptic() {
		return apocalyptic;
	}

	public void setApocalyptic(Long apocalyptic) {
		this.apocalyptic = apocalyptic;
	}

	public Long getOtherSetting() {
		return otherSetting;
	}

	public void setOtherSetting(Long otherSetting) {
		this.otherSetting = otherSetting;
	}


	public Long getMaxGenre() {
		return maxGenre;
	}

	public void setMaxGenre(Long maxGenre) {
		this.maxGenre = maxGenre;
	}

	public Long getMaxPerspective() {
		return maxPerspective;
	}

	public void setMaxPerspective(Long maxPerspective) {
		this.maxPerspective = maxPerspective;
	}

	public Long getMaxPublisher() {
		return maxPublisher;
	}

	public void setMaxPublisher(Long maxPublisher) {
		this.maxPublisher = maxPublisher;
	}

	public Long getMaxPlayerNum() {
		return maxPlayerNum;
	}

	public void setMaxPlayerNum(Long maxPlayerNum) {
		this.maxPlayerNum = maxPlayerNum;
	}

	public Long getMaxSetting() {
		return maxSetting;
	}

	public void setMaxSetting(Long maxSetting) {
		this.maxSetting = maxSetting;
	}

	public Long getMaxGraphics() {
		return maxGraphics;
	}

	public void setMaxGraphics(Long maxGraphics) {
		this.maxGraphics = maxGraphics;
	}

	public Long getMaxFocus() {
		return maxFocus;
	}

	public void setMaxFocus(Long maxFocus) {
		this.maxFocus = maxFocus;
	}

	public void update(Game x, boolean liked){
		String genre = x.getGenre();
		String focus = x.getFocus();
		String graphics = x.getGraphics();
		String perspective = x.getPerspective();
		String playerNum = x.getPlayerNum();
		String publisher = x.getPublisher();
		String setting = x.getSetting();
		
		if(liked == true){
		/* Genre */
		if(genre.equals("action")){
			this.setAction(action+1);
		}
		else if(genre.equals("adventure")){
			this.setAdventure(adventure+1);
		}
		else if(genre.equals("horror")){
			this.setHorror(horror+1);
		}
		else if(genre.equals("jrpg")){
			this.setJrpg(jrpg+1);
		}
		else if(genre.equals("wrpg")){
			this.setWrpg(wrpg+1);
		}
		else if(genre.equals("puzzle")){
			this.setPuzzle(puzzle+1);
		}
		else if(genre.equals("strategy")){
			this.setStrategy(strategy+1);
		}
		else if(genre.equals("shooter")){
			this.setShooter(shooter+1);
		}
		else if(genre.equals("platformer")){
			this.setPlatformer(platformer+1);
		}
		else if(genre.equals("sports")){
			this.setSports(sports+1);
		}
		
		/* Focus */
		if(focus.equals("story")){
			this.setStory(story+1);
		}
		else if(focus.equals("gameplay")){
			this.setGameplay(gameplay+1);
		}
		else if(focus.equals("competition")){
			this.setCompetition(competition+1);
		}
		else if(focus.equals("creation")){
			this.setCreation(creation+1);
		}
		else if(focus.equals("exploration")){
			this.setExploration(exploration+1);
		}
		
		/* Graphics */
		if(graphics.equals("realistic")){
			this.setRealistic(realistic+1);
		}
		else if(graphics.equals("pixel")){
			this.setPixel(pixel+1);
		}
		else if(graphics.equals("cartoon")){
			this.setCartoon(cartoon+1);
		}
		else if(graphics.equals("cel")){
			this.setCel(cel+1);
		}
		else if(graphics.equals("art")){
			this.setArt(art+1);
		}
		else if(graphics.equals("other")){
			this.setOtherGraphics(otherGraphics+1);
		}
		
		/* Perspective */
		if(perspective.equals("third")){
			this.setThird(third+1);
		}
		else if(perspective.equals("first")){
			this.setFirst(first+1);
		}
		else if(perspective.equals("top")){
			this.setTop(top+1);
		}
		else if(perspective.equals("side")){
			this.setSide(side+1);
		}
		
		
		/* Player Count */
		if(playerNum.equals("single")){
			this.setSingle(single+1);
		}
		if(playerNum.equals("multi")){
			this.setMulti(multi+1);
		}
		if(playerNum.equals("mmo")){
			this.setMmo(mmo+1);
		}
		
		/* Publisher */
		if(publisher.equals("sony")){
			this.setSony(sony+1);
		}
		else if(publisher.equals("nintendo")){
			this.setNintendo(nintendo+1);
		}
		else if(publisher.equals("indie")){
			this.setIndie(indie+1);
		}
		else if(publisher.equals("ea")){
			this.setEa(ea+1);
		}
		else if(publisher.equals("ubisoft")){
			this.setUbisoft(ubisoft+1);
		}
		else if(publisher.equals("capcom")){
			this.setCapcom(capcom+1);
		}
		else if(publisher.equals("namco bandai")){
			this.setNamcobandai(namcobandai+1);
		}
		else if(publisher.equals("valve")){
			this.setValve(valve+1);
		}
		else if(publisher.equals("atlus")){
			this.setAtlus(atlus+1);
		}
		else if(publisher.equals("other")){
			this.setOtherPublisher(otherPublisher+1);
		}
		
		/* Setting */
		if(setting.equals("global")){
			this.setGlobal(global+1);
		}
		else if(setting.equals("modern")){
			this.setModern(modern+1);
		}
		else if(setting.equals("fantasy")){
			this.setFantasy(fantasy+1);
		}
		else if(setting.equals("scifi")){
			this.setScifi(scifi+1);
		}
		else if(setting.equals("nature")){
			this.setNature(nature+1);
		}
		else if(setting.equals("apocalyptic")){
			this.setApocalyptic(apocalyptic+1);
		}
		else if(setting.equals("other")){
			this.setOtherSetting(otherSetting+1);
		}
		
		
		}
		else if(liked == false){
			/* Genre */
		if(genre.equals("action")){
			this.setAction(action-1);
		}
		else if(genre.equals("adventure")){
			this.setAdventure(adventure-1);
		}
		else if(genre.equals("horror")){
			this.setHorror(horror-1);
		}
		else if(genre.equals("jrpg")){
			this.setJrpg(jrpg-1);
		}
		else if(genre.equals("wrpg")){
			this.setWrpg(wrpg-1);
		}
		else if(genre.equals("puzzle")){
			this.setPuzzle(puzzle-1);
		}
		else if(genre.equals("strategy")){
			this.setStrategy(strategy-1);
		}
		else if(genre.equals("shooter")){
			this.setShooter(shooter-1);
		}
		else if(genre.equals("platformer")){
			this.setPlatformer(platformer-1);
		}
		else if(genre.equals("sports")){
			this.setSports(sports-1);
		}
		
		/* Focus */
		if(focus.equals("story")){
			this.setStory(story-1);
		}
		else if(focus.equals("gameplay")){
			this.setGameplay(gameplay-1);
		}
		else if(focus.equals("competition")){
			this.setCompetition(competition-1);
		}
		else if(focus.equals("creation")){
			this.setCreation(creation-1);
		}
		else if(focus.equals("exploration")){
			this.setExploration(exploration-1);
		}
		
		/* Graphics */
		if(graphics.equals("realistic")){
			this.setRealistic(realistic-1);
		}
		else if(graphics.equals("pixel")){
			this.setPixel(pixel-1);
		}
		else if(graphics.equals("cartoon")){
			this.setCartoon(cartoon-1);
		}
		else if(graphics.equals("cel")){
			this.setCel(cel-1);
		}
		else if(graphics.equals("art")){
			this.setArt(art-1);
		}
		else if(graphics.equals("other")){
			this.setOtherGraphics(otherGraphics-1);
		}
		
		/* Perspective */
		if(perspective.equals("third")){
			this.setThird(third-1);
		}
		else if(perspective.equals("first")){
			this.setFirst(first-1);
		}
		else if(perspective.equals("top")){
			this.setTop(top-1);
		}
		else if(perspective.equals("side")){
			this.setSide(side-1);
		}
		
		
		/* Player Count */
		if(playerNum.equals("single")){
			this.setSingle(single-1);
		}
		if(playerNum.equals("multi")){
			this.setMulti(multi-1);
		}
		if(playerNum.equals("mmo")){
			this.setMmo(mmo-1);
		}
		
		/* Publisher */
		if(publisher.equals("sony")){
			this.setSony(sony-1);
		}
		else if(publisher.equals("nintendo")){
			this.setNintendo(nintendo-1);
		}
		else if(publisher.equals("indie")){
			this.setIndie(indie-1);
		}
		else if(publisher.equals("ea")){
			this.setEa(ea-1);
		}
		else if(publisher.equals("ubisoft")){
			this.setUbisoft(ubisoft-1);
		}
		else if(publisher.equals("capcom")){
			this.setCapcom(capcom-1);
		}
		else if(publisher.equals("namco bandai")){
			this.setNamcobandai(namcobandai-1);
		}
		else if(publisher.equals("valve")){
			this.setValve(valve-1);
		}
		else if(publisher.equals("atlus")){
			this.setAtlus(atlus-1);
		}
		else if(publisher.equals("other")){
			this.setOtherPublisher(otherPublisher-1);
		}
		
		/* Setting */
		if(setting.equals("global")){
			this.setGlobal(global-1);
		}
		else if(setting.equals("modern")){
			this.setModern(modern-1);
		}
		else if(setting.equals("fantasy")){
			this.setFantasy(fantasy-1);
		}
		else if(setting.equals("scifi")){
			this.setScifi(scifi-1);
		}
		else if(setting.equals("nature")){
			this.setNature(nature-1);
		}
		else if(setting.equals("apocalyptic")){
			this.setApocalyptic(apocalyptic-1);
		}
		else if(setting.equals("other")){
			this.setOtherSetting(otherSetting-1);
		}
		}
		
	}
	
	public void checkProfile(User x){
		checkGenre(x);
		checkFocus(x);
		checkGraphics(x);
		checkPerspective(x);
		checkPlayerNum(x);
		checkPublisher(x);
		checkSetting(x);
	}
	
//	public User checkProfileRet(User x){
//		checkGenre(x);
//		checkFocus(x);
//		checkGraphics(x);
//		checkPerspective(x);
//		checkPlayerNum(x);
//		checkPublisher(x);
//		checkSetting(x);
//		return x;
//	}
	
	public void checkGenre(User x){
		String tempGenre = x.getGenre();
		Long maxGenre = this.getMaxGenre();
		Long[] genre = {action,adventure,horror,jrpg,wrpg,puzzle,strategy,shooter,platformer,sports};
		String[] genreStrings = {"action","adventure","horror","jrpg","wrpg","puzzle","strategy","shooter","platformer","sports"};
		int iterator = 0;		
		
		while(iterator<genre.length){
			if(genre[iterator] > maxGenre){
				tempGenre = genreStrings[iterator];
				this.setMaxGenre(genre[iterator]);
			}
			iterator++;
		}
		
		x.setGenre(tempGenre);
//		x.setGenre(genreStrings[iterator]);
	}
	
	public void checkFocus(User x){
		String tempFocus = x.getFocus();
		Long maxFocus = this.getMaxFocus();
		Long[] focus = {story,gameplay,competition,creation,exploration};
		String[] focusStrings = {"story","gameplay","competition","creation","exploration"};
		
		int iterator = 0;		
		
		while(iterator<focus.length){
			if(focus[iterator] > maxFocus){
				tempFocus = focusStrings[iterator];
				this.setMaxFocus(focus[iterator]);
			}
			iterator++;
		}
		
		x.setFocus(tempFocus);
	}
	
	public void checkGraphics(User x){
		String tempGraphics = x.getGraphics();
		Long maxGraphics = this.getMaxGraphics();
		Long[] graphics = {pixel,realistic,cartoon,cel,art,otherGraphics};
		String[] graphicsStrings = {"pixel","realistic","cartoon","cel","art","other"};
		
		int iterator = 0;		
		
		while(iterator<graphics.length){
			if(graphics[iterator] > maxGraphics){
				tempGraphics = graphicsStrings[iterator];
				this.setMaxGraphics(graphics[iterator]);
			}
			iterator++;
		}
		
		x.setGraphics(tempGraphics);
	}
	
	public void checkPerspective(User x){
		String tempPerspective = x.getPerspective();
		Long maxPerspective = this.getMaxPerspective();
		Long[] perspective = {first,third,top,side};
		String[] perspectiveStrings = {"first","third","top","side"};
		
		int iterator = 0;		
		
		while(iterator<perspective.length){
			if(perspective[iterator] > maxPerspective){
				tempPerspective = perspectiveStrings[iterator];
				this.setMaxPerspective(perspective[iterator]);
			}
			iterator++;
		}
		
		x.setPerspective(tempPerspective);
	}
	
	public void checkPlayerNum(User x){
		String tempPlayerNum = x.getPlayerNum();
		Long maxPlayerNum = this.getMaxPlayerNum();
		Long[] playerNum = {single,multi,mmo};
		String[] playerNumStrings = {"single","multi","mmo"};
		
		int iterator = 0;		
		
		while(iterator<playerNum.length){
			if(playerNum[iterator] > maxPlayerNum){
				tempPlayerNum = playerNumStrings[iterator];
				this.setMaxPlayerNum(playerNum[iterator]);
			}
			iterator++;
		}
		
		x.setPlayerNum(tempPlayerNum);
	}
	
	public void checkPublisher(User x){
		String tempPublisher = x.getPublisher();
		Long maxPublisher = this.getMaxPublisher();
		Long[] publisher = {sony,nintendo,indie,ea,ubisoft,capcom,namcobandai,valve,atlus,otherPublisher};
		String[] publisherStrings = {"sony","nintendo","indie","ea","ubisoft","capcom","namcobandai","valve","atlus","other"};
		
		int iterator = 0;		
		
		while(iterator<publisher.length){
			if(publisher[iterator] > maxPublisher){
				tempPublisher = publisherStrings[iterator];
				this.setMaxPublisher(publisher[iterator]);
			}
			iterator++;
		}
		
		x.setPublisher(tempPublisher);
	}
	
	public void checkSetting(User x){
		String tempSetting = x.getSetting();
		Long maxSetting = this.getMaxSetting();
		Long[] setting = {modern,fantasy,scifi,nature,global,apocalyptic,otherSetting};
		String[] settingStrings = {"modern","fantasy","scifi","nature","global","apocalyptic","other"};
		
		int iterator = 0;		
		
		while(iterator<setting.length){
			if(setting[iterator] > maxSetting){
				tempSetting = settingStrings[iterator];
				this.setMaxSetting(setting[iterator]);
			}
			iterator++;
		}
		
		x.setSetting(tempSetting);
	}
	
	public String retGenre(User x){
		String tempGenre = x.getGenre();
		Long maxGenre = this.getMaxGenre();
		Long[] genre = {action,adventure,horror,jrpg,wrpg,puzzle,strategy,shooter,platformer,sports};
		String[] genreStrings = {"action","adventure","horror","jrpg","wrpg","puzzle","strategy","shooter","platformer","sports"};
		int iterator = 0;		
		
		while(iterator<genre.length){
			if(genre[iterator] > maxGenre){
				tempGenre = genreStrings[iterator];
				this.setMaxGenre(genre[iterator]);
			}
			iterator++;
		}
		
		x.setGenre(tempGenre);
		return tempGenre;
//		x.setGenre(genreStrings[iterator]);
	}
	
	public String retFocus(User x){
		String tempFocus = x.getFocus();
		Long maxFocus = this.getMaxFocus();
		Long[] focus = {story,gameplay,competition,creation,exploration};
		String[] focusStrings = {"story","gameplay","competition","creation","exploration"};
		
		int iterator = 0;		
		
		while(iterator<focus.length){
			if(focus[iterator] > maxFocus){
				tempFocus = focusStrings[iterator];
				this.setMaxFocus(focus[iterator]);
			}
			iterator++;
		}
		
		x.setFocus(tempFocus);
		return tempFocus;
	}
	
	public String retGraphics(User x){
		String tempGraphics = x.getGraphics();
		Long maxGraphics = this.getMaxGraphics();
		Long[] graphics = {pixel,realistic,cartoon,cel,art,otherGraphics};
		String[] graphicsStrings = {"pixel","realistic","cartoon","cel","art","other"};
		
		int iterator = 0;		
		
		while(iterator<graphics.length){
			if(graphics[iterator] > maxGraphics){
				tempGraphics = graphicsStrings[iterator];
				this.setMaxGraphics(graphics[iterator]);
			}
			iterator++;
		}
		
		x.setGraphics(tempGraphics);
		return tempGraphics;
	}
	
	public String retPerspective(User x){
		String tempPerspective = x.getPerspective();
		Long maxPerspective = this.getMaxPerspective();
		Long[] perspective = {first,third,top,side};
		String[] perspectiveStrings = {"first","third","top","side"};
		
		int iterator = 0;		
		
		while(iterator<perspective.length){
			if(perspective[iterator] > maxPerspective){
				tempPerspective = perspectiveStrings[iterator];
				this.setMaxPerspective(perspective[iterator]);
			}
			iterator++;
		}
		
		x.setPerspective(tempPerspective);
		return tempPerspective;
	}
	
	public String retPlayerNum(User x){
		String tempPlayerNum = x.getPlayerNum();
		Long maxPlayerNum = this.getMaxPlayerNum();
		Long[] playerNum = {single,multi,mmo};
		String[] playerNumStrings = {"single","multi","mmo"};
		
		int iterator = 0;		
		
		while(iterator<playerNum.length){
			if(playerNum[iterator] > maxPlayerNum){
				tempPlayerNum = playerNumStrings[iterator];
				this.setMaxPlayerNum(playerNum[iterator]);
			}
			iterator++;
		}
		
		x.setPlayerNum(tempPlayerNum);
		return tempPlayerNum;
	}
	
	public String retPublisher(User x){
		String tempPublisher = x.getPublisher();
		Long maxPublisher = this.getMaxPublisher();
		Long[] publisher = {sony,nintendo,indie,ea,ubisoft,capcom,namcobandai,valve,atlus,otherPublisher};
		String[] publisherStrings = {"sony","nintendo","indie","ea","ubisoft","capcom","namcobandai","valve","atlus","other"};
		
		int iterator = 0;		
		
		while(iterator<publisher.length){
			if(publisher[iterator] > maxPublisher){
				tempPublisher = publisherStrings[iterator];
				this.setMaxPublisher(publisher[iterator]);
			}
			iterator++;
		}
		
		x.setPublisher(tempPublisher);
		return tempPublisher;
	}
	
	public String retSetting(User x){
		String tempSetting = x.getSetting();
		Long maxSetting = this.getMaxSetting();
		Long[] setting = {modern,fantasy,scifi,nature,global,apocalyptic,otherSetting};
		String[] settingStrings = {"modern","fantasy","scifi","nature","global","apocalyptic","other"};
		
		int iterator = 0;		
		
		while(iterator<setting.length){
			if(setting[iterator] > maxSetting){
				tempSetting = settingStrings[iterator];
				this.setMaxSetting(setting[iterator]);
			}
			iterator++;
		}
		
		x.setSetting(tempSetting);
		return tempSetting;
	}
	
}
