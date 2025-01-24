package com.fightingnerds.sindifacil.models;

import jakarta.persistence.*;

@Entity
public class Service extends DateAudit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@ManyToOne(fetch = FetchType.LAZY)
	private ServiceCategory category;
}
