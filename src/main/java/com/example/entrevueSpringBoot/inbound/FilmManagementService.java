package com.example.entrevueSpringBoot.inbound;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.core.FilmDao;
import com.example.entrevueSpringBoot.core.FilmEntity;

/**
 * 
 * @author ccornea
 *
 */
@Service
public class FilmManagementService {
	
	private final FilmDao filmDao;
	
	@Autowired
	public FilmManagementService(FilmDao filmDao) {
		this.filmDao = filmDao;
	}

	/**
	 * 
	 * @param filmDto
	 * @return
	 */
	@Transactional
	public FilmEntity createFilm(FilmDto filmDto) {
		
		FilmEntity film = new FilmEntity();
		BeanUtils.copyProperties(filmDto, film);
		return filmDao.persist(film);
	}
}
