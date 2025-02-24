package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import jakarta.persistence.*;

@Entity(name = "service_request_reviews")
public class ServiceRequestReviewEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private ServiceRequestEntity serviceRequest;

	@OneToOne
	@JoinColumn(name = "reviewer_id", nullable = false)
	private JointOwnerEntity reviewer;

	@Column(name = "rating", nullable = false)
	private Long rating;

	@Column(name = "review", nullable = false)
	private String review;
}
