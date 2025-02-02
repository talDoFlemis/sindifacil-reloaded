package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import com.fightingnerds.sindifacil.domain.model.newsletter.NewsletterCategory;
import jakarta.persistence.*;

@Entity
public class NewsletterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private CondominiumEntity condominium;

	@Column(name = "text")
	private String richText;

	@ManyToOne(fetch = FetchType.LAZY)
	private NewsletterCategoryEntity category;
}
