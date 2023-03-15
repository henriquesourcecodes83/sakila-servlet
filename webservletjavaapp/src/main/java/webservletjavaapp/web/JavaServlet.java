package webservletjavaapp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webservletjavaapp.dao.FilmActorDao;
import webservletjavaapp.model.FilmActor;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/javaservlet")
public class JavaServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter writer = resp.getWriter();
		
		FilmActorDao filmActorDAo = new FilmActorDao();
		
		List<FilmActor> films = filmActorDAo.getFilmActorListById(1);
		
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>");
		writer.println("</title>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("<table>");
		
		writer.println("<tr>");		
		
		writer.println("<td>first_name</td>");
		writer.println("<td>last_name</td>");
		writer.println("<td>title</td>");
		writer.println("<td>description</td>"); 	
		
		writer.println("</tr>");
		
		for(FilmActor c : films) {
			
			writer.println("<tr>");
			
			writer.println("<td>" + c.getFirst_name() + "</td>");
			writer.println("<td>" + c.getLast_name() + "</td>");
			writer.println("<td>" + c.getTitle() + "</td>");
			writer.println("<td>" + c.getDescription() + "</td>");
			
			writer.println("</tr>");
			
					
		}
		writer.println("</table>");
		
		writer.println("</body>");
		
		writer.println("</html>");
		
	}
}
