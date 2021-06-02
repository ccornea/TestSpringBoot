package com.example.entrevueSpringBoot.inbound;

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
public class ActeurDto {

	private Long id;
	private String nom;
	private String prenom;
}
