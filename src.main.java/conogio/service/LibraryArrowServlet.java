package conogio.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LibraryArrowServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException{

	String direction = request.getParameter("direction");
	String source = request.getParameter("source");
	String incomingRecord = request.getParameter("record");
	int record = Integer.parseInt(incomingRecord);
	
	int indexL = 0;
	Integer workaroundL = null;
	if(source.equals("lib")){
		if(direction.equals("next")){
			if(record == 60){
				record = 0;
			}
			else{
				record+=15;
			}
		}
		else if(direction.equals("prev")){
			if(record == 0){
				record = 60;
			}
			else{
				record-=15;
			}
		}
	}
	indexL = record;
	workaroundL = Integer.valueOf(indexL);

	request.getSession().setAttribute("indexLib", indexL);
	response.sendRedirect("library.jsp");
	return;
}
}
