package com.example.entrevueSpringBoot.core;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ccornea
 *
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {

	@Id
	private Long id;
}
