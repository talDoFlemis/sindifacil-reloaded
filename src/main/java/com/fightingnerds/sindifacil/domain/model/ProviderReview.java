package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class ProviderReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Provider provider;

	private Float punctuality;

	private Float proficiency;

	private Float cost;

	private String review;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reviewer_id", nullable = false)
	private JointOwner reviewer;
}
