package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.service;

import lombok.Data;

@Data
public class UpdaterServiceRequest {
	private Long id;
	private String name;
	private String description;
	private Long categoryId;
}
