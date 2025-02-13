package com.fightingnerds.sindifacil.domain.model.service;

import lombok.Data;

@Data
public class Service {
	private Long id;
	private String name;
	private ServiceCategory category;
}
