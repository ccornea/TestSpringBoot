package com.example.entrevueSpringBoot.inbound;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.entrevueSpringBoot.core.FilmDao;
import com.example.entrevueSpringBoot.core.FilmEntity;

@ExtendWith(MockitoExtension.class)
public class FilmRetrievalServiceTest {
	
	private static final Long ANY_ID = 123L;
	
	@InjectMocks
	private FilmRetrievalService filmRetrievalService;
	@Mock
	private FilmDao filmDao;
	@Mock
	private FilmEntity filmEntity;
	
	@BeforeEach
	public void arrange() {
		
		when(filmDao.findById(any())).thenReturn(filmEntity);
		when(filmEntity.getId()).thenReturn(ANY_ID);
	}
	
	@Test
	public void givenAFilmId_whenBuildDtoFromFilmId_thenFilmDaoIsCalledWithTheRightId() {
		
		filmRetrievalService.buildDtoFromFilmId(ANY_ID);
		
		verify(filmDao, times(1)).findById(ANY_ID);
	}

	@Test
	public void givenAFilmId_whenBuildDtoFromFilmId_thenFilmDtoIsBuiltWithTheRightId() {
		
		FilmDto filmDto = filmRetrievalService.buildDtoFromFilmId(ANY_ID);
		
		assertThat(filmDto.getId(), is(ANY_ID));
	}
}
