package conogio.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import conogio.utils.HibernateUtil;
import conogio.model.*;

public class AddGamesServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException{
		
		String direction = request.getParameter("direction");
		String source = request.getParameter("source");
		String incomingRecord = request.getParameter("record");
		int record = Integer.parseInt(incomingRecord);
		
		int indexL = 0;
		Integer workaroundL = null;
		if(source.equals("add")){
			if(direction.equals("next")){
				if(record == 70){
					record = 0;
				}
				else{
					record+=10;
				}
			}
			else if(direction.equals("prev")){
				if(record == 0){
					record = 70;
				}
				else{
					record-=10;
				}
			}
		}
		indexL = record;
		workaroundL = Integer.valueOf(indexL);
	
		request.getSession().setAttribute("index", indexL);
		response.sendRedirect("ourgames.jsp");
	}
}
