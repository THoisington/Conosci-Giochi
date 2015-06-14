package conogio.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conogio.model.*;

public class RecommenderServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		String genre = request.getParameter("genre");
		String playerNum = request.getParameter("playerNum");
		String publisher = request.getParameter("publisher");
		String perspective = request.getParameter("perspective");
		String setting = request.getParameter("setting");
		String graphics = request.getParameter("graphics");
		String focus = request.getParameter("focus");
		
//		PrintWriter writer = response.getWriter();
//		writer.println("Here they are  " + genre + "  " + playerNum + " " + publisher + "  " + setting + 
//				"  " + perspective + "  " + graphics + "  " + focus);
//		writer.flush();
		
		User user = (User) request.getSession().getAttribute("user");
		User restore = user;
		
		//I am a little worried about this, but I don't have a connection with hibernate and java should be pass by value
		if(!genre.equals("Genre")&&!genre.equalsIgnoreCase(user.getGenre())){
			user.setGenre(genre.toLowerCase());
		}
		
		if(!playerNum.equals("Player Number")&&!playerNum.equalsIgnoreCase(user.getPlayerNum())){
			user.setPlayerNum(playerNum.toLowerCase());
		}
		
		if(!publisher.equals("Publisher")&&!publisher.equalsIgnoreCase(user.getPublisher())){
			user.setPublisher(publisher.toLowerCase());
		}
		
		if(!perspective.equals("Perspective")&&!perspective.equalsIgnoreCase(user.getPerspective())){
			user.setPerspective(perspective.toLowerCase());
		}
		
		if(!setting.equals("Setting")&&!setting.equalsIgnoreCase(user.getSetting())){
			user.setSetting(setting.toLowerCase());
		}
		
		if(!graphics.equals("Graphics")&&!graphics.equalsIgnoreCase(user.getGraphics())){
			user.setGraphics(graphics.toLowerCase());
		}
		
		if(!focus.equals("Focus")&&!focus.equalsIgnoreCase(user.getFocus())){
			user.setFocus(focus.toLowerCase());
		}
		
		request.getSession().setAttribute("user",restore);
		
		Recommender recommender = new Recommender(user);
		Game[] results = new Game[3];
		results = recommender.recommend();
		request.getSession().setAttribute("results", results);
		response.sendRedirect("results.jsp");

}
}
