package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class ProviderReview extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Provider provider;

	private Float punctuality;

	private Float proficiency;

	private Float cost;

	private String review;
}
