package com.fightingnerds.sindifacil.domain.model;

import com.fightingnerds.sindifacil.domain.model.servicerequest.ServiceRequest;

import jakarta.persistence.*;

@Entity
public class ServiceRequestReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private ServiceRequest serviceRequest;

	@OneToOne
	@JoinColumn(name = "reviewer_id", nullable = false)
	private JointOwner reviewer;

	@Column(name = "rating", nullable = false)
	private Long rating;

	@Column(name = "review", nullable = false)
	private String review;
}
