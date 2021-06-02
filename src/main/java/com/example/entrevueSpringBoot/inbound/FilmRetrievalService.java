package com.example.entrevueSpringBoot.inbound;

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
public class FilmRetrievalService {
	
	private final FilmDao filmDao;

	@Autowired
	public FilmRetrievalService(FilmDao filmDao) {
		this.filmDao = filmDao;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public FilmDto buildDtoFromFilmId(Long id) {
		
		FilmEntity film = filmDao.findById(id);
		FilmDto dto = new FilmDto();
		BeanUtils.copyProperties(film, dto);
		
		return dto;
	}
}
