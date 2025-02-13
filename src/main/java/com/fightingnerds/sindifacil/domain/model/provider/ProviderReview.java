package com.fightingnerds.sindifacil.domain.model.provider;

import com.fightingnerds.sindifacil.domain.model.user.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProviderReview {
	private Long id;
	private Provider provider;
	private Float punctuality;
	private Float proficiency;

	private Float cost;

	private String review;
	private User reviewer;
}
