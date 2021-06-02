package com.example.entrevueSpringBoot.core;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author ccornea
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class ActeurEntity extends AbstractEntity {
	
	private String nom;
	
	private String prenom;
}
