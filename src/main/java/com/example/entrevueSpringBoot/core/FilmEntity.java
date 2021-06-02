package com.example.entrevueSpringBoot.core;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author ccornea
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
public class FilmEntity extends AbstractEntity {
	
	private String titre;
	
	private String description;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
	@JoinTable(name = "FILM_ACTEURS_LIST", joinColumns = @JoinColumn(name = "FILM_ID"), inverseJoinColumns = @JoinColumn(name = "ACTEUR_ID"))
	private List<ActeurEntity> acteurs; 
}
