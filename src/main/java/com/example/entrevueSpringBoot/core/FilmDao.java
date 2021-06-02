package com.example.entrevueSpringBoot.core;

import org.springframework.stereotype.Repository;

import com.example.entrevueSpringBoot.builder.FilmEntityBuilder;

/**
 * 
 * @author ccornea
 *
 */
@Repository
public class FilmDao {
	
	public FilmEntity findById(Long id) {
		
		return FilmEntityBuilder.build();
	}
	
	public FilmEntity persist(FilmEntity film) {
		
		return film;
	}
}
