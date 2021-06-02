package com.example.entrevueSpringBoot.inbound;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.entrevueSpringBoot.core.FilmDao;

@ExtendWith(MockitoExtension.class)
public class FilmManagementServiceTest {

	@InjectMocks
	private FilmManagementService filmManagementService;
	@Mock
	private FilmDao filmDao;
	
	@Test
	public void givenFilmDto_whenCreateNewFilm_thenFilmDaoIsCalled() {
		
		FilmDto filmDto = new FilmDto();
		
		filmManagementService.createFilm(filmDto);
		
		verify(filmDao, times(1)).persist(any());
	}
}
