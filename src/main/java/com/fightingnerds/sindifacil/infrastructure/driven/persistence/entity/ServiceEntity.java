package com.fightingnerds.sindifacil.infrastructure.driven.persistence.entity;

import com.fightingnerds.sindifacil.domain.model.service.ServiceCategory;
import jakarta.persistence.*;

@Entity(name = "services")
public class ServiceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	private ServiceCategoryEntity category;
}
