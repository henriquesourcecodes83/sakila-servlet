package webservletjavaapp.main;

import java.util.List;

import webservletjavaapp.dao.FilmActorDao;
import webservletjavaapp.model.FilmActor;

public class ApplicationClass {
	
	public static void main(String[] args) {
		
		FilmActorDao filmActorDAo = new FilmActorDao();
		
		List<FilmActor> films = filmActorDAo.getFilmActorListById(1);
		
		for(FilmActor c : films) {
			System.out.println(
					c.getFirst_name() 
					+ " " + c.getLast_name() 
					+ " " + c.getTitle() 
					+ " " + c.getDescription());
		}
	}
}
