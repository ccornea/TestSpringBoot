package com.example.entrevueSpringBoot.inbound;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto {
	
	private Long id;
	private String titre;
	private String description;
	private List<ActeurDto> acteurs; 
}
