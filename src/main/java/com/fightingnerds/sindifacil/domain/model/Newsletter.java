package com.fightingnerds.sindifacil.domain.model;

import jakarta.persistence.*;

@Entity
public class Newsletter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Condominium condominium;

	@Column(name = "text")
	private String richText;

	@ManyToOne(fetch = FetchType.LAZY)
	private NewsletterCategory category;
}
