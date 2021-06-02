package com.example.entrevueSpringBoot.builder;

import com.example.entrevueSpringBoot.core.FilmEntity;

public class FilmEntityBuilder {
	
	private static final Long ID = 1L;
	private static final String TITRE= "Star Wars: The Empire Struckes Back";
	private static final String DESCRIPTION = "Darth Vader is adamant about turning Luke Skywalker to the dark side.";

	public static FilmEntity build() {
		
		FilmEntity film = new FilmEntity();
		film.setId(ID);
		film.setTitre(TITRE);
		film.setDescription(DESCRIPTION);
		film.setActeurs(ActeurEntityBuilder.buildActeurList());
		
		return film;
	}
}
