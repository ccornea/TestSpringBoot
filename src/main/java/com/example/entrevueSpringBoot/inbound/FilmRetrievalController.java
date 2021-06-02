package com.example.entrevueSpringBoot.inbound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ccornea
 *
 */
@RestController
@RequestMapping("api/film/{id}")
public class FilmRetrievalController {
	
	private final FilmRetrievalService filmRetrievalService;
	
	@Autowired
	public FilmRetrievalController(FilmRetrievalService filmRetrievalService) {
		this.filmRetrievalService = filmRetrievalService;
	}

	/**
	 * 
	 * @param filmId
	 * @return
	 */
	@GetMapping
	public @ResponseBody ResponseEntity<FilmDto> retrieveFilm(@PathVariable(value="id") Long filmId) {
		
		return ResponseEntity.ok(filmRetrievalService.buildDtoFromFilmId(filmId));
	}
}
