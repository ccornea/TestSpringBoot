package com.example.entrevueSpringBoot.builder;

import java.util.Arrays;
import java.util.List;

import com.example.entrevueSpringBoot.core.ActeurEntity;

public class ActeurEntityBuilder {

	private static final Long ACTEUR_ONE_ID = 2L;
	private static final String ACTEUR_ONE_NOM= "Ford";
	private static final String ACTEUR_ONE_PRENOM = "Harrison";
	
	private static final Long ACTEUR_TWO_ID = 3L;
	private static final String ACTEUR_TWO_NOM = "Hamill";
	private static final String ACTEUR_TWO_PRENOM = "Mark";
	
	public static List<ActeurEntity> buildActeurList() {
		
		return Arrays.asList(
				build(ACTEUR_ONE_ID, ACTEUR_ONE_NOM, ACTEUR_ONE_PRENOM), 
				build(ACTEUR_TWO_ID, ACTEUR_TWO_NOM, ACTEUR_TWO_PRENOM));
	}
	
	private static ActeurEntity build(Long id, String nom, String prenom) {
		
		ActeurEntity acteur = new ActeurEntity();
		acteur.setId(id);
		acteur.setNom(nom);
		acteur.setPrenom(prenom);
		
		return acteur;
	}
}
