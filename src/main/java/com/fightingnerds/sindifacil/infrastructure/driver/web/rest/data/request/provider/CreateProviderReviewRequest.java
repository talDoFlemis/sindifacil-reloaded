package com.fightingnerds.sindifacil.infrastructure.driver.web.rest.data.request.provider;

import lombok.Data;

@Data
public class CreateProviderReviewRequest {
	private Float punctuality;

	private Float proficiency;

	private Float cost;

	private String review;
}
