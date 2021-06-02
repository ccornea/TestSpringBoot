package com.example.entrevueSpringBoot.inbound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author ccornea
 *
 */
@RestController
@RequestMapping("api/film")
public class FilmCreateController {
	
	private final FilmManagementService filmManagementService;
	
	@Autowired
	public FilmCreateController(FilmManagementService filmManagementService) {
		
		this.filmManagementService = filmManagementService;
	}
	
	/**
	 * 
	 * @param filmDto
	 * @return
	 */
	@PostMapping(consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<FilmDto> createNewFilm(@RequestBody FilmDto filmDto) {
		
		filmManagementService.createFilm(filmDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(filmDto);
	}

}
